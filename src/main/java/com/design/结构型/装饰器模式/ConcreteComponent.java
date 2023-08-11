package com.design.结构型.装饰器模式;

/**
 * @Classname ConcreteComponent
 * @Description 原始类
 * @Date 2021/5/9 0:04
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        // 业务代码
        System.out.println("操作业务信息");
    }
}
