package com.example.mapper;

import com.example.entity.Reservation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description reservation
 * @author Whhh
 * @date 2024-02-15
 */
@Mapper
@Repository
public interface ReservationMapper {

    /**
     * 新增
     * @author Whhh
     * @date 2024/02/15
     **/
    int insert(Reservation reservation);


    /**
     * 刪除
     * @author Whhh
     * @date 2024/02/15
     **/
    int delete(int id);

    /**
     * 更新
     * @author Whhh
     * @date 2024/02/15
     **/
    int update(Reservation reservation);

    /**
     * 查询 根据主键 id 查询
     * @author Whhh
     * @date 2024/02/15
     **/
    Reservation load(int id);

    /**
     * 查询 分页查询
     * @author Whhh
     * @date 2024/02/15
     **/
    List<Reservation> pageList(int offset, int pagesize);

    /**
     * 查询 分页查询 count
     * @author Whhh
     * @date 2024/02/15
     **/
    int pageListCount(int offset,int pagesize);

    @Select("select * from reservation")
    List<Reservation> selectAll();


    @Select("select * from reservation where place_code = #{placeCode}")
    Reservation selectByPlaceCode(String placeCode);

    @Select("select * from reservation where user_id = #{userId} order by end_time desc ")
    List<Reservation> selectMyOrder(int userid);

//    @Select("select * from reservation where end_time >= DATE_SUB(CURRENT_DATE(), INTERVAL 7 DAY) and user_id = #{userId} ")
    @Select("select * from reservation where end_time < CURRENT_DATE() and user_id = #{userId} order by end_time desc")
    List<Reservation> selectHisOrder(int userid);
}