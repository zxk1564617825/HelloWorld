package com.css.demo.controller;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Test
 * @Description 类描述
 * @Author 风住尘
 * @Date 2020/5/18 17:56
 **/
public class Test {
    public static void main(String[] args) {
        List<String> strs = new ArrayList<>();
        strs.add("11");
        strs.add("12");
        strs.add("13");
        strs.add("14");
        strs.add("15");
        System.out.println(strs.get(1));
        System.out.println(strs);
    }
}
