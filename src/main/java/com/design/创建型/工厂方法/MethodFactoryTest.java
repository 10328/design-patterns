package com.design.创建型.工厂方法;

/**
 * @Classname MethodFactoryTest
 * @Date 2021/4/13 22:40
 */
public class MethodFactoryTest {
    public static void main(String[] args) {
        DellComputerFactory dellFactory = new DellComputerFactory();
        Calculation dellCalculation = dellFactory.create();
        dellCalculation.powerOn();

        XmComputerFactory xmComputerFactory = new XmComputerFactory();
        Calculation xmCalculation = xmComputerFactory.create();
        xmCalculation.powerOff();
    }
}
