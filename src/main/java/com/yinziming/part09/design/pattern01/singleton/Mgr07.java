package com.yinziming.part09.design.pattern01.singleton;

/**
 * 懒汉式的另一种思路：静态内部类
 * 静态内部类方式
 * JVM保证单例
 * 加载外部类时不会加载内部类，实现懒加载
 */
public class Mgr07 {
    private Mgr07() {
    }

    private static class Mgr07Holder {
        private final static Mgr07 INSTANCE = new Mgr07();
    }

    public static Mgr07 getInstance() {
        return Mgr07Holder.INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> System.out.println(Mgr07.getInstance())).start();
        }
    }
}
