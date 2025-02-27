package com.example.mapper;

import com.example.entity.Place;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * @description place
 * @author Whhh
 * @date 2024-02-13
 */
@Mapper
@Repository
public interface PlaceMapper {

    /**
     * 新增
     * @author Whhh
     * @date 2024/02/13
     **/
    int insert(Place place);

    /**
     * 刪除
     * @author Whhh
     * @date 2024/02/13
     **/
    int delete(int id);

    /**
     * 更新
     * @author Whhh
     * @date 2024/02/13
     **/
    int update(Place place);

    /**
     * 查询 根据主键 id 查询
     * @author Whhh
     * @date 2024/02/13
     **/
    Place load(int id);

    /**
     * 查询 分页查询
     * @author Whhh
     * @date 2024/02/13
     **/
    List<Place> pageList(int offset,int pageSize);

    /**
     * 查询 分页查询 count
     * @author Whhh
     * @date 2024/02/13
     **/
    int pageListCount(int offset,int pagesize);

    @Select("select * from place")
    List<Place> selectAll();
}