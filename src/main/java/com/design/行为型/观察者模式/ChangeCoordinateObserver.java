package com.design.行为型.观察者模式;


/**
 * @Classname ChangeCoordinateObserver
 * @Date 2021/5/9 21:29
 */
public class ChangeCoordinateObserver implements ClickableObServer {
    @Override
    public void clicked(Clickable clickable) {
        Button button = (Button) clickable;
        button.x = 0;
        button.y = 0;
    }
}
