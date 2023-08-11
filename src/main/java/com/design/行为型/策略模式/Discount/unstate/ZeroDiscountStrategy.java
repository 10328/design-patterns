package com.design.行为型.策略模式.Discount.unstate;

/**
 * @Classname ZeroDiscountStrategy
 * @Date 2021/5/9 16:52
 */
public class ZeroDiscountStrategy extends DiscountStrategy {
    public ZeroDiscountStrategy() {
    }

    // 实现策略方法
    @Override
    public double calculateDiscount() {
        return 0;
    }
}
