package com.design.创建型.抽象工厂;

/**
 * @Classname DellComputerFactory
 * @Date 2021/4/13 23:31
 */
public class DellComputerFactory implements ComputerFactory {
    @Override
    public Cpu madeCpu() {
        return new DellComputerCpu();
    }

    @Override
    public HardDisk madeHardDisk() {
        return new DellComputerHardDisk();
    }

    @Override
    public Memory madeMemory() {
        return new DellComputerMemory();
    }
}
