package com.css.demo.test;

import com.css.demo.exception.BusinessRuntimeException;
import com.css.demo.pojo.Teacher;
import com.css.demo.service.TeacherService;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName TeacherTest
 * @Description 类描述
 * @Author 风住尘
 * @Date 2020/5/16 15:19
 **/
public class TeacherTest {
    @Resource
    private TeacherService teacherService ;

    @Test
    public void getTeacher(){
        System.out.println("===>>>lalalalal");
        List<Teacher>  list = teacherService.findAll();
        if(list!=null&&!list.isEmpty()){
            System.out.println(list);
        }else{
            throw new BusinessRuntimeException("000000","返回值为空");
        }
    }

}
