package com.design.创建型.工厂方法;

/**
 * @Classname DellComputer
 * @Date 2021/4/13 22:27
 */
public class DellComputer implements Calculation {
    @Override
    public void powerOn() {
        System.out.println("戴尔电脑正在开机...");
    }

    @Override
    public void powerOff() {
        System.out.println("戴尔电脑正在关机...");
    }
}
