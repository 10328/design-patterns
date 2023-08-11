package com.design.创建型.简单工厂;

/**
 * @Classname ComputerTest
 * @Description 计算机测试类
 * @Date 2021/3/29 23:42
 */
public class ComputerTest {
    public static void main(String[] args) {
        // 创建小米计算机
        Calculation xm = new ComputerFactory().create("XM");
        xm.powerOn();
    }
}
