package com.yinziming.part09.design.pattern08.chainofresponsibility.servlet;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }
}

class Request {
    String request;
}

class Response {
    String response;
}

interface Filter {
    boolean doFilter(Request request, Response response);//返回boolean而不用void可以使链条在满足一定条件时提前结束
}

class HtmlFilter implements Filter {
    @Override
    public boolean doFilter(Request request, Response response) {
        return false;
    }
}

class SensitiveFilter implements Filter {
    @Override
    public boolean doFilter(Request request, Response response) {
        return false;
    }
}

class FaceFilter implements Filter {
    @Override
    public boolean doFilter(Request request, Response response) {
        return false;
    }
}

class FilterChain {//FilterChain其实也是一个Filter
    private final List<Filter> chain = new ArrayList<>();

    public FilterChain add(Filter filter) {
        chain.add(filter);
        return this;
    }

    public boolean doFilter() {
        return false;
    }
}