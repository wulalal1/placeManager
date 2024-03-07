package com.example.controller;

import com.example.common.Result;
import com.example.common.enums.ResultCodeEnum;
import com.example.entity.ApprovalModel;
import com.example.entity.Reservation;
import com.example.service.PlaceService;
import com.example.service.ReservationService;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * @author Whhh
 * @description reservation
 * @date 2024-02-15
 */
@RestController
@RequestMapping(value = "/reservation")
public class ReservationController {

    @Resource
    private ReservationService reservationService;


    /**
     * 新增
     *
     * @author Whhh
     * @date 2024/02/15
     **/
    @RequestMapping("/insert")
    public Object insert(Reservation reservation) {
        return reservationService.insert(reservation);
    }

    /**
     * 刪除
     *
     * @author Whhh
     * @date 2024/02/15
     **/
    @DeleteMapping("/delete/{id}")
    public Object delete(@PathVariable Integer id) {
        reservationService.delete(id);
        return Result.success();
    }

    /**
     * 批量删除
     */
    @DeleteMapping("/delete/batch")
    public Result deleteBatch(@RequestBody List<Integer> ids) {
        reservationService.deleteBatch(ids);
        return Result.success();
    }
    /**
     * 新增和更新
     *
     * @author Whhh
     * @date 2024/02/13
     **/
    @RequestMapping("/insertAndUpdate")
    public Result insertAndUpdate(@RequestBody Reservation reservation) {

        System.out.println(reservation);
        int res;
        if (StringUtil.isEmpty(reservation.getId())) {
            res = (int) reservationService.insert(reservation);
        } else {
            res = (int) reservationService.update(reservation);
        }
        return res > 0 ? Result.success() : Result.error();
    }

    /**
     * 预约的逻辑
     *
     * @author Whhh
     * @date 2024/02/13
     **/
    @RequestMapping("/insertPreOrder")
    public Result insertPreOrder(@RequestBody Reservation reservation) {
        int res = 0;
        Date startime = reservation.getStartTime();
        Date endtime = reservation.getEndTime();
        Date startime1 = null;
        Date endtime1 = null;
        List<Reservation> reservationList = reservationService.selectAll();
        for (int i = 0; i < reservationList.size(); i++) {
            startime1 = reservationList.get(i).getStartTime();
            endtime1 = reservationList.get(i).getEndTime();
            if ("1".equals(reservationList.get(i).getReservationStatus())) {
                if (startime.before(endtime1) && endtime.after(startime1)) {
                    return Result.error(ResultCodeEnum.PARAM_PLACESTATUS_ERROR.code, ResultCodeEnum.PARAM_PLACESTATUS_ERROR.msg);
                } else if (startime.compareTo(startime1) == 0 || endtime.compareTo(endtime1) == 0) {
                    return Result.error(ResultCodeEnum.PARAM_PLACESTATUS_ERROR.code, ResultCodeEnum.PARAM_PLACESTATUS_ERROR.msg);
                }
            }
        }
        if (StringUtil.isEmpty(reservation.getId())) {
            res = (int) reservationService.insert(reservation);
        }
        return res > 0 ? Result.success() : Result.error();
    }

    /**
     * 更新
     *
     * @author Whhh
     * @date 2024/02/15
     **/
    @RequestMapping("/update")
    public Object update(Reservation reservation) {
        return reservationService.update(reservation);
    }

    /**
     * 查询 根据主键 id 查询
     *
     * @author Whhh
     * @date 2024/02/15
     **/
    @RequestMapping("/load")
    public Object load(int id) {
        return reservationService.load(id);
    }

    /**
     * 查询 分页查询
     *
     * @author Whhh
     * @date 2024/02/13
     **/
    @RequestMapping("/pageList")
    public Result selectPage(@RequestParam(defaultValue = "1") Integer pageNum,
                             @RequestParam(defaultValue = "10") Integer pageSize) {
        PageInfo<Reservation> page = reservationService.pageList(pageNum, pageSize);
        return Result.success(page);
    }

    /**
     * 分页查询(我的预约)
     *
     * @author Whhh
     * @date 2024/02/13
     **/
    @RequestMapping("/myPageList")
    public Result searchMyPage(@RequestParam(defaultValue = "1") Integer pageNum,
                               @RequestParam(defaultValue = "10") Integer pageSize) {
        PageInfo<Reservation> page = reservationService.myPageList(pageNum, pageSize);
        return Result.success(page);

    }

    /**
     * 分页查询(历史预约)
     *
     * @author Whhh
     * @date 2024/02/13
     **/
    @RequestMapping("/hisPageList")
    public Result searchHisPage(@RequestParam(defaultValue = "1") Integer pageNum,
                                @RequestParam(defaultValue = "10") Integer pageSize) {
        PageInfo<Reservation> page = reservationService.hisPageList(pageNum, pageSize);
        return Result.success(page);

    }


    /**
     * 新增
     *
     * @author Whhh
     * @date 2024/02/15
     **/
    @PostMapping("/approvalYD")
    public Object insert(@RequestBody ApprovalModel approvalModel) {
        List<Reservation> list = Collections.synchronizedList(new ArrayList<>());
        /**
         * 通过主键查询审批数据
         */
        if (approvalModel.getIds() != null && approvalModel.getIds().size() > 0) {
            approvalModel.getIds().forEach(item -> {
                list.add(reservationService.load(Integer.valueOf(item)));
            });
        }
        /**
         * 通过id更新审批状态
         */
        if (list.size() > 0) {
            list.forEach(item -> {
                item.setReservationStatus(approvalModel.getStatus());
                reservationService.update(item);
            });
        }
        return Result.success();
    }


}