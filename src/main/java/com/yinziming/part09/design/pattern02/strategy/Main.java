package com.yinziming.part09.design.pattern02.strategy;

import java.util.Arrays;

/**
 * P166
 * 策略模式 比较器的例子
 * Comparable
 * Comparator
 */
public class Main {
    public static void main(String[] args) {

        int[] ints = {9, 2, 3, 5, 7, 1, 4};
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));

        Dog[] dogs = {new Dog(1, 1), new Dog(2, 2), new Dog(3, 3),
                new Dog(1, 2), new Dog(2, 1),
                new Dog(1, 3), new Dog(3, 1),
                new Dog(2, 3), new Dog(3, 2)};
        Arrays.sort(dogs, (o1, o2) -> {
            if (o1.weight > o2.weight) return 1;
            else if (o1.weight < o2.weight) return -1;
            else return Integer.compare(o1.height, o2.height);
        });
        System.out.println(Arrays.toString(dogs));
    }
}
