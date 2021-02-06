package com.yinziming.part09.design.pattern04.abstractfactory.weapon;

public class MagicStick extends Weapon {
    @Override
    public void shoot() {
        System.out.println("---magic stick bling bling bling---");
    }
}
