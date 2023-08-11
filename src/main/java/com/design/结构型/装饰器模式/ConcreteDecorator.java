package com.design.结构型.装饰器模式;

/**
 * @Classname ConcreteDecorator
 * @Description 装饰器类
 * @Date 2021/5/9 0:08
 */
public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    private void method() {
        System.out.println("增加 1 对功能进行装饰");
    }

    @Override
    public void operation() {
        // 增加包装信息
        this.method();
        // 真实逻辑
        super.operation();
    }
}
