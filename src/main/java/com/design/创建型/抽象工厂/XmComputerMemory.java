package com.design.创建型.抽象工厂;

/**
 * @Classname XmComputerMemory
 * @Date 2021/4/13 23:38
 */
public class XmComputerMemory implements Memory {
    @Override
    public void makeMemory() {
        System.out.println("制作小米内存..");
    }
}
