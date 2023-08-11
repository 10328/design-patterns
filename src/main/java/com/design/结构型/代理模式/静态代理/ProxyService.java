package com.design.结构型.代理模式.静态代理;

/**
 * @Classname ProxyService
 * @Date 2021/4/25 22:51
 */
public class ProxyService implements Service {

    Service userServiceImpl;

    public ProxyService(Service userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @Override
    public void service() {
        // do permission sercurity
        // 逻辑判断
        System.out.println("增加日志消息...........");
        userServiceImpl.service();
    }
}
