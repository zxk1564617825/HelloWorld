package com.css.demo.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @ClassName NewCourse
 * @Description 类描述
 * @Author 风住尘
 * @Date 2020/6/6 10:32
 **/
@Data
public class NewCourse {
    @ApiModelProperty("课程ID")
    @NotNull(message = "课程ID不能为空")
    private Integer courseId ;

    @NotEmpty(message = "名称不能为空")
    @ApiModelProperty("名称")
    private String courseName ;

    @NotEmpty(message = "描述不能为空")
    @ApiModelProperty("描述")
    private String courseDesc;

    @NotEmpty(message = "创建时间不能为空")
    @ApiModelProperty("创建时间")
    //@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private String createTime ;


    @NotNull(message = "教师ID不能为空")
    @ApiModelProperty("教师ID")
    private Integer teacherId ;

}
