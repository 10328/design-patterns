package com.design.行为型.策略模式.Discount.state;

/**
 * @Classname ZeroDiscountStrategy
 * @Date 2021/5/9 16:29
 */
public class ZeroDiscountStrategy extends DiscountStrategy {
    public ZeroDiscountStrategy(double price, double number) {
        super(price, number);
    }

    /* 实现策略方法 */
    @Override
    public double calculateDiscount() {
        return 0;
    }
}
