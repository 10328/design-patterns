package com.design.创建型.抽象工厂;

/**
 * @Classname DellComputerMemory
 * @Date 2021/4/13 23:27
 */
public class DellComputerMemory implements Memory {
    @Override
    public void makeMemory() {
        System.out.println("制作戴尔内存..");
    }
}
