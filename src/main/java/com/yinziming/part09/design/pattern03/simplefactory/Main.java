package com.yinziming.part09.design.pattern03.simplefactory;

/**
 * P167
 * 任何可以产生对象的方法或类，都可以称之为工厂
 * (1)简单工厂
 * (2)抽象工厂
 * <p>
 * 单例也是一种工厂
 * <p>
 * 有了new为什么还要工厂？
 * （1）灵活控制市场过程
 * （2）权限、修饰、日志。。。。。。
 * <p>
 * 举例
 * （1）任意定制交通工具：继承Movable
 * （2）任意定制生产过程XxxFactory.create()
 * （3）任意定制产品一族
 */
public class Main {
    public static void main(String[] args) {
        SimpleVehicleFactory simpleVehicleFactory = new SimpleVehicleFactory();
        Vehicle car = simpleVehicleFactory.get("car");
        Vehicle plane = simpleVehicleFactory.get("plane");
        car.go();
        plane.go();
    }
}
