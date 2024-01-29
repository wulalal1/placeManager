package com.example.controller;

import com.example.common.Result;
import com.example.entity.Blog;
import com.example.service.BlogService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/blog")
public class BlogController {
    @Resource
    private BlogService blogService;

    @PostMapping("/add")
    public Result add(@RequestBody Blog blog){
        blogService.add(blog);
        return Result.success();
    }
    @DeleteMapping("/delete/{id}")
    public Result deleteById(@PathVariable Integer id) {
        blogService.deleteById(id);
        return Result.success();
    }
    @DeleteMapping("/delete/batch")
    public Result deleteBatch(@RequestBody List<Integer> ids) {
        blogService.deleteBatch(ids);
        return Result.success();
    }
    @PutMapping("/update")
    public Result updateById(@RequestBody Blog blog) {
        blogService.updateById(blog);
        return Result.success();
    }
    @GetMapping("/selectById/{id}")
    public Result selectById(@PathVariable Integer id) {
        Blog blog = blogService.selectById(id);
        return Result.success(blog);
    }

    /**
     * 查询所有
     */
    @GetMapping("/selectAll")
    public Result selectAll(Blog blog ) {
        List<Blog> list = blogService.selectAll(blog);
        return Result.success(list);
    }
    /**分页查询**/
    @GetMapping("/selectPage")
    public Result selectPage(Blog blog,
                             @RequestParam(defaultValue = "1") Integer pageNum,
                             @RequestParam(defaultValue = "10") Integer pageSize) {
        PageInfo<Blog> page = blogService.selectPage(blog, pageNum, pageSize);
        return Result.success(page);
    }
    /**查询用户**/
    @GetMapping("/selectUser")
    public Result selectUser(Blog blog,
                             @RequestParam(defaultValue = "1") Integer pageNum,
                             @RequestParam(defaultValue = "10") Integer pageSize) {
        PageInfo<Blog> page = blogService.selectUser(blog, pageNum, pageSize);
        return Result.success(page);
    }
    /**
     * 博客榜单
     */
    @GetMapping("/selectTop")
    public Result selectTop() {
        List<Blog> list = blogService.selectTop();
        return Result.success(list);
    }
    /**
     * 博客推荐
     */
    @GetMapping("/selectRecommend/{blogId}")
    public Result selectRecommend(@PathVariable Integer blogId) {
        Set<Blog> blogSet = blogService.selectRecommend(blogId);
        return Result.success(blogSet);
    }
    /**
     * 分页查询当前用户点赞的博客列表
     */
    @GetMapping("/selectLike")
    public Result selectLike(Blog blog,
                             @RequestParam(defaultValue = "1") Integer pageNum,
                             @RequestParam(defaultValue = "10") Integer pageSize) {
        PageInfo<Blog> page = blogService.selectLike(blog, pageNum, pageSize);
        return Result.success(page);
    }

    /**
     * 分页查询当前用户收藏的博客列表
     */
    @GetMapping("/selectCollect")
    public Result selectCollect(Blog blog,
                                @RequestParam(defaultValue = "1") Integer pageNum,
                                @RequestParam(defaultValue = "10") Integer pageSize) {
        PageInfo<Blog> page = blogService.selectCollect(blog, pageNum, pageSize);
        return Result.success(page);
    }

    /**
     * 分页查询当前用户评论的博客列表
     */
    @GetMapping("/selectComment")
    public Result selectComment(Blog blog,
                                @RequestParam(defaultValue = "1") Integer pageNum,
                                @RequestParam(defaultValue = "10") Integer pageSize) {
        PageInfo<Blog> page = blogService.selectComment(blog, pageNum, pageSize);
        return Result.success(page);
    }

}
