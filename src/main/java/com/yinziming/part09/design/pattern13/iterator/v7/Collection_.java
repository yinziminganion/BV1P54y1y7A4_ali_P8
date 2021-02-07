package com.yinziming.part09.design.pattern13.iterator.v7;

public interface Collection_<E> {
    void add(E o);

    int size();

    Iterator_<E> iterator();
}
