package com.design.行为型.策略模式.Discount.state;

/**
 * @Classname ContextClient
 * @Date 2021/5/9 16:31
 */
public class ContextClient {
    private DiscountStrategy ds;

    public ContextClient(DiscountStrategy ds) {
        this.ds = ds;
    }

    public static void main(String[] args) {
        ContextClient client0 = new ContextClient(new ZeroDiscountStrategy(48.5, 20));
        System.out.println("0 折扣: " + client0.contextClaDis());
        ContextClient client1 = new ContextClient(new fixDiscountStrategy(34, 20));
        System.out.println("固定折扣: " + client1.contextClaDis());
        ContextClient client2 = new ContextClient(new PercentageDiscountStrategy(34, 20));
        System.out.println("百分比折扣: " + client2.contextClaDis());
    }

    public double contextClaDis() {
        return ds.calculateDiscount();
    }
}
