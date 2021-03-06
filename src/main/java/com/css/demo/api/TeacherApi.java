package com.css.demo.api;

import com.css.demo.pojo.Teacher;
import com.css.demo.pojo.TeacherVO;
import com.css.demo.pojo.TidVO;
import com.css.demo.util.CallRespose;
import org.springframework.validation.BindingResult;

import java.util.List;

/**
 * @InterfaceName TeacherApi
 * @Description 类描述
 * @Author 风住尘
 * @Date 2020/5/11 10:31
 **/
public interface TeacherApi {
    CallRespose findCourseAll();

    CallRespose findAll();

    CallRespose findOne(TidVO tidVO,BindingResult bindingResult);

    CallRespose insertOne(Teacher teacher, BindingResult bindingResult);

    CallRespose updateOne(Teacher teacher);

    CallRespose deleteOne(int tid);

    CallRespose deleteByIds(TeacherVO teacherVO);
}
