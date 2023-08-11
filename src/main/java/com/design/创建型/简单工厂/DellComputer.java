package com.design.创建型.简单工厂;

/**
 * @Classname DellComputer
 * @Description 戴尔计算机
 * @Date 2021/3/29 23:38
 */
public class DellComputer implements Calculation {
    @Override
    public void powerOn() {
        System.out.println("戴尔电脑正在开机");
    }

    @Override
    public void powerOff() {
        System.out.println("戴尔电脑正在关机");
    }
}
