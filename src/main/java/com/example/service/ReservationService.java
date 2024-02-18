package com.example.service;

import com.example.entity.Reservation;
import com.github.pagehelper.PageInfo;

import java.util.Map;

/**
 * @description reservation
 * @author Whhh
 * @date 2024-02-15
 */
public interface ReservationService {

    /**
     * 新增
     */
    public Object insert(Reservation reservation);

    /**
     * 删除
     */
    public Object delete(int id);

    /**
     * 更新
     */
    public Object update(Reservation reservation);

    /**
     * 根据主键 id 查询
     */
    public Reservation load(int id);


    public PageInfo<Reservation> pageList(Integer pageNum, Integer pageSize);

}