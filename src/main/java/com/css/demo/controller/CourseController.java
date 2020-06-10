package com.css.demo.controller;

import com.css.demo.api.CourseApi;
import com.css.demo.service.CourseService;
import com.css.demo.util.CallRespose;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName CourseController
 * @Description 类描述
 * @Author 风住尘
 * @Date 2020/6/6 10:18
 **/
@Api(value = "课程API",tags = "1.0")
@RestController
@RequestMapping("/course")
public class CourseController implements CourseApi {
    @Autowired
    private CourseService courseService ;

    @Override
    @ApiOperation(value = "课程全查")
    @GetMapping("/find_all")
    public CallRespose findCourseAll() {
        return CallRespose.success(courseService.findCourseAll());
    }
}
