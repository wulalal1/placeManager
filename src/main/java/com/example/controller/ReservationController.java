package com.example.controller;

import com.example.common.Result;
import com.example.entity.Place;
import com.example.entity.Reservation;
import com.example.service.ReservationService;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @description reservation
 * @author Whhh
 * @date 2024-02-15
 */
@RestController
@RequestMapping(value = "/reservation")
public class ReservationController {

    @Resource
    private ReservationService reservationService;

    /**
     * 新增
     * @author Whhh
     * @date 2024/02/15
     **/
    @RequestMapping("/insert")
    public Object insert(Reservation reservation){
        return reservationService.insert(reservation);
    }

    /**
     * 刪除
     * @author Whhh
     * @date 2024/02/15
     **/
    @RequestMapping("/delete")
    public Object delete(int id){
        return reservationService.delete(id);
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
     * 更新
     * @author Whhh
     * @date 2024/02/15
     **/
    @RequestMapping("/update")
    public Object update(Reservation reservation){
        return reservationService.update(reservation);
    }

    /**
     * 查询 根据主键 id 查询
     * @author Whhh
     * @date 2024/02/15
     **/
    @RequestMapping("/load")
    public Object load(int id){
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
     * 新增
     * @author Whhh
     * @date 2024/02/15
     **/
    @RequestMapping("/approvalYD")
    public Object insert(@RequestBody List<String> ids){
        List<Reservation> list = new ArrayList<>();
        if(ids != null && ids.size() >0 ){
            ids.forEach(item->{
                list.add(reservationService.load(Integer.valueOf(item)));
            });
        }
        if(list != null && list.size() >0 ){
            list.forEach(item->{
                item.setReservationStatus("1");
                reservationService.update(item);
            });
        }
        return Result.success();
    }

}