package com.design.创建型.工厂方法;

/**
 * @Classname DellComputerFactory
 * @Date 2021/4/13 22:23
 */
public class DellComputerFactory extends ComputerFactory {

    @Override
    public Calculation create() {
        return new DellComputer();
    }
}
