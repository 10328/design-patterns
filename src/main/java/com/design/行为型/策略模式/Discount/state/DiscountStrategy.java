package com.design.行为型.策略模式.Discount.state;

/**
 * @Classname DiscountStrategy
 * @Date 2021/5/9 12:26
 */
public abstract class DiscountStrategy {
    // 价格
    private double price = 0;
    // 数量
    private double number = 0;

    public DiscountStrategy(double price, double number) {
        this.price = price;
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public double getNumber() {
        return number;
    }

    // 根据策略模式,生成折扣额
    public abstract double calculateDiscount();
}
