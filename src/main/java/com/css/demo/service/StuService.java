package com.css.demo.service;

import com.css.demo.pojo.GetTime;
import com.css.demo.pojo.Sss;
import com.css.demo.pojo.StuPO;
import com.css.demo.pojo.StuVO;

import java.util.List;


/**
 * @InterfaceName StuService
 * @Description 类描述
 * @Author 风住尘
 * @Date 2020/5/6 15:45
 **/
public interface StuService {
    StuPO getStu(StuVO stuVO);

    List<Sss> testSss();

    List<GetTime> getTime();
}
