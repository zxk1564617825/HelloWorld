package com.css.demo.service.impl;

import com.css.demo.mapper.CourseMapper;
import com.css.demo.pojo.NewCourse;
import com.css.demo.service.CourseService;
import com.css.demo.util.CallRespose;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName CourseServiceImpl
 * @Description 类描述
 * @Author 风住尘
 * @Date 2020/6/6 10:22
 **/
@Service
@Slf4j
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseMapper courseMapper ;

    @Override
    public List<NewCourse> findCourseAll() {
        List<NewCourse> list = courseMapper.findCourseAll();
        int x = 24 ;
        byte c = (byte) x;
        log.info("list  出参  {}",list);
        return list ;
    }
}
