package com.example.controller;

import com.example.common.Result;
import com.example.entity.Course;
import com.example.service.CourseService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Resource
    private CourseService courseService;

    @PostConstruct
    public void init() {
        System.out.println("✅ CourseController 初始化成功");
    }

    /**
     * 分页条件查询课程
     */
    @GetMapping("/selectPage")
    public Result selectPage(@RequestParam(defaultValue = "1") Integer pageNum,
                             @RequestParam(defaultValue = "5")Integer pageSize,
                             Course course) {
        PageInfo<Course> pageInfo = courseService.selectPage(pageNum, pageSize, course);
        return Result.success(pageInfo);
    }

    /**
     * 新增课程
     */
    @PostMapping("/add")
    public Result add(@RequestBody Course course) {
        courseService.add(course);
        return Result.success();
    }

    /**
     * 更新课程
     */
    @PutMapping("/update")
    public Result update(@RequestBody Course course) {
        courseService.updateById(course);
        return Result.success();
    }

    /**
     * 删除课程
     */
    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id) {
        courseService.deleteById(id);
        return Result.success();
    }
}
