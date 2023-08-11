package com.design.行为型.策略模式.Calculation;

/**
 * @Classname OperationMultiply
 * @Description 乘策略
 * @Date 2021/4/24 22:50
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
