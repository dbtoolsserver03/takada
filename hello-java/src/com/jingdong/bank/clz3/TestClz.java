package com.jingdong.bank.clz3;

public class TestClz {

    public static void main(String[] args) {

        String a = "aaa";
        String b = "bbb";
        String c="aaabbb";

        String ab = a+b;

        System.out.println(ab);

        // == 判断内存地址 一旦比较字符串用 == 必死无疑
        System.out.println(ab == c);

        // equals 字符串一定要用equals方法比较内容是否一样
        System.out.println(ab.equals(c));
    }
}
