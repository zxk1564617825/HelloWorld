package com.css.demo.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @ClassName Teacher
 * @Description 类描述
 * @Author 风住尘
 * @Date 2020/5/9 15:57
 **/
@Data
public class Teacher {
    @ApiModelProperty("编号")
    private int tid ;
    @NotEmpty(message = "名称不能为空")
    @ApiModelProperty("名称")
    private String tname ;
    @NotNull(message = "年龄不能为空")
    @ApiModelProperty("年龄")
    private int tage ;
    @NotNull(message = "课程id不能为空")
    @ApiModelProperty("课程ID")
    private int cid ;
    @ApiModelProperty("课程名称")
    private String cname ;
}
