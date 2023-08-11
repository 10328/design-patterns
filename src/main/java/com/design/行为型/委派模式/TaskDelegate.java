package com.design.行为型.委派模式;

/**
 * @Classname TaskDelegate
 * @Date 2021/5/9 23:27
 */
public class TaskDelegate implements Task {
    @Override
    public void doTask() {
        System.out.println("委派执行之前");
        Task task = null;
        if (Math.random() > 0.5) {
            task = new ConcreteTaskA();
            task.doTask();
        } else {
            task = new ConcreteTaskB();
            task.doTask();
        }
        System.out.println("委派执行之后");
    }
}
