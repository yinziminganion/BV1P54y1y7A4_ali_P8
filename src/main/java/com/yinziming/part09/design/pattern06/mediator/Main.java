package com.yinziming.part09.design.pattern06.mediator;


public class Main {
    /**
     * 作用
     * 中介者对象封装了一系列的对象交互，中介者使各对象不需要彼此联系来相互作用，从而使耦合松散，而且可以独立的改变他们之间的交互。
     * <p>
     * 应用场景
     * 当有多个对象彼此间相互交互的时候，自然就会想到对象间的耦合度过高，解决办法就是封装对象间的交互行为，因此就能想到中介者模式就是干这行的。
     * <p>
     * 应用到的设计原则
     * 高内聚，低耦合，使用中介者明显降低了对象之间的耦合
     * <p>
     * 中介者模式优点
     * 通过让对象彼此解耦，增加对象的复用性
     * 通过将控制逻辑集中，可以简化系统维护
     * 通过中介者使一对所变成了一堆一，便于理解
     * <p>
     * 缺点
     * 如果涉及不好，引入中介者会使程序变的复杂
     * 中介者承担过多责任，维护不好会出大事
     */
    public static void main(String[] args) {
        SmartDevice bd = new BathDevice();
        SmartDevice cd = new CurtainDevice();
        SmartDevice md = new MusicDevice();
        SmartMediator sm = new ConcreteMediator(bd, cd, md);//把设备引用都保存在调停者中
        cd.operateDevice("open", sm); //开启窗帘
        md.operateDevice("close", sm);//关闭音乐
    }
}


