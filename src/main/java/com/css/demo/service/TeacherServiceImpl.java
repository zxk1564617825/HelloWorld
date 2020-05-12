package com.css.demo.service;

import com.css.demo.mapper.TeacherMapper;
import com.css.demo.pojo.Course;
import com.css.demo.pojo.Teacher;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName TeacherServiceImpl
 * @Description 类描述
 * @Author 风住尘
 * @Date 2020/5/9 15:55
 **/
@Service
@Slf4j
public class TeacherServiceImpl implements TeacherService{

    @Resource
    private TeacherMapper teacherMapper ;
    /**
     * @Description 课程全查
     * @Author 风住尘
     * @param
     * @return java.util.List<com.css.demo.pojo.Course>
     * @Date 2020/5/11 9:09
     */
    @Override
    public List<Course> findCourseAll() {
        return teacherMapper.findCourseAll();
    }
    /**
     * @Description 教师全查
     * @Author 风住尘
     * @param
     * @return java.util.List<com.css.demo.pojo.Teacher>
     * @Date 2020/5/11 9:10
     */
    @Override
    public List<Teacher> findAll() {
        return teacherMapper.findAll();
    }
    /**
     * @Description 单查
     * @Author 风住尘
     * @param tid
     * @return com.css.demo.pojo.Teacher
     * @Date 2020/5/11 9:10
     */
    @Override
    public Teacher findOne(Integer tid) {
        return teacherMapper.findOne(tid);
    }
    /**
     * @Description 添加
     * @Author 风住尘
     * @param teacher
     * @return boolean
     * @Date 2020/5/11 9:10
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean insertOne(Teacher teacher) {
        log.info("teacher 入参 {}",teacher);
        int flag = teacherMapper.insertOne(teacher);
        log.info("flag 出参 {}",flag);
        return flag>0;
    }
    /**
     * @Description 修改
     * @Author 风住尘
     * @param teacher
     * @return boolean
     * @Date 2020/5/11 9:10
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean updateOne(Teacher teacher) {
        int flag = teacherMapper.updateOne(teacher);
        return flag>0;
    }
    /**
     * @Description 删除
     * @Author 风住尘
     * @param tid
     * @return boolean
     * @Date 2020/5/11 9:10
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean deleteOne(int tid) {
        int flag = teacherMapper.deleteOne(tid);
        return flag>0;
    }
    /**
     * @Description 批删
     * @Author 风住尘
     * @param list
     * @return boolean
     * @Date 2020/5/11 9:10
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean deleteByIds(List<Integer> list) {
        int flag = teacherMapper.deleteByIds(list);
        return flag>0;
    }
}
