package com.design.结构型.适配器模式;

/**
 * @Classname MallardDuck
 * @Description 野鸭
 * @Date 2021/4/27 23:52
 */
public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("野鸭... Quack.....");
    }

    @Override
    public void fly() {
        System.out.println("野鸭... Fly.....");
    }
}

