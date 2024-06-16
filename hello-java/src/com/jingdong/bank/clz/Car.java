package com.jingdong.bank.clz;

import java.util.Date;

// 类的三个特征
// 1。封装   对属性进行封装
// 2。继承
// 3。多态

public class Car {

    // 如果没有构造方法，那么就默认提供无参的构造方法
    // 如果提供了构造方法，那么无参的构造方法就不再默认提供，
    // 如果还想提供无参的构造方法，就需要在代码里手动加上
    public Car(String brand, Date madeDay, int price, int height) {
        this.brand = brand;
        this.madeDay = madeDay;
        this.price = price;
        this.height = height;
    }

    // 默认的无参构造方法
    public Car() {

    }

    String brand;
    Date madeDay;
    int price;
    int height;

}
