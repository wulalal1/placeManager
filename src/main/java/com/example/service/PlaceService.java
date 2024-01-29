package com.example.service;

import cn.hutool.core.util.ObjectUtil;
import com.example.common.enums.ResultCodeEnum;
import com.example.common.enums.RoleEnum;

import com.example.entity.Account;
import com.example.entity.Place;
import com.example.exception.CustomException;
import com.example.mapper.PlaceMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import com.example.common.enums.StatusEnum;

import javax.annotation.Resource;
import java.util.List;

/**
 * 预约业务处理
 **/
@Service
public class PlaceService {

    @Resource
    private PlaceMapper placeMapper;

    public void add(Place place) {
        // 1. 做一下重复性校验
        Place placeUser = placeMapper.selectByUsername(place.getUsername());
        if (ObjectUtil.isNotEmpty(placeUser)) {
            throw new CustomException(ResultCodeEnum.USER_EXIST_ERROR);
        }
        if (ObjectUtil.isEmpty(place.getPassword())) {
            place.setPassword("123456");
        }
        if (ObjectUtil.isEmpty(place.getRole())) {
            place.setRole(RoleEnum.PLACE.name());
        }
        if (ObjectUtil.isEmpty(place.getAvatar())) {
            place.setAvatar("http://localhost:9090/files/1697438073596-avatar.png");
        }
        place.setStatus(StatusEnum.CHECKING.status);
        placeMapper.insert(place);
    }

    public PageInfo<Place> selectPage(Place place, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Place> places = placeMapper.selectAll(place);
        return PageInfo.of(places);
    }
    public List<Place> selectAll() {
        return placeMapper.selectAll(new Place());
    }
    public Place selectById(Integer id) {
        return placeMapper.selectById(id);
    }

    public void update(Place place) {
        placeMapper.updateById(place);
    }

    public void deleteById(Integer id) {
        placeMapper.deleteById(id);
    }

    public void deleteBatch(List<Integer> list) {
        for (Integer id : list) {
            deleteById(id);
        }
    }


}