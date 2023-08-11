package com.design.创建型.抽象工厂;

/**
 * @Classname XmComputerFactory
 * @Date 2021/4/13 23:39
 */
public class XmComputerFactory implements ComputerFactory {
    @Override
    public Cpu madeCpu() {
        return new XmComputerCpu();
    }

    @Override
    public HardDisk madeHardDisk() {
        return new XmComputerHardDisk();
    }

    @Override
    public Memory madeMemory() {
        return new XmComputerMemory();
    }
}
