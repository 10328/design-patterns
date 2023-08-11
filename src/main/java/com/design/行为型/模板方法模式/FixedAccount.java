package com.design.行为型.模板方法模式;

/**
 * @Classname FixedAccount
 * @Date 2021/5/9 22:34
 */
public class FixedAccount extends Account {
    @Override
    protected String getAccountType() {
        return "定期";
    }

    @Override
    protected double getInterestRate() {
        return 0.032D;
    }
}
