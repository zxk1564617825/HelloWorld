package com.css.demo.mapper;

import com.css.demo.pojo.Course;
import com.css.demo.pojo.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @InterfaceName TeacherMapper
 * @Description 类描述
 * @Author 风住尘
 * @Date 2020/5/9 15:55
 **/
@Mapper
public interface TeacherMapper {
    /**
     * @Description 课程全查
     * @Author 风住尘
     * @param
     * @return java.util.List<com.css.demo.pojo.Course>
     * @Date 2020/5/11 9:11
     */
    List<Course> findCourseAll();
    /**
     * @Description 教师全查
     * @Author 风住尘
     * @param
     * @return java.util.List<com.css.demo.pojo.Teacher>
     * @Date 2020/5/11 9:11
     */
    List<Teacher> findAll();
    /**
     * @Description 单查
     * @Author 风住尘
     * @param tid
     * @return com.css.demo.pojo.Teacher
     * @Date 2020/5/11 9:11
     */
    Teacher findOne(Integer tid);
    /**
     * @Description 添加
     * @Author 风住尘
     * @param teacher
     * @return int
     * @Date 2020/5/11 9:11
     */
    int insertOne(Teacher teacher);
    /**
     * @Description 修改
     * @Author 风住尘
     * @param teacher
     * @return int
     * @Date 2020/5/11 9:11
     */
    int updateOne(Teacher teacher);
    /**
     * @Description 单删
     * @Author 风住尘
     * @param tid
     * @return int
     * @Date 2020/5/11 9:12
     */
    int deleteOne(int tid);
    /**
     * @Description 批删
     * @Author 风住尘
     * @param list
     * @return int
     * @Date 2020/5/11 9:12
     */
    int deleteByIds(List<Integer> list);
}
