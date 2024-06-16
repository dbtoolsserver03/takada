package com.jingdong.bank.clz;

import java.util.Date;

// 类的继承 BevCar继承Car 是Car的子类
// Car里面的非私有（private）属性，BevCar也拥有
// Car里面的非私有（private）方法，BevCar也拥有

/**
 * 纯电
 */
public class BevCar extends Car {

    /**
     * 纯电
     */
    public BevCar() {
        super();
        System.out.println("bevcar...");
    }

    public BevCar(String brand, Date madeDay, int height, int price) {
        super(brand, madeDay, height, price);
    }

    public void printMember() {
        // 因为不在同一个包里，所以下面写法会报错
        System.out.println(this.brand);
        // 因为是继承关系，可以访问
        System.out.println(this.height);
    }

    @Override
    public void run() {
        System.out.println("bevcar ZIZI");
    }

}
