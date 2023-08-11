package com.design.行为型.观察者模式;

/**
 * @Classname Clickable
 * @Description 抽象被观察者
 * @Date 2021/5/9 21:10
 */
public interface Clickable {
    // 单击事件
    void click();

    // 增加单击事件的观察者
    void addClickableObserver(ClickableObServer clickableObServer);

    void removeClickableObserver(ClickableObServer clickableObServer);
}
