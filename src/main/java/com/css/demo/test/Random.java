package com.css.demo.test;

import org.springframework.format.annotation.DateTimeFormat;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @ClassName asd
 * @Description 类描述
 * @Author 风住尘
 * @Date 2020/5/30 11:24
 **/
public class Random {
    public static void main(String[] args) {
        String[] workListOne = {"赵","钱","孙","李","周","吴","郑","王"};
        String[] workListTwo = {"婷","鑫","丽","若","梅","春","夏","秋","冬"};
        String[] workListThree = {"雪","婷","鑫","风","眉","诗","灵","薇","宁"};

        int oneLength = workListOne.length;
        int twoLength = workListTwo.length;
        int threeLength = workListThree.length;

        int rand1 = (int) (Math.random()*oneLength);
        int rand2 = (int) (Math.random()*twoLength);
        int rand3 = (int) (Math.random()*threeLength);

        String girlName = workListOne[rand1]+workListTwo[rand2]+workListThree[rand3];

        System.out.println(girlName);

    }

}
