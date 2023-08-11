package com.design.结构型.适配器模式;

/**
 * @Classname TurkeyAdapterTest
 * @Description 测试鸭子适配器
 * @Date 2021/4/28 0:12
 */
public class TurkeyAdapterTest {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new DuckAdapter(duck);
        System.out.println("turkey .... ");
        turkey.gobble();
        turkey.fly();
    }
}
