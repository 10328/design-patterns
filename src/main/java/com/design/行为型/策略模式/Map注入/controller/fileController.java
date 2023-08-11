package com.design.行为型.策略模式.Map注入.controller;

import com.design.行为型.策略模式.Map注入.FileCommon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @Classname fileController
 * @Date 2021/5/9 17:15
 */
@Controller
public class fileController {
    @Autowired
    Map<String, FileCommon> fileCommonMap;

    @RequestMapping("/upload")
    @ResponseBody
    public String upload() {
        FileCommon oss = fileCommonMap.get("oss");
        return oss.saveUrl();
    }
}
