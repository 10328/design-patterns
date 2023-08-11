package com.design.创建型.抽象工厂;

/**
 * @Classname XmComputerCpu
 * @Date 2021/4/13 23:37
 */
public class XmComputerCpu implements Cpu {
    @Override
    public void makeCpu() {
        System.out.println("制作小米Cpu");
    }
}
