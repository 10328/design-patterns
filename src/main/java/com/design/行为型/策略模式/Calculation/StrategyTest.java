package com.design.行为型.策略模式.Calculation;

/**
 * @Classname StrategyTest
 * @Description 测试策略模式
 * @Date 2021/4/24 22:54
 */
public class StrategyTest {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        int i = context.executeStrategy(1, 2);
        System.out.println(i);

        context = new Context(new OperationMultiply());
        i = context.executeStrategy(1, 2);
        System.out.println(i);
    }
}
