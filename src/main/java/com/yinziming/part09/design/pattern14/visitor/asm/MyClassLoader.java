package com.yinziming.part09.design.pattern14.visitor.asm;

class MyClassLoader extends ClassLoader {
    public Class defineClass(String name, byte[] b) {
        return defineClass(name, b, 0, b.length);
    }


}
