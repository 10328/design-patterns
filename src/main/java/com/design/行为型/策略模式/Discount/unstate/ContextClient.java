package com.design.行为型.策略模式.Discount.unstate;

/**
 * @Classname ContextClient
 * @Date 2021/5/9 17:00
 */
public class ContextClient {
    public static void main(String[] args) {
        DiscountStrategy fix = StrategyFactory.getDiscountStrategy("FIX");
        fix.setNumber(60);
        fix.setPrice(30);
        System.out.println(fix.calculateDiscount());
    }
}
