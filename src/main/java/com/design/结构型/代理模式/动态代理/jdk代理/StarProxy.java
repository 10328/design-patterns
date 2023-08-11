package com.design.结构型.代理模式.动态代理.jdk代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Classname StarProxy
 * @Date 2021/4/25 23:02
 */
public class StarProxy implements InvocationHandler {
    // 目标类，也就是被代理类
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 这里就是增强功能
        System.out.println("收钱");
        Object result = method.invoke(target, args);
        System.out.println("结款");
        return result;
    }

    // 生成代理类
    public Object createProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }
}
