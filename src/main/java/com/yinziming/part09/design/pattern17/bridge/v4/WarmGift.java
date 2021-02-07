package com.yinziming.part09.design.pattern17.bridge.v4;

public class WarmGift extends Gift {
    public WarmGift(GiftImpl impl) {
        this.impl = impl;
    }
}
