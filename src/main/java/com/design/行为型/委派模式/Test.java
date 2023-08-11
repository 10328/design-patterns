package com.design.行为型.委派模式;

/**
 * @Classname Test
 * @Date 2021/5/9 23:33
 */
public class Test {
    public static void main(String[] args) {
        TaskDelegate taskDelegate = new TaskDelegate();
        taskDelegate.doTask();
    }
}
