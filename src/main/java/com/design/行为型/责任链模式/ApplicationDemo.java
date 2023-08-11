package com.design.行为型.责任链模式;

/**
 * @Classname ApplicationDemo
 * @Date 2021/5/9 23:53
 */
public class ApplicationDemo {
    public static void main(String[] args) {
        String data = "政治数据";
        String yesData = "123456";
        SensitiveWordFilterChain filterChain = new SensitiveWordFilterChain();
        filterChain.addFilter(new PoliticalWordFilter());
        filterChain.addFilter(new AdWordFilter());
        System.out.println(filterChain.filter(data));
        System.out.println(filterChain.filter(yesData));
    }
}
