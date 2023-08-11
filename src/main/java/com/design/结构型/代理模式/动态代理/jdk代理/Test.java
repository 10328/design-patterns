package com.design.结构型.代理模式.动态代理.jdk代理;

/**
 * @Classname Test
 * @Description jdk动态代理：必须实现接口
 * @Date 2021/4/25 23:13
 */
public class Test {
    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        Star huaZai = new HuaZai();
        StarProxy starProxy = new StarProxy();
        starProxy.setTarget(huaZai);
        Object proxyInstance = starProxy.createProxyInstance();
        Star star = (Star) proxyInstance;
        star.sing("千里之外");
        star.dance("广场舞");
    }
}
