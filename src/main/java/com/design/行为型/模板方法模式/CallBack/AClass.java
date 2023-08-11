package com.design.行为型.模板方法模式.CallBack;

/**
 * @Classname AClass
 * @Date 2021/5/9 23:03
 */
public class AClass {
    public static void main(String[] args) {
        BClass.process(new ICallBack() {
            @Override
            public void methodCallBack() {
                System.out.println("回调方法");
            }
        });
    }
}
