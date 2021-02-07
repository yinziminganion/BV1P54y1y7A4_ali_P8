package com.yinziming.part09.design.pattern09.observer.v06;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Child c = new Child();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        c.wakeUp();
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

    public void wakeUp() {
        cry = true;

        WakeupEvent event = new WakeupEvent(System.currentTimeMillis(), "bed");

        for (Observer o : observers) {
            o.actionOnWakeUp(event);
        }
    }
}

//事件类
class WakeupEvent {
    long timestamp;
    String loc;

    public WakeupEvent(long timestamp, String loc) {
        this.timestamp = timestamp;
        this.loc = loc;
    }
}

interface Observer {
    void actionOnWakeUp(WakeupEvent e);
}

class Dad implements Observer {
    public void feed() {
        System.out.println("Dad.feed");
    }

    @Override
    public void actionOnWakeUp(WakeupEvent e) {
        feed();
    }
}

class Mum implements Observer {
    @Override
    public void actionOnWakeUp(WakeupEvent e) {
        hug();
    }

    private void hug() {
        System.out.println("Mum.hug");
    }
}

class Dog implements Observer {
    @Override
    public void actionOnWakeUp(WakeupEvent e) {
        wolf();
    }

    private void wolf() {
        System.out.println("Dog.wolf");
    }
}