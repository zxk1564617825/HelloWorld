package com.css.demo.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @ClassName TidVO
 * @Description 类描述
 * @Author 风住尘
 * @Date 2020/5/30 9:45
 **/
@Data
public class TidVO {
    @Min(1)
    @NotNull(message = "教师ID不能为空")
    @ApiModelProperty("教师ID")
    private Integer tid ;
}
