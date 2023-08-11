package com.design.行为型.观察者模式;

/**
 * @Classname ChangeColorObserver
 * @Description 观察颜色发生变化
 * @Date 2021/5/9 21:16
 */
public class ChangeColorObserver implements ClickableObServer {
    @Override
    public void clicked(Clickable clickable) {
        Button button = (Button) clickable;
        button.color = "红色";
    }
}
