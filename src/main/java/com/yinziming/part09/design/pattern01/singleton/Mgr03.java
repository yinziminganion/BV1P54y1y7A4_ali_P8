package com.yinziming.part09.design.pattern01.singleton;

/**
 * lazy loading 懒汉式
 * 基本的懒汉式
 * 优点：按需初始化
 * 缺点：线程不安全
 */
public class Mgr03 {
    private static Mgr03 INSTANCE;///不能加final

    private Mgr03() {
    }

    public static Mgr03 getInstance() {
        if (null == INSTANCE) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Mgr03();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> System.out.println(Mgr03.getInstance())).start();//每个instance的引用地址不一定相同，线程不安全
        }
    }
}
