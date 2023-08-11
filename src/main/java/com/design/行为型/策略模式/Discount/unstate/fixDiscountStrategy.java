package com.design.行为型.策略模式.Discount.unstate;

/**
 * @Classname fixDiscountStrategy
 * @Date 2021/5/9 12:31
 */
public class fixDiscountStrategy extends DiscountStrategy {

    public fixDiscountStrategy() {
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * getNumber() * 0.1;
    }
}
