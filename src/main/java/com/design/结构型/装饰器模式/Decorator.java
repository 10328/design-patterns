package com.design.结构型.装饰器模式;

/**
 * @Classname Decorator
 * @Description 原始类
 * @Date 2021/5/9 0:05
 */
public abstract class Decorator implements Component {

    private Component component = null;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        // 增加逻辑处理
        System.out.println("增加逻辑处理");
        this.component.operation();
    }

}
