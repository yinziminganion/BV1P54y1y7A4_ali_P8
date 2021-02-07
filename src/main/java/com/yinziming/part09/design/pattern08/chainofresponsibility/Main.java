package com.yinziming.part09.design.pattern08.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * 责任链模式
 * 一个事件需要经过多个对象处理
 */
public class Main {
    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.setMessage("你好:)，<script>这里有敏感词！</script>");
        FilterChain filterChain = new FilterChain();
        filterChain.add(new HtmlFilter()).add(new SensitiveFilter()).add(new FaceFilter());
        filterChain.doFilter(msg);
        System.out.println(msg);
    }
}

class Msg {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "message='" + message + '\'' +
                '}';
    }
}

interface Filter {
    boolean doFilter(Msg msg);//返回boolean而不用void可以使链条在满足一定条件时提前结束
}

class HtmlFilter implements Filter {
    @Override
    public boolean doFilter(Msg msg) {
        String message = msg.getMessage();
        message = message.replaceAll("<", "[");
        message = message.replaceAll(">", "]");
        msg.setMessage(message);
        return true;
    }
}

class SensitiveFilter implements Filter {
    @Override
    public boolean doFilter(Msg msg) {
        String message = msg.getMessage();
        return !message.contains("敏感词");
    }
}

class FaceFilter implements Filter {
    @Override
    public boolean doFilter(Msg msg) {
        String message = msg.getMessage();
        String replace = message.replace(":)", "^_^");
        msg.setMessage(replace);
        return true;
    }
}

class FilterChain implements Filter {//FilterChain其实也是一个Filter
    private final List<Filter> chain = new ArrayList<>();

    public FilterChain add(Filter filter) {
        chain.add(filter);
        return this;
    }

    public boolean doFilter(Msg msg) {
        for (Filter filter : chain) {
            if (!filter.doFilter(msg)) {
                break;
            }
        }
        return true;
    }
}