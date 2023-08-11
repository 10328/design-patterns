package com.design.行为型.模板方法模式;

/**
 * @Classname Account
 * @Date 2021/5/9 22:23
 */
public abstract class Account {
    // 账号
    private String accountNumber;

    public Account() {
    }

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * 账户类型
     *
     * @return
     */
    protected abstract String getAccountType();

    /**
     * 账户利率
     *
     * @return
     */
    protected abstract double getInterestRate();

    /**
     * 获取金额
     *
     * @param accountType
     * @param accountNumber
     * @return
     */
    public double calculateAmount(String accountType, String accountNumber) {
        // 访问数据库
        return 100;
    }

    /**
     * 计算利息
     *
     * @return
     */
    public double calculateInterest() {
        String accountType = getAccountType();
        double interestRate = getInterestRate();
        double amount = calculateAmount(accountType, accountNumber);
        return amount * interestRate;
    }
}
