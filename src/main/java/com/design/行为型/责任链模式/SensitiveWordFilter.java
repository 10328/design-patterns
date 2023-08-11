package com.design.行为型.责任链模式;

/**
 * @Classname SensitiveWordFilter
 * @Date 2021/5/9 23:39
 */
public interface SensitiveWordFilter {
    boolean doFilter(String content);
}
