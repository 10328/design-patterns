package com.design.创建型.工厂方法;

/**
 * @Classname XmComputer
 * @Date 2021/4/13 22:30
 */
public class XmComputer implements Calculation {
    @Override
    public void powerOn() {
        System.out.println("小米电脑正在开机...");
    }

    @Override
    public void powerOff() {
        System.out.println("小米电脑正在关机...");
    }
}
