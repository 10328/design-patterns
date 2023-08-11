package com.design.创建型.抽象工厂;

/**
 * @Classname DellComputerCpu
 * @Date 2021/4/13 23:25
 */
public class DellComputerCpu implements Cpu {
    @Override
    public void makeCpu() {
        System.out.println("制作戴尔Cpu");
    }
}
