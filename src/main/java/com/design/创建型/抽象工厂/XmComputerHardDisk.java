package com.design.创建型.抽象工厂;

/**
 * @Classname XmComputerHardDisk
 * @Date 2021/4/13 23:38
 */
public class XmComputerHardDisk implements HardDisk {
    @Override
    public void makeHardDisk() {
        System.out.println("制作小米硬盘..");
    }
}
