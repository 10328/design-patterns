package com.design.创建型.抽象工厂;

/**
 * @Classname ComputerFactory
 * @Date 2021/4/13 23:28
 */
public interface ComputerFactory {
    public Cpu madeCpu();

    public HardDisk madeHardDisk();

    public Memory madeMemory();
}
