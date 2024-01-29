package com.example.controller;

import com.example.common.Result;
import com.example.service.PlaceService;
import com.github.pagehelper.PageInfo;

import com.example.entity.Place;
import com.example.mapper.PlaceMapper;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.util.List;

/**
 * 场地前端操作接口
 **/
@RestController
@RequestMapping("/place")
public class PlaceController {
    @Resource
    private PlaceService placeService;

    /**
     * 新增
     */
    @PostMapping("/add")
    public Result add(@RequestBody Place place) {
        placeService.add(place);
        return Result.success();
    }
    @GetMapping("/selectById")
    public Result selectById(@RequestParam Integer id) {
        Place place = placeService.selectById(id);
        return Result.success(place);
    }

    @PutMapping("/update")
    public Result update(@RequestBody Place place) {
        placeService.update(place);
        return Result.success();
    }

    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id) {
        placeService.deleteById(id);
        return Result.success();
    }

    @DeleteMapping("/delete/batch")
    public Result deleteBatch(@RequestBody List<Integer> ids) {
        placeService.deleteBatch(ids);
        return Result.success();
    }

    @GetMapping("/selectAll")
    public Result selectAll() {
        List<Place> list = placeService.selectAll();
        return Result.success(list);
    }

    /**
     * 分页查询
     */
    @GetMapping("/selectPage")
    public Result selectPage(Place place,
                             @RequestParam(defaultValue = "1") Integer pageNum,
                             @RequestParam(defaultValue = "10") Integer pageSize) {
        PageInfo<Place> page = placeService.selectPage(place, pageNum, pageSize);
        return Result.success(page);
    }

}