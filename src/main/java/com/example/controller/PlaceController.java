package com.example.controller;

import com.example.common.Result;
import com.example.entity.Place;
import com.example.service.PlaceService;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Whhh
 * @description place
 * @date 2024-02-13
 */
@RestController
@RequestMapping(value = "/place")
public class PlaceController {

    @Resource
    private PlaceService placeService;


    /**
     * 刪除
     *
     * @author Whhh
     * @date 2024/02/13
     **/
    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable int id) {
        int res = (int) placeService.delete(id);
        return res > 0 ? Result.success() : Result.error();
    }

    /**
     * 批量刪除
     *
     * @author Whhh
     * @date 2024/02/13
     **/
    @DeleteMapping("/delete/batch")
    public Result delete(@RequestBody List<Integer> ids) {
        AtomicInteger res = new AtomicInteger();
        ids.forEach(id->{
            res.set((int) placeService.delete(id));
        });

        return res.get() > 0 ? Result.success() : Result.error();
    }


    /**
     * 新增和更新
     *
     * @author Whhh
     * @date 2024/02/13
     **/
    @RequestMapping("/insertAndUpdate")
    public Result update(@RequestBody Place place) {
        int res;
        if (StringUtil.isEmpty(place.getId())) {
            res = (int) placeService.insert(place);
        } else {
            res = (int) placeService.update(place);
        }
        return res > 0 ? Result.success() : Result.error();
    }

    /**
     * 查询 根据主键 id 查询
     *
     * @author Whhh
     * @date 2024/02/13
     **/
    @RequestMapping("/load")
    public Result load(int id) {
        return Result.success(placeService.load(id));
    }

    /**
     * 查询 分页查询
     *
     * @author Whhh
     * @date 2024/02/13
     **/
    @RequestMapping("/pageList")
    public Result selectPage(Place place,
                             @RequestParam(defaultValue = "1") Integer pageNum,
                             @RequestParam(defaultValue = "10") Integer pageSize) {
        PageInfo<Place> page = placeService.pageList(pageNum, pageSize);
        return Result.success(page);
    }

    /**
     * 查询 所有场地
     *
     * @author Whhh
     * @date 2024/02/13
     **/
    @RequestMapping("/selectAll")
    public Result selectAll() {
        return Result.success(placeService.selectAll());
    }

}