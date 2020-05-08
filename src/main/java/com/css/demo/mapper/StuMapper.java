package com.css.demo.mapper;

import com.css.demo.pojo.Stu;
import com.css.demo.pojo.StuVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @InterfaceName StuMapper
 * @Description 类描述
 * @Author 风住尘
 * @Date 2020/5/6 15:39
 **/
@Mapper
public interface StuMapper {
    List<Stu> getStu(@Param("stuVO") StuVO stuVO);
}
