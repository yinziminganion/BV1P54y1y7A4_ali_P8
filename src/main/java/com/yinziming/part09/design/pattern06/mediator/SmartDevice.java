package com.yinziming.part09.design.pattern06.mediator;

public abstract class SmartDevice {
    //相关设备打开之后 使其进入准备状态
    public abstract void readyState(String instruction);

    //操作该设备
    public abstract void operateDevice(String instruction, SmartMediator mediator);
}

class CurtainDevice extends SmartDevice {

    public void operateDevice(String instruction, SmartMediator mediator) {
        System.out.println("窗帘已" + instruction);//通过传入指令，打开或关闭窗帘
        mediator.curtain(instruction);//窗帘通过中介者唤醒音乐设备和洗浴设备
    }

    public void readyState(String instruction) {
        //如果其他设备开启则调用此方法，唤醒窗帘
        System.out.println("窗帘设备准备" + instruction);
    }

}

class MusicDevice extends SmartDevice {

    public void operateDevice(String instruction, SmartMediator mediator) {
        System.out.println("音乐设备已" + instruction);
        mediator.music(instruction);
    }

    public void readyState(String instruction) {
        System.out.println("音乐设备准备" + instruction);
    }

}

class BathDevice extends SmartDevice {

    public void operateDevice(String instruction, SmartMediator mediator) {
        System.out.println("洗浴设备" + instruction);
        mediator.bath(instruction);
    }

    public void readyState(String instruction) {
        System.out.println("洗浴设备正在准备" + instruction);
    }

}