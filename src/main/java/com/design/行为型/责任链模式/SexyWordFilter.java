package com.design.行为型.责任链模式;

/**
 * @Classname AdWordFilter
 * @Date 2021/5/9 23:46
 */
public class SexyWordFilter implements SensitiveWordFilter {
    @Override
    public boolean doFilter(String content) {
        if (content.contains("色情")) {
            return false;
        }
        return true;
    }
}
