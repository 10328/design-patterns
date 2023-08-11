package com.design.行为型.模板方法模式.CallBack;

/**
 * @Classname BClass
 * @Date 2021/5/9 23:02
 */
public class BClass {
    static void process(ICallBack iCallBack) {
        System.out.println("回调方法执行前");
        iCallBack.methodCallBack();
        System.out.println("回调方法执行后");
    }
}
