package com.design.创建型.单例模式.静态内部类;

/**
 * @Classname StaticCode
 * @Description 静态代码块实现单例
 * @Date 2021/4/24 23:12
 */
public class StaticCode {
    private StaticCode() {
    }

    public static StaticCode getInstance() {
        // 第一次调用getInstance,加载内部类HolderClass
        return HolderClass.instance;
    }

    // 通过静态内部类实现,类加载的时候进行实例化
    private static class HolderClass {
        private final static StaticCode instance = new StaticCode();
    }
}
