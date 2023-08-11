package com.design.结构型.适配器模式;

/**
 * @Classname WildTurkey
 * @Description 野生火鸡
 * @Date 2021/4/27 23:56
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("野火鸡... Gobble....");
    }

    @Override
    public void fly() {
        System.out.println("野火鸡... fly....");
    }
}
