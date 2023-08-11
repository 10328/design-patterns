package com.design.结构型.装饰器模式;

/**
 * @Classname ConcreteDecorator
 * @Description 装饰器类2
 * @Date 2021/5/9 0:08
 */
public class ConcreteDecorator2 extends Decorator {
    public ConcreteDecorator2(Component component) {
        super(component);
    }

    private void warpperMethod() {
        System.out.println("增加 2 对功能进行装饰");
    }

    @Override
    public void operation() {
        // 增加包装信息
        this.warpperMethod();
        // 真实逻辑
        super.operation();
    }
}
