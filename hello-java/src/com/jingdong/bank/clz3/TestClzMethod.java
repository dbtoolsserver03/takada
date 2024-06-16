package com.jingdong.bank.clz3;

import java.util.Date;

import com.jingdong.bank.clz.Car;

public class TestClzMethod {

    public static void main(String[] args) {

        String str ="abc";

        String a ="123";

        Date myDate = new Date();
        Car myCar = new Car("bmw",null,1550,5000000);
        System.out.println(str);
        System.out.println(myDate);
        System.out.println(myCar);
        System.out.println("----------");

        // 没有改成功
        canNotedit(str,myDate,myCar);

        // 改成功的例子
        canEdit(str,myDate,myCar);


        System.out.println(str);
        System.out.println(myDate);
        System.out.println(myCar);
    }

    private static void canNotedit(String str, Date myDate, Car myCar) {
        str = "123";
        myDate = new Date(1991, 1, 1);
        myCar = new Car("byd",null,1550,5000000);
    }
    private static void canEdit(String str, Date myDate, Car myCar) {
        // String 因为没有能改变自身成员的set方法，所以改不了
        str = new String("123");
        myDate.setYear(1999);
        myCar.setBrand("xiaomi");
    }
}
