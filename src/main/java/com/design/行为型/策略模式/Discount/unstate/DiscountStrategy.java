package com.design.行为型.策略模式.Discount.unstate;

/**
 * @Classname DiscountStrategy
 * @Description 无状态的策略类
 * @Date 2021/5/9 16:46
 */
public abstract class DiscountStrategy {
    // 价格
    public double price = 0;
    // 数量
    public int number = 0;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public abstract double calculateDiscount();
}
