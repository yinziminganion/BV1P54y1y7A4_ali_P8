package com.yinziming.part09.design.pattern01.singleton;

/**
 * 懒汉式最终版
 */
public class Mgr06 {
    //加volatile的原因https://blog.csdn.net/luzhensmart/article/details/82432645
    private static volatile Mgr06 INSTANCE;///不能加final

    private Mgr06() {
    }

    public static Mgr06 getInstance() {
        if (null == INSTANCE) {
            synchronized (Mgr06.class) {
                if (null == INSTANCE) {//双重检查
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Mgr06();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> System.out.println(Mgr06.getInstance())).start();//每个instance的引用地址不一定相同，线程不安全
        }
    }
}
