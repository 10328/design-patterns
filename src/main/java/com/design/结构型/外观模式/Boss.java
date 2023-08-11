package com.design.结构型.外观模式;

/**
 * @Classname Boss
 * @Date 2021/4/28 0:52
 */
public class Boss {
    private static Secretary secretary = new Secretary();

    public static void trip(String to, int num) {
        secretary.trip(to, num);
    }

    public static void repast(int num) {
        secretary.repast(num);
    }

    public static void main(String[] args) {
        String to = "天津";
        int day = 3;
        System.out.println("老板告诉助理去" + to + " 出差" + day + "天");
        trip(to, day);
        System.out.println("======================");
        int num = 5;
        repast(num);
    }

}
