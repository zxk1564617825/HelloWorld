package com.css.demo.test;

/**
 * @ClassName MyTest
 * @Description 类描述
 * @Author 风住尘
 * @Date 2020/6/3 13:22
 **/
public class MyTest {

    public static void main(String[] args) {
        Game game = new Game();
        Guess guess = new Guess();
        boolean flag = true ;
        System.out.println("机器人猜数字比赛开始！");
        int i = game.randGame();
        System.out.println("我出的数字是："+i);
        while (flag){
            System.out.println("猜数字中……");
            int j = guess.randGame();
            System.out.println("我猜的数字是："+j);
            if(i==j){
                flag = false ;
                System.out.println("恭喜你，猜对了呢！");
            }else{
                System.out.println("猜的不对呦，请继续猜测~");
            }
        }
    }
}
