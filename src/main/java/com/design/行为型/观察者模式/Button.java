package com.design.行为型.观察者模式;

import java.util.Vector;

/**
 * @Classname Button
 * @Date 2021/5/9 21:17
 */
public class Button implements Clickable {

    // 存储注册过的单击事件观察者
    Vector<ClickableObServer> obServers = new Vector<>();

    // 颜色
    String color;

    // 坐标
    int x, y;

    @Override
    public void click() {
        System.out.println("按钮被点击了");
        for (int i = 0; i < obServers.size(); i++) {
            obServers.get(i).clicked(this);
        }
    }

    @Override
    public void addClickableObserver(ClickableObServer obServer) {
        obServers.add(obServer);
    }

    @Override
    public void removeClickableObserver(ClickableObServer obServer) {
        obServers.remove(obServer);
    }

    @Override
    public String toString() {
        return "颜色='" + color + '\'' +
                ", x=" + x +
                ", y=" + y;
    }
}
