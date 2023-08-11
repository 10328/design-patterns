package com.design.结构型.适配器模式;

/**
 * @Classname DuckAdapterTest
 * @Description 测试火鸡适配器
 * @Date 2021/4/28 0:16
 */
public class DuckAdapterTest {
    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        Duck duck = new TurkeyAdapter(turkey);
        System.out.println("duck .... ");
        duck.quack();
        duck.fly();
    }
}
