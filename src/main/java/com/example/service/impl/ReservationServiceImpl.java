package com.example.service.impl;

import com.example.entity.Reservation;
import com.example.mapper.ReservationMapper;
import com.example.service.ReservationService;
import com.example.utils.TokenUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Whhh
 * @description reservation
 * @date 2024-02-15
 */
@Service
public class ReservationServiceImpl implements ReservationService {

    @Resource
    private ReservationMapper reservationMapper;


    @Override
    public Object insert(Reservation reservation) {
        Integer id = TokenUtils.getCurrentUser().getId();
        reservation.setReservationStatus("0");
        if (id != null) {
            reservation.setUserId(id);
        }
        return reservationMapper.insert(reservation);
    }

    @Override
    public Object delete(int id) {
        return reservationMapper.delete(id);
    }


    @Override
    public Object update(Reservation reservation) {
        return reservationMapper.update(reservation);
    }

    @Override
    public List<Reservation> selectAll() {
        return reservationMapper.selectAll();
    }


    @Override
    public Reservation load(int id) {
        return reservationMapper.load(id);
    }

    @Override
    public Reservation selectByPlaceCode(String placeCode) {
        return reservationMapper.selectByPlaceCode(placeCode);
    }


    @Override
    public PageInfo<Reservation> pageList(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Reservation> reservationList = reservationMapper.selectAll();
        return PageInfo.of(reservationList);
    }


    @Override
    public PageInfo<Reservation> myPageList(Integer pageNum, Integer pageSize) {
        List<Reservation> reservationList = new ArrayList<>();
        Integer id = TokenUtils.getCurrentUser().getId();
        if (id != null) {
            PageHelper.startPage(pageNum, pageSize);
            reservationList = reservationMapper.selectMyOrder(id);
            return PageInfo.of(reservationList);
        }
        return PageInfo.of(reservationList);
    }


    @Override
    public PageInfo<Reservation> hisPageList(Integer pageNum, Integer pageSize) {
        List<Reservation> reservationList = new ArrayList<>();
        Integer id = TokenUtils.getCurrentUser().getId();
        if (id != null) {
            PageHelper.startPage(pageNum, pageSize);
            reservationList = reservationMapper.selectHisOrder(id);
        }
        return PageInfo.of(reservationList);
    }

}