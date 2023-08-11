package com.design.行为型.策略模式.Calculation;

/**
 * @Classname OperationSubtract
 * @Description 减策略
 * @Date 2021/4/24 22:49
 */
public class OperationSubtract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
