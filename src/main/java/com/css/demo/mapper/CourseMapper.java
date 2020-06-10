package com.css.demo.mapper;

import com.css.demo.pojo.NewCourse;
import com.css.demo.util.CallRespose;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @InterfaceName CourseMapper
 * @Description 类描述
 * @Author 风住尘
 * @Date 2020/6/6 10:22
 **/
@Mapper
public interface CourseMapper {
    List<NewCourse> findCourseAll();
}
