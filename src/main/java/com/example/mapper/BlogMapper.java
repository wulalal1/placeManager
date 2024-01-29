package com.example.mapper;

import com.example.entity.Blog;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import javax.annotation.Resource;
import java.util.List;

public interface BlogMapper {
    int insert(Blog blog);

    /**
     * 删除
     */
    int deleteById(Integer id);

    /**
     * 修改
     */
    int updateById(Blog Blog);

    /**
     * 根据ID查询
     */
    Blog selectById(Integer id);

    /**
     * 查询所有
     */
    List<Blog> selectAll(Blog Blog);
    @Select("select * from blog where user_id = #{userId}")
    List<Blog> selectUserBlog(Integer useId);

    List<Blog> selectLike(Blog blog);

    List<Blog> selectCollect(Blog blog);

    List<Blog> selectComment(Blog blog);
}
