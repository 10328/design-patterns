package com.design.行为型.策略模式.Calculation;

/**
 * @Classname Context
 * @Date 2021/4/24 22:51
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
