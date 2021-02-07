package com.yinziming.part09.design.pattern11.flyweight;

/**
 * 享元模式
 */
public class TestString {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = new String("abc");
        System.out.println("s1 == s2 = " + (s1 == s2));
        System.out.println("(s1 == s3) = " + (s1 == s3));
        System.out.println("(s3 == s4) = " + (s3 == s4));
        System.out.println("(s1 == s3.intern()) = " + (s1 == s3.intern()));
        System.out.println("(s3.intern() == s4.intern()) = " + (s3.intern() == s4.intern()));
    }
}
