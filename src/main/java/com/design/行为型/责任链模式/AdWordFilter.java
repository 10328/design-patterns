package com.design.行为型.责任链模式;

/**
 * @Classname AdWordFilter
 * @Date 2021/5/9 23:46
 */
public class AdWordFilter implements SensitiveWordFilter {
    @Override
    public boolean doFilter(String content) {
        if (content.contains("广告")) {
            return false;
        }
        return true;
    }
}
