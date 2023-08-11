package com.design.行为型.模板方法模式;

/**
 * @Classname DemandAccount
 * @Date 2021/5/9 22:32
 */
public class DemandAccount extends Account {

    @Override
    protected String getAccountType() {
        return "活期";
    }

    @Override
    protected double getInterestRate() {
        return 0.005D;
    }
}
