package com.design.行为型.策略模式.Map注入.service;

import com.design.行为型.策略模式.Map注入.FileCommon;
import org.springframework.stereotype.Service;

/**
 * @Classname FastDfsService
 * @Date 2021/5/9 17:13
 */
@Service("fastDfs")
public class FastDfsService implements FileCommon {
    @Override
    public String saveUrl() {
        return "fastDfs";
    }
}
