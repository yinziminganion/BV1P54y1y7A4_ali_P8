package com.yinziming.part09.design.pattern04.abstractfactory;

import com.yinziming.part09.design.pattern04.abstractfactory.food.Food;
import com.yinziming.part09.design.pattern04.abstractfactory.vehicle.Vehicle;
import com.yinziming.part09.design.pattern04.abstractfactory.weapon.Weapon;

interface AbstractFactory {
    Food createFood();

    Vehicle createVehicle();

    Weapon createWeapon();
}
