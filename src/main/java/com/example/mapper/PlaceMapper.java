package com.example.mapper;

import com.example.entity.Place;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 操作admin相关数据接口
*/
public interface PlaceMapper {

    void insert(Place place);

    @Select("select * from place where username = #{username}")
    Place selectByUsername(String username);

    List<Place> selectAll(Place place);

    void updateById(Place place);

    @Delete("delete from place where id = #{id}")
    void deleteById(Integer id);


    @Select("select * from place where id = #{id}")
    Place selectById(Integer id);

}