package com.yinziming.part09.design.pattern01.singleton;

/**
 * 饿汉式
 * 优点：类加载时就实例化一个实例，JVM保证线程安全
 * 缺点：无论是否用到都会实例化，用不到时就有资源的浪费
 */
public class Mgr01 {
    private static final Mgr01 INSTANCE = new Mgr01();

    private Mgr01() {//构造器设置成private保证在外部无法通过new实例化，确保单例
    }

    public static Mgr01 getInstance() {
        return INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        Mgr01 m1 = Mgr01.getInstance();
        Mgr01 m2 = Mgr01.getInstance();
        System.out.println(m1);
        System.out.println(m2);
    }
}
