package com.yinziming.part09.design.pattern18.command;

public abstract class Command {
    public abstract void doit(); //exec / run
    public abstract void undo();
}
