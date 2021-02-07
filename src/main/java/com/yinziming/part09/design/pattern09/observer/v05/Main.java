package com.yinziming.part09.design.pattern09.observer.v05;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        child.wakeup();
    }
}

class Child {
    private boolean cry = false;
    private List<Observer> observers = new ArrayList<>();

    {
        observers.add(new Dad());
        observers.add(new Mum());
        observers.add(new Dog());
    }

    public boolean isCry() {
        return cry;
    }

    public void wakeup() {
        cry = true;
        for (Observer o : observers) {
            o.actionOnWakeUp();
        }
    }
}

interface Observer {
    void actionOnWakeUp();
}

class Dad implements Observer {
    public void feed() {
        System.out.println("Dad.feed");
    }

    @Override
    public void actionOnWakeUp() {
        feed();
    }
}

class Mum implements Observer {
    public void hug() {
        System.out.println("Mum.hug");
    }

    @Override
    public void actionOnWakeUp() {
        hug();
    }
}

class Dog implements Observer {
    public void wolf() {
        System.out.println("Dog.wolf");
    }

    @Override
    public void actionOnWakeUp() {
        wolf();
    }
}