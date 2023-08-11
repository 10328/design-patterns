package com.design.结构型.装饰器模式;

/**
 * @Classname MainTest
 * @Date 2021/5/9 0:15
 */
public class MainTest {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        ConcreteDecorator component1 = new ConcreteDecorator(component);
        ConcreteDecorator2 component2 = new ConcreteDecorator2(component1);
        component2.operation();
    }
}
