package com.yinziming.part09.design.pattern04.abstractfactory;

import com.yinziming.part09.design.pattern04.abstractfactory.food.Bread;
import com.yinziming.part09.design.pattern04.abstractfactory.food.Food;
import com.yinziming.part09.design.pattern04.abstractfactory.vehicle.Car;
import com.yinziming.part09.design.pattern04.abstractfactory.vehicle.Vehicle;
import com.yinziming.part09.design.pattern04.abstractfactory.weapon.AK47;
import com.yinziming.part09.design.pattern04.abstractfactory.weapon.Weapon;

/**
 * 现实世界
 */
public class ModernFactory implements AbstractFactory {
    @Override
    public Food createFood() {
        return new Bread();
    }

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }

    @Override
    public Weapon createWeapon() {
        return new AK47();
    }
}
