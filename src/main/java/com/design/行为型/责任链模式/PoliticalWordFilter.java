package com.design.行为型.责任链模式;

/**
 * @Classname PoliticalWordFilter
 * @Date 2021/5/9 23:42
 */
public class PoliticalWordFilter implements SensitiveWordFilter {
    @Override
    public boolean doFilter(String content) {
        if (content.contains("政治")) {
            return false;
        }
        return true;
    }
}
