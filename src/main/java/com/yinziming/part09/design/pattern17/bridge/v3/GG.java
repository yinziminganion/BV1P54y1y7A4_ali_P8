package com.yinziming.part09.design.pattern17.bridge.v3;

public class GG {
    public void chase(MM mm) {
        Gift g = new Book();
        give(mm, g);
    }

    public void give(MM mm, Gift g) {

    }


}