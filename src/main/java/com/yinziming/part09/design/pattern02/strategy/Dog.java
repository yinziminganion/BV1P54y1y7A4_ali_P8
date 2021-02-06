package com.yinziming.part09.design.pattern02.strategy;

public class Dog implements Comparable<Dog> {
    int weight, height;

    public Dog(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

    @Override
    public int compareTo(Dog o) {
        if (this.height > o.height) return -1;
        else if (this.height < o.height) return 1;
        else return Integer.compare(o.weight, this.weight);
    }
}
