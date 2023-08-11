package com.design.结构型.代理模式.静态代理;

/**
 * @Classname Test
 * @Description 静态代理测试
 * @Date 2021/4/25 23:58
 */
public class Test {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        ProxyService proxyService = new ProxyService(userService);
        proxyService.service();
    }
}
