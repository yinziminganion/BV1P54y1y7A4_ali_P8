package com.yinziming.part09.design.pattern09.observer.v02;

/**
 * 面向对象的傻等
 */
public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        while (!child.isCry()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Observing");
        }
    }
}

class Child {
    private boolean cry = false;

    public boolean isCry() {
        return cry;
    }

    public void wakeup() {
        System.out.println("Child waked up! Crying...");
        cry = true;
    }
}
