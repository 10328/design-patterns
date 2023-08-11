package com.design.结构型.代理模式.动态代理.jdk代理;

/**
 * @Classname HuaZai
 * @Date 2021/4/25 23:00
 */
public class HuaZai implements Star {
    @Override
    public String sing(String name) {
        System.out.println("开始唱歌" + name);
        return "唱完";
    }

    @Override
    public String dance(String name) {
        System.out.println("开始跳舞" + name);
        return "跳完";
    }
}
