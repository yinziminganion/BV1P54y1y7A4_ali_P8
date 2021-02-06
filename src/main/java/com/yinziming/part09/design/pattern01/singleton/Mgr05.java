package com.yinziming.part09.design.pattern01.singleton;

public class Mgr05 {
    private static Mgr05 INSTANCE;///不能加final

    private Mgr05() {
    }

    public static Mgr05 getInstance() {
        if (null == INSTANCE) {
            synchronized (Mgr05.class) {//同步代码块方式，还未可行
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new Mgr05();
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> System.out.println(Mgr05.getInstance())).start();//每个instance的引用地址不一定相同，线程不安全
        }
    }
}
