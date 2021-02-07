package com.yinziming.part09.design.pattern11.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

class Bullet {
    public UUID id = UUID.randomUUID();
    boolean living = false;

    @Override
    public String toString() {
        return "Bullet{" +
                "id=" + id +
                '}';
    }
}

public class BulletPool {
    List<Bullet> bullets = new ArrayList<>();

    {
        for (int i = 0; i < 5; i++) bullets.add(new Bullet());
    }

    public Bullet getBullet() {
        for (Bullet b : bullets) {
            if (!b.living) {
                b.living = true;
                return b;
            }
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Bullet();
    }

    public static void main(String[] args) {
        BulletPool bp = new BulletPool();

        for (int i = 0; i < 10; i++) {
            Bullet b = bp.getBullet();
            System.out.println(b);
        }
    }

}