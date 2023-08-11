package com.design.创建型.单例模式.饿汉;

/**
 * @Classname Singlton
 * @Description 饿汉式
 * @Date 2021/4/24 22:16
 */
public class HungrySingleton {
    // 定义静态变量的同时,实例化单例类,所以类加载的时候已经创建了对象
    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton GetInstance() {
        return instance;
    }

    public static void main(String[] args) {
        /**
         * 测试
         */
        HungrySingleton hungrySingleton = HungrySingleton.GetInstance();
    }
}
