package com.css.demo.service;

import com.css.demo.pojo.NewCourse;
import com.css.demo.util.CallRespose;

import java.util.List;

/**
 * @InterfaceName CourseService
 * @Description 类描述
 * @Author 风住尘
 * @Date 2020/6/6 10:21
 **/
public interface CourseService {

    List<NewCourse> findCourseAll();
}
