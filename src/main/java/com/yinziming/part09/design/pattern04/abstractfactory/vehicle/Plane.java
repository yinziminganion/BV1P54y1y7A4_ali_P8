package com.yinziming.part09.design.pattern04.abstractfactory.vehicle;

public class Plane extends Vehicle {
    @Override
    public void go() {
        System.out.println("---plane moving forward---");
    }
}
