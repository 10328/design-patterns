package com.design.创建型.原型模式;

/**
 * @Classname Realizettype
 * @Date 2021/4/25 22:04
 */
public class Realizetype implements Cloneable {
    public Realizetype() {
        System.out.println("Mac 电脑磨具生产成功");
    }

    @Override
    protected Realizetype clone() throws CloneNotSupportedException {
        System.out.println("MAC 电脑克隆成功");
        return (Realizetype) super.clone();
    }
}
