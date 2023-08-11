package com.design.结构型.代理模式.动态代理.cglib代理;

import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.cglib.proxy.Enhancer;

/**
 * @Classname Client
 * @Description 测试 cglib
 * @Date 2021/4/27 23:10
 */
public class Client {
    public static void main(String[] args) {
        // 生成代理类
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "src/main/java/com/design/结构型/代理模式/动态代理/cglib代理/proxy");

        Enhancer enhancer = new Enhancer();
        // 继承被代理类
        enhancer.setSuperclass(HelloService.class);
        // 设置回调
        enhancer.setCallback(new HelloMethodInterceptor());
        // 设置代理对象
        HelloService helloService = (HelloService) enhancer.create();
        // 在调用代理类中方法时,会被我们实现的方法拦截器进行拦截
        helloService.seyHello();
    }
}
