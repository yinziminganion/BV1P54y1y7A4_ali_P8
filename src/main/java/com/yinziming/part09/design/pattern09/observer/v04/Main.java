package com.yinziming.part09.design.pattern09.observer.v04;

/**
 * 加入多个观察者
 * 此方式耦合度太高
 */
public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        try {
            Thread.sleep(2000);//do something
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        child.wakeup();
    }
}

class Child {
    private boolean cry = false;
    private Dad dad = new Dad();
    private Mum mum = new Mum();
    private Dog dog = new Dog();

    public boolean isCry() {
        return cry;
    }

    public void wakeup() {
        cry = true;
        dad.feed();
        dog.wolf();
        mum.hug();
        cry = false;
    }
}

class Dad {
    void feed() {
        System.out.println("Dad feed()");
    }
}

class Mum {
    void hug() {
        System.out.println("Mum hug()");
    }
}

class Dog {
    void wolf() {
        System.out.println("Dog wolf()");
    }
}