package com.design.行为型.模板方法模式;

/**
 * @Classname ClientAccount
 * @Date 2021/5/9 22:35
 */
public class ClientAccount {
    public static void main(String[] args) {

        DemandAccount demandAccount = new DemandAccount();
        System.out.println("活期利息: " + demandAccount.calculateInterest());

        FixedAccount fixedAccount = new FixedAccount();
        System.out.println("定期利息: " + fixedAccount.calculateInterest());
    }
}
