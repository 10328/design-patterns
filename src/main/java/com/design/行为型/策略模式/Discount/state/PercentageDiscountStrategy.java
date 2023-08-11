package com.design.行为型.策略模式.Discount.state;

/**
 * @Classname PercentageDiscountStrategy
 * @Date 2021/5/9 13:35
 */
public class PercentageDiscountStrategy extends DiscountStrategy {

    public PercentageDiscountStrategy(double price, double number) {
        super(price, number);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * getNumber() * 0.15;
    }
}
