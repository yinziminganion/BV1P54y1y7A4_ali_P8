package com.yinziming.part09.design.pattern01.singleton;

/**
 * 不但可以解决线程同步，还可以防止反序列化
 */
public enum Mgr08 {
    INSTANCE;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> System.out.println(Mgr08.INSTANCE.hashCode())).start();
        }
    }
}
