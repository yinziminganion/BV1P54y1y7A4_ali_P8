package com.yinziming.part09.design.pattern03.simplefactory;

public class Plane extends Vehicle {
    @Override
    public void go() {
        System.out.println("---plane moving forward---");
    }
}
