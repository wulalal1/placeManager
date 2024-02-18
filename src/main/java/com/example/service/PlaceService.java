package com.example.service;

import com.example.entity.Place;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;
/**
 * @description place
 * @author Whhh
 * @date 2024-02-13
 */
public interface PlaceService {

    /**
     * 新增
     */
    public Object insert(Place place);

    /**
     * 删除
     */
    public Object delete(int id);

    /**
     * 更新
     */
    public Object update(Place place);

    /**
     * 根据主键 id 查询
     */
    public Place load(int id);

    /**
     * 查询所有场地
     */
    public List<Place> selectAll();

    /**
     * 分页查询
     */
    public PageInfo<Place> pageList(Integer pageNum, Integer pageSize);

}