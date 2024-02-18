package com.example.service.impl;
import com.example.entity.Reservation;
import com.example.mapper.ReservationMapper;
import com.example.service.ReservationService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * @description reservation
 * @author Whhh
 * @date 2024-02-15
 */
@Service
public class ReservationServiceImpl implements ReservationService {

    @Resource
    private ReservationMapper reservationMapper;


    @Override
    public Object insert(Reservation reservation) {

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
    public Reservation load(int id) {
        return reservationMapper.load(id);
    }


    @Override
    public PageInfo<Reservation> pageList(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Reservation> reservationList = reservationMapper.selectAll();
        return PageInfo.of(reservationList);
    }

}