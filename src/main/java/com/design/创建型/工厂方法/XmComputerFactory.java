package com.design.创建型.工厂方法;

/**
 * @Classname XmComputerFactory
 * @Date 2021/4/13 22:39
 */
public class XmComputerFactory extends ComputerFactory {
    @Override
    public Calculation create() {
        return new XmComputer();
    }
}
