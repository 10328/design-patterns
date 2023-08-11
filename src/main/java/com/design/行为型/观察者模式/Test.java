package com.design.行为型.观察者模式;

/**
 * @Classname Test
 * @Date 2021/5/9 21:31
 */
public class Test {
    public static void main(String[] args) {
        Button button = new Button();
        button.color = "白色";
        button.x = 10;
        button.y = 20;
        button.addClickableObserver(new ChangeColorObserver());
        button.addClickableObserver(new ChangeCoordinateObserver());
        button.click();
        System.out.println(button.toString());
    }
}
