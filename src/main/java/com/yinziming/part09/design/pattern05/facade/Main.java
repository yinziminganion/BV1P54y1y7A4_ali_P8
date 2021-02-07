package com.yinziming.part09.design.pattern05.facade;

/**
 * 门面/外观模式
 * Facade类其实相当于A、B、C模块的外观界面，有了这个Facade类，那么客户端就不需要亲自调用子系统中的A、B、C模块了，
 * 也不需要知道系统内部的实现细节，甚至都不需要知道A、B、C模块的存在，客户端只需要跟Facade类交互就好了，
 * 从而更好地实现了客户端和子系统中A、B、C模块的解耦，让客户端更容易地使用系统。
 */
public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.func();
    }
}

class Facade {
    //示意方法，满足客户端需要的功能
    public void func() {
        ModuleA a = new ModuleA();
        a.funcA();
        ModuleB b = new ModuleB();
        b.funcB();
        ModuleC c = new ModuleC();
        c.funcC();
    }
}

class ModuleA {
    //示意方法
    public void funcA() {
        System.out.println("调用ModuleA中的funcA方法");
    }
}

class ModuleB {
    //示意方法
    public void funcB() {
        System.out.println("调用ModuleB中的funcB方法");
    }
}

class ModuleC {
    //示意方法
    public void funcC() {
        System.out.println("调用ModuleC中的funcC方法");
    }
}