package com.example.service.impl;

import com.example.entity.Place;
import com.example.mapper.PlaceMapper;
import com.example.service.PlaceService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
/**
 * @description place
 * @author Whhh
 * @date 2024-02-13
 */
@Service
public class PlaceServiceImpl implements PlaceService {

    @Resource
    private PlaceMapper placeMapper;


    @Override
    public Object insert(Place place) {

        // valid
        if (place == null) {
           return null;
        }
        return placeMapper.insert(place);
    }


    @Override
    public Object delete(int id) {
        int ret = placeMapper.delete(id);
        return ret;
    }


    @Override
    public Object update(Place place) {
        int ret = placeMapper.update(place);
        return ret;
    }


    @Override
    public Place load(int id) {
        return placeMapper.load(id);
    }

    @Override
    public List<Place> selectAll() {
        return placeMapper.selectAll();
    }


    @Override
    public PageInfo<Place> pageList(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Place> places = placeMapper.selectAll();
        return PageInfo.of(places);
    }

}