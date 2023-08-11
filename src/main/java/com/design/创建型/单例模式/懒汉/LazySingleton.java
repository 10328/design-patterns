package com.design.创建型.单例模式.懒汉;

/**
 * @Classname LazySingleton
 * @Description 懒汉式: 存在的问题, 并发和重排序!
 * 并发解决方案：使用双重判定来解决多线程同时判断实例为null时,重复创建对象
 * 重排序解决方案: 保证可见性 volatile
 * 步骤1 ：以LazySingleton类作为原型，给他的对象实例分配一块内存空间
 * instance = allocate（LazySingleton.clss）；
 * 步骤2：就是针对分配好的内存空间的一个对象实例，执行他的构造函数，对这个对象实例进行初始化操作，
 * 执行我们自己写的构造函数的一些代码，对各个实例变量赋值，进行初始化逻辑
 * invokeConstructor（instance)
 * 步骤3：上两步骤搞定之后，一个实例对象就搞定了，此时就把instance指针指向内存地址，赋值给我们自己的引用类
 * 型的变量， instance就可以作为一个类似指针的概念，指向了LazySingleton对象的内存地址
 * <p>
 * JT动态编译，为了加速程序的执行的性能和效率所以会发生指令重拍
 * 步骤1-》步骤3-》步骤2
 * 线程1，刚刚执行完步骤1和步骤3，步骤2还没有执行，此时instance已经不是null
 * 线程2，获取到instance调用某个方法就会报错
 * @Date 2021/4/24 22:24
 */
public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton() {
    }

    public static LazySingleton GetInstance() {
        // 第一重判断
        if (instance == null) {
            // 同步加锁机制
            synchronized (LazySingleton.class) {
                // 第二次判断
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
