package com.design.行为型.委派模式;

/**
 * @Classname ConcreteTaskA
 * @Date 2021/5/9 23:28
 */
public class ConcreteTaskA implements Task {
    @Override
    public void doTask() {
        System.out.println("执行,由A实现");
    }
}
