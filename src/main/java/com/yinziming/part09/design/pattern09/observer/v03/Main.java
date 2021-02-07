package com.yinziming.part09.design.pattern09.observer.v03;

/**
 * 加入观察者
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

    public boolean isCry() {
        return cry;
    }

    public void wakeup() {
        System.out.println("Child waked up! Crying...");
        cry = true;
        dad.feed();
    }
}

class Dad {
    public void feed() {
        System.out.println("Dad feeding...");
    }
}