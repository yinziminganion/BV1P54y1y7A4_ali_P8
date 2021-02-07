package com.yinziming.part09.design.pattern09.observer.v08;

import java.util.ArrayList;
import java.util.List;

/**
 * 有很多时候，观察者需要根据事件的具体情况来进行处理
 * 大多数时候，我们处理事件的时候，需要事件源对象
 * 事件也可以形成继承体系
 */
public class Main {
    /**
     * 观察者模式的典型命名有
     * Observer
     * Listener
     * Hook
     * Callback
     */
    public static void main(String[] args) {
        Child c = new Child();
        //do sth
        c.wakeup();
    }
}

class Child {
    private boolean cry = false;

    private List<Observer> observers = new ArrayList<>();

    {
        observers.add(new Dad());
        observers.add(new Mum());
        observers.add(new Dog());
        observers.add(System.out::println);
        //hook callback function
    }


    public boolean isCry() {
        return cry;
    }

    public void wakeup() {
        cry = true;

        WakeupEvent event = new WakeupEvent(System.currentTimeMillis(), "bed", this);

        for (Observer o : observers) {
            o.actionOnWakeUp(event);
        }
    }

    @Override
    public String toString() {
        return "Child{" +
                "cry=" + cry +
                ", observers=" + observers +
                '}';
    }
}

abstract class Event<T> {
    abstract T getSource();

}

class WakeupEvent extends Event<Child> {
    long timestamp;
    String loc;
    Child source;

    public WakeupEvent(long timestamp, String loc, Child source) {
        this.timestamp = timestamp;
        this.loc = loc;
        this.source = source;
    }

    @Override
    Child getSource() {
        return source;
    }

    @Override
    public String toString() {
        return "WakeupEvent{" +
                "timestamp=" + timestamp +
                ", loc='" + loc + '\'' +
                '}';
    }
}

interface Observer {
    void actionOnWakeUp(WakeupEvent event);

}

class Dad implements Observer {

    public void feed() {
        System.out.println("dad feeding...");
    }

    @Override
    public void actionOnWakeUp(WakeupEvent event) {
        feed();
    }

}

class Mum implements Observer {

    public void hug() {
        System.out.println("mum hugging...");
    }

    @Override
    public void actionOnWakeUp(WakeupEvent event) {
        hug();
    }

}

class Dog implements Observer {

    public void wolf() {
        System.out.println("dog wang...");
    }

    @Override
    public void actionOnWakeUp(WakeupEvent event) {
        wolf();
    }

}
