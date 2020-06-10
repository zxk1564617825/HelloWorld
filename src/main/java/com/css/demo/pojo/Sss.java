package com.css.demo.pojo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;

/**
 * @ClassName Sss
 * @Description 类描述
 * @Author 风住尘
 * @Date 2020/5/21 11:45
 **/
@Data
public class Sss {
    private int uid ;
    private String uname ;
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date  create_time ;
}
