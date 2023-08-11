package com.design.创建型.原型模式;

/**
 * @Classname RealizetypeTest
 * @Date 2021/4/25 22:10
 */
public class RealizetypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype obj1 = new Realizetype();
        Realizetype obj2 = obj1.clone();
        Realizetype obj3 = new Realizetype();
        System.out.println("obj1==obj2 ? " + (obj1 == obj2));
        System.out.println("obj1==obj3 ? " + (obj1 == obj3));
    }
}
