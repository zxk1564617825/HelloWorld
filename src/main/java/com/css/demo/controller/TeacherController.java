package com.css.demo.controller;

import com.css.demo.api.TeacherApi;
import com.css.demo.pojo.Teacher;
import com.css.demo.pojo.TeacherVO;
import com.css.demo.service.TeacherService;
import com.css.demo.util.CallRespose;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName TeacherController
 * @Description 类描述
 * @Author 风住尘
 * @Date 2020/5/9 15:54
 **/
@RestController
@RequestMapping("/tea")
@Api("教师列表")
public class TeacherController implements TeacherApi {
    @Resource
    private TeacherService teacherService ;
    /**
     * @Description 课程全查
     * @Author 风住尘
     * @param
     * @return com.css.demo.util.CallRespose
     * @Date 2020/5/11 9:13
     */
    @Override
    @ApiOperation("课程全查")
    @PostMapping("find_course_all")
    public CallRespose findCourseAll(){
        return CallRespose.success(teacherService.findCourseAll());
    }
    /**
     * @Description 教师全查
     * @Author 风住尘
     * @param
     * @return com.css.demo.util.CallRespose
     * @Date 2020/5/11 9:13
     */
    @Override
    @ApiOperation("教师全查")
    @PostMapping("find_all")
    public CallRespose findAll(){
        return CallRespose.success(teacherService.findAll());
    }
    /**
     * @Description 单查
     * @Author 风住尘
     * @param tid
     * @return com.css.demo.util.CallRespose
     * @Date 2020/5/11 9:13
     */
    @Override
    @ApiOperation("单查")
    @PostMapping("find_one")
    public CallRespose findOne(@RequestBody Integer tid){
        Teacher teacher = teacherService.findOne(tid);
        if(teacher!=null){
            return CallRespose.success(teacher);
        }else{
            return CallRespose.error("没查到数据！");
        }
    }
    /**
     * @Description 添加
     * @Author 风住尘
     * @param teacher
     * @return com.css.demo.util.CallRespose
     * @Date 2020/5/11 9:13
     */
    @Override
    @ApiOperation("单条添加")
    @PostMapping("insert_one")
    public CallRespose insertOne(@RequestBody Teacher teacher){
        boolean flag = teacherService.insertOne(teacher);
        if(flag){
            return CallRespose.success(flag);
        }else{
            return CallRespose.error("添加失败！");
        }
    }
    /**
     * @Description 修改
     * @Author 风住尘
     * @param teacher
     * @return com.css.demo.util.CallRespose
     * @Date 2020/5/11 9:13
     */
    @Override
    @ApiOperation("单条修改")
    @PostMapping("update_one")
    public CallRespose updateOne(@RequestBody Teacher teacher){
        boolean flag = teacherService.updateOne(teacher);
        if(flag){
            return CallRespose.success(flag);
        }else{
            return CallRespose.error("修改失败！");
        }
    }
    /**
     * @Description 单删
     * @Author 风住尘
     * @param tid
     * @return com.css.demo.util.CallRespose
     * @Date 2020/5/11 9:14
     */
    @Override
    @ApiOperation("单条删除")
    @PostMapping("delete_one")
    public CallRespose deleteOne(@RequestBody int tid){
        boolean flag = teacherService.deleteOne(tid);
        if(flag){
            return CallRespose.success(flag);
        }else{
            return CallRespose.error("删除失败！");
        }
    }
    /**
     * @Description pishan
     * @Author 风住尘
     * @param teacherVO
     * @return com.css.demo.util.CallRespose
     * @Date 2020/5/11 14:49
     */
    @Override
    @ApiOperation("批量删除")
    @PostMapping("delete_by_ids")
    public CallRespose deleteByIds(@RequestBody TeacherVO teacherVO){
        boolean flag = teacherService.deleteByIds(teacherVO.getList());
        if(flag){
            return CallRespose.success(flag);
        }else{
            return CallRespose.error("删除失败！");
        }
    }

}
