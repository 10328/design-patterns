package com.design.行为型.责任链模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname SensitiveWordFilterChain
 * @Date 2021/5/9 23:51
 */
public class SensitiveWordFilterChain {
    private List<SensitiveWordFilter> filters = new ArrayList<>();

    public void addFilter(SensitiveWordFilter filter) {
        this.filters.add(filter);
    }

    public boolean filter(String content) {
        for (SensitiveWordFilter filter : filters) {
            if (!filter.doFilter(content)) {
                return false;
            }
        }
        return true;
    }
}
