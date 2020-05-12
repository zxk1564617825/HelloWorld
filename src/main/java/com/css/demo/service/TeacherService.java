package com.css.demo.service;

import com.css.demo.pojo.Course;
import com.css.demo.pojo.Teacher;

import java.util.List;

/**
 * @InterfaceName TeacherService
 * @Description 类描述
 * @Author 风住尘
 * @Date 2020/5/9 15:55
 **/
public interface TeacherService {
    /**
     * @Description 课程全查
     * @Author 风住尘
     * @param
     * @return java.util.List<com.css.demo.pojo.Course>
     * @Date 2020/5/11 9:12
     */
    List<Course> findCourseAll();
    /**
     * @Description 教师全查
     * @Author 风住尘
     * @param
     * @return java.util.List<com.css.demo.pojo.Teacher>
     * @Date 2020/5/11 9:12
     */
    List<Teacher> findAll();
    /**
     * @Description 单查
     * @Author 风住尘
     * @param tid
     * @return com.css.demo.pojo.Teacher
     * @Date 2020/5/11 9:12
     */
    Teacher findOne(Integer tid);
    /**
     * @Description 添加
     * @Author 风住尘
     * @param teacher
     * @return boolean
     * @Date 2020/5/11 9:12
     */
    boolean insertOne(Teacher teacher);
    /**
     * @Description 修改
     * @Author 风住尘
     * @param teacher
     * @return boolean
     * @Date 2020/5/11 9:12
     */
    boolean updateOne(Teacher teacher);
    /**
     * @Description 单删
     * @Author 风住尘
     * @param tid
     * @return boolean
     * @Date 2020/5/11 9:12
     */
    boolean deleteOne(int tid);
    /**
     * @Description 批删
     * @Author 风住尘
     * @param list
     * @return boolean
     * @Date 2020/5/11 9:13
     */
    boolean deleteByIds(List<Integer> list);
}
