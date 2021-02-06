package com.yinziming.part09.design.pattern04.abstractfactory;

import com.yinziming.part09.design.pattern04.abstractfactory.food.Food;
import com.yinziming.part09.design.pattern04.abstractfactory.vehicle.Vehicle;
import com.yinziming.part09.design.pattern04.abstractfactory.weapon.Weapon;

/**
 * P167
 * 抽象工厂
 */
public class Main {
    public static void main(String[] args) {
        ModernFactory modernFactory = new ModernFactory();
        Food food = modernFactory.createFood();
        Weapon weapon = modernFactory.createWeapon();
        Vehicle vehicle = modernFactory.createVehicle();
        System.out.println(food);
        System.out.println(weapon);
        System.out.println(vehicle);

        MagicWorldFactory magicWorldFactory = new MagicWorldFactory();
        Food food1 = magicWorldFactory.createFood();
        Weapon weapon1 = magicWorldFactory.createWeapon();
        Vehicle vehicle1 = magicWorldFactory.createVehicle();
        System.out.println(food1);
        System.out.println(weapon1);
        System.out.println(vehicle1);
    }
}
