package com.yinziming.part09.design.pattern04.abstractfactory;

import com.yinziming.part09.design.pattern04.abstractfactory.food.Food;
import com.yinziming.part09.design.pattern04.abstractfactory.food.Mushroom;
import com.yinziming.part09.design.pattern04.abstractfactory.vehicle.Plane;
import com.yinziming.part09.design.pattern04.abstractfactory.vehicle.Vehicle;
import com.yinziming.part09.design.pattern04.abstractfactory.weapon.MagicStick;
import com.yinziming.part09.design.pattern04.abstractfactory.weapon.Weapon;

/**
 * 魔法世界
 */
public class MagicWorldFactory implements AbstractFactory {
    @Override
    public Food createFood() {
        return new Mushroom();
    }

    @Override
    public Vehicle createVehicle() {
        return new Plane();
    }

    @Override
    public Weapon createWeapon() {
        return new MagicStick();
    }
}
