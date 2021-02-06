package com.yinziming.part09.design.pattern04.abstractfactory.vehicle;

public class Car extends Vehicle {

    @Override
    public void go() {
        System.out.println("---car moving forward---");
    }
}
