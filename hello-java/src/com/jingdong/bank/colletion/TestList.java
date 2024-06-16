package com.jingdong.bank.colletion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestList {

    public static void main(String[] args) {

        // 数组一旦定义，长度就定下来了，不灵活
        String[] arr = {"hello","world"};

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr.length);

        for (String str : arr) {
            System.out.println(str);
        }

        System.out.println("......list..........");
        List<String> strLst = new ArrayList<String>();

        strLst.add("hello");
        strLst.add("world");
        strLst.add("good");
        strLst.add("morning");
        strLst.remove("world");
        for (int i = 0; i < strLst.size(); i++) {
            String str = strLst.get(i);
            System.out.println(str);
        }
        Collections.sort(strLst);

        System.out.println("排序后的LIST：");
        for (String str : strLst) {
            System.out.println(str);
        }
    }
}
