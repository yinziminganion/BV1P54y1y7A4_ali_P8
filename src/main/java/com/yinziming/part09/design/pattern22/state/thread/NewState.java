package com.yinziming.part09.design.pattern22.state.thread;

public class NewState extends ThreadState_ {
    private Thread_ t;

    public NewState(Thread_ t) {
        this.t = t;
    }

    @Override
    void move(Action input) {
        if(input.msg.equals("start"))
        t.state = new RunningState(t);
    }

    @Override
    void run() {

    }
}
