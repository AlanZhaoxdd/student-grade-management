package com.example.service;

import com.example.entity.Course;
import com.example.mapper.CourseMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CourseService {

    @Resource
    private CourseMapper courseMapper;


    //total 为查询的总数  list为数据列表
    //pageNum 为当前页码  pageSize为每页的个数
    public PageInfo<Course> selectPage(Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum, pageSize);
        List<Course> courseList = courseMapper.selectAll();
        return PageInfo.of(courseList);
    }
}
