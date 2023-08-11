package com.design.创建型.抽象工厂;

/**
 * @Classname AbstractFactoryTest
 * @Date 2021/4/13 23:32
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        ComputerFactory factory;
        // 创建Cpu
        Cpu cpu;
        // 创建硬盘
        HardDisk disk;
        // 创建内存
        Memory memory;

        //创建戴尔工厂
        factory = new DellComputerFactory();

        cpu = factory.madeCpu();
        cpu.makeCpu();

        disk = factory.madeHardDisk();
        disk.makeHardDisk();

        memory = factory.madeMemory();
        memory.makeMemory();

        //创建小米工厂
        factory = new XmComputerFactory();

        cpu = factory.madeCpu();
        cpu.makeCpu();

        disk = factory.madeHardDisk();
        disk.makeHardDisk();

        memory = factory.madeMemory();
        memory.makeMemory();
    }
}
