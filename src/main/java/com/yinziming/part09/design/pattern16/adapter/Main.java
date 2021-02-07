package com.yinziming.part09.design.pattern16.adapter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * 适配器模式的主要作用是在两个互不兼容的接口之间提供一个桥梁
 * 常见的Adapter结尾的类反而不是Adapter设计模式
 * 比如WindowAdapter和KeyAdapter，只是将其父类的抽象方法重写为空方法，便于需要用的时候只需要重写其中一个方法而不需要显式重写所有方法
 */
public class Main {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("c:/test.text");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        while (line != null && !line.equals("")) {
            System.out.println(line);
        }
        br.close();


    }
}
