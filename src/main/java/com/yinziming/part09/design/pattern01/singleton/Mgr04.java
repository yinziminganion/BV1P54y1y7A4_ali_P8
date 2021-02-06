package com.yinziming.part09.design.pattern01.singleton;

/**
 * getInstance()添加synchronized
 * 效率下降
 */
public class Mgr04 {
    private static Mgr04 INSTANCE;///不能加final

    private Mgr04() {
    }

    public synchronized static Mgr04 getInstance() {
        if (null == INSTANCE) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Mgr04();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> System.out.println(Mgr04.getInstance())).start();
        }
    }
}
