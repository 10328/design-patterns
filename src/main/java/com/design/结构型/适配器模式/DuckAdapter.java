package com.design.结构型.适配器模式;

import java.util.Random;

/**
 * @Classname DuckAdapter
 * @Description 鸭子适配器
 * @Date 2021/4/27 23:57
 */
public class DuckAdapter implements Turkey {
    Duck duck;
    Random random;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
        this.random = new Random();
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}
