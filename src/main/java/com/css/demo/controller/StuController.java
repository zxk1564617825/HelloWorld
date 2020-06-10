package com.css.demo.controller;

import com.css.demo.pojo.Sss;
import com.css.demo.pojo.StuPO;
import com.css.demo.pojo.StuVO;
import com.css.demo.service.StuService;
import com.css.demo.util.CallRespose;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName StuController
 * @Description 类描述
 * @Author 风住尘
 * @Date 2020/5/6 15:55
 **/
@RestController
@RequestMapping("/stu")
@Api("测试查询学生列表")
public class StuController {
    @Resource
    private StuService stuService ;

    @PostMapping("/getAll")
    @ApiOperation("全查")
    public StuPO getStu(@RequestBody StuVO stuVO){
        return stuService.getStu(stuVO);
    }

    @PostMapping("/test")
    @ApiOperation("测试")
    public String testStu(){
        return "Hello World !" ;
    }

    @PostMapping("/findAll")
    @ApiOperation("全查通查")
    public CallRespose findStu(@RequestBody StuVO stuVO){
        return CallRespose.success(stuService.getStu(stuVO));
    }

    @PostMapping("/test_sss")
    @ApiOperation("测试ssss")
    public CallRespose testSss(){
        return CallRespose.success(stuService.testSss());
    }

    @PostMapping("/getTime")
    @ApiOperation("getTime")
    public CallRespose getTime(){
        return CallRespose.success(stuService.getTime());
    }
}
