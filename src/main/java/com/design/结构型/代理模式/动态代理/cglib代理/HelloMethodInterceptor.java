package com.design.结构型.代理模式.动态代理.cglib代理;


import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Classname HelloMethodInterceptor
 * @Description cglib 代理
 * @Date 2021/4/27 23:06
 */
public class HelloMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before : " + method.getName());
        Object object = methodProxy.invokeSuper(o, objects);
        System.out.println("after : " + method.getName());
        return object;
    }
}
