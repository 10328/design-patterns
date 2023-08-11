package com.design.行为型.策略模式.Calculation;

/**
 * @Classname OperationAdd
 * @Description 加策略
 * @Date 2021/4/24 22:48
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
