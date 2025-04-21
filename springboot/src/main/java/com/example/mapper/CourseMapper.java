package com.example.mapper;

import com.example.entity.Course;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CourseMapper {

    //根据id倒序
    @Select("select * from course order by id desc")
    List<Course> selectAll();
}
