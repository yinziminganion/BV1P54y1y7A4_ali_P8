package com.yinziming.part09.design.pattern06.mediator;


abstract class SmartMediator {
    //保留所有设备的引用是为了当接收指令时可以唤醒其他设备的操作
    SmartDevice bd;
    SmartDevice md;
    SmartDevice cd;

    public SmartMediator(SmartDevice bd, SmartDevice md, SmartDevice cd) {
        super();
        this.bd = bd;
        this.md = md;
        this.cd = cd;
    }

    public abstract void music(String instruction);

    public abstract void curtain(String instruction);

    public abstract void bath(String instruction);
}

class ConcreteMediator extends SmartMediator {

    public ConcreteMediator(SmartDevice bd, SmartDevice cd, SmartDevice md) {
        super(bd, cd, md);
    }

    public void music(String instruction) {//音乐被唤醒后，使其他设备进入准备状态
        cd.readyState(instruction);//调用窗帘的准备方法
        bd.readyState(instruction);//调用洗浴设备的准备方法
    }

    public void curtain(String instruction) {
        md.readyState(instruction);
        bd.readyState(instruction);
    }

    public void bath(String instruction) {
        cd.readyState(instruction);
        md.readyState(instruction);
    }

}