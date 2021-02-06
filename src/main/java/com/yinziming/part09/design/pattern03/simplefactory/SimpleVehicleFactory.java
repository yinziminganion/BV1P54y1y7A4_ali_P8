package com.yinziming.part09.design.pattern03.simplefactory;

public class SimpleVehicleFactory {
    public Vehicle get(String s) {
        if ("car".equals(s)) return new Car();
        if ("plane".equals(s)) return new Plane();
        else return null;
    }
}
