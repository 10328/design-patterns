package com.design.行为型.策略模式.Discount.unstate;

/**
 * @Classname Percent
 * @Date 2021/5/9 16:50
 */
public class PercentageDiscountStrategy extends DiscountStrategy {
    public PercentageDiscountStrategy() {
    }

    /* 实现策略方法的百分比 */
    @Override
    public double calculateDiscount() {
        return getPrice() * getNumber() * 0.15;
    }
}
