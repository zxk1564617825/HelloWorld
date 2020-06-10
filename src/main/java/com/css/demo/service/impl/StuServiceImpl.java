package com.css.demo.service.impl;

import com.css.demo.constants.ErrorConstants;
import com.css.demo.exception.BusinessRuntimeException;
import com.css.demo.mapper.StuMapper;
import com.css.demo.pojo.*;
import com.css.demo.service.StuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName StuServiceImpl
 * @Description 类描述
 * @Author 风住尘
 * @Date 2020/5/6 15:46
 **/
@Service
@Slf4j
public class StuServiceImpl implements StuService {
    @Resource
    private StuMapper stuMapper ;
    @Override
    public StuPO getStu(StuVO stuVO) {
        log.info("getStu  入参  {}",stuVO);
        List<Stu> list = stuMapper.getStu(stuVO);
        if(!list.isEmpty()){
            StuPO stuPO = new StuPO();
            stuPO.setList(list);
            log.info("getStu  出参  {}",stuPO);
            return stuPO;
        }else{
            throw new BusinessRuntimeException(ErrorConstants.LIST_NULL.getCode(),ErrorConstants.LIST_NULL.getMsg());
        }
    }

    @Override
    public  List<Sss> testSss() {
        List<Sss> s = stuMapper.getSss();
        return s;
    }

    @Override
    public List<GetTime> getTime() {
        List<GetTime> list = stuMapper.getTime();
        return list;
    }
}
