package com.design.创建型.抽象工厂;

/**
 * @Classname DellComputerHardDisk
 * @Date 2021/4/13 23:26
 */
public class DellComputerHardDisk implements HardDisk {
    @Override
    public void makeHardDisk() {
        System.out.println("制作戴尔硬盘..");
    }
}
