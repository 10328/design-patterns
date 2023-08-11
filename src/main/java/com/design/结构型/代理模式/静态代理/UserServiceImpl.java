package com.design.结构型.代理模式.静态代理;

/**
 * @Classname UserServiceImpl
 * @Date 2021/4/25 22:50
 */
public class UserServiceImpl implements Service {
    @Override
    public void service() {
        System.out.println("service is calling");
    }
}
