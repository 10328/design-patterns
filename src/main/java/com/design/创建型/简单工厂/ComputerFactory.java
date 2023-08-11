package com.design.创建型.简单工厂;

/**
 * @Classname ComputerFactory
 * @Description 计算机工厂类
 * @Date 2021/3/29 23:39
 */
public class ComputerFactory {
    public Calculation create(String computer) {
        if (computer.isEmpty()) {
            return null;
        }
        if ("DELL".equals(computer)) {
            return new DellComputer();
        } else if ("XM".equals(computer)) {
            return new XmComputer();
        }
        return null;
    }
}
