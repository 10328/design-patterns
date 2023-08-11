package com.design.结构型.适配器模式;

import java.util.Random;

/**
 * @Classname TurkeyAdapter
 * @Date 2021/4/28 0:15
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;
    Random random;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
        this.random = new Random();
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
