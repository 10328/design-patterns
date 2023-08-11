package com.design.结构型.外观模式;

/**
 * @Classname Airport
 * @Description 飞机场
 * @Date 2021/4/28 0:52
 */
public class Airport {
    /**
     * 订票
     */
    void bookTicket(String from, String to) {
        System.out.println("订购了 从" + from + "到" + to + " 的机票");
    }
}
