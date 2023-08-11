package com.design.创建型.简单工厂;

/**
 * @Classname XmComputer
 * @Description 小米计算机
 * @Date 2021/3/29 23:37
 */
public class XmComputer implements Calculation {
    @Override
    public void powerOn() {
        System.out.println("小米电脑正在开机");
    }

    @Override
    public void powerOff() {
        System.out.println("小米电脑正在关机");
    }
}
