package com.jingdong.bank.clz2;

import java.util.Date;

import com.jingdong.bank.clz.Car;


public class TestCar {

    public static void main(String[] args) {

        Car benchi = new Car("benchi",new Date(),1550,5000000);

        benchi.setHeight(1000);

        // 无修饰 フィールド Car.brand は不可視です 同一个包下才可见
        //System.out.println(benchi.brand);

        System.out.println(benchi.getBrand());
        // 私有不可见 フィールド Car.madeDay は不可視です
        //System.out.println(benchi.madeDay);
        System.out.println(benchi.getMadeDay());
        // 可继承 フィールド Car.brand は不可視です 同一个包下才可见
        //System.out.println(benchi.height);


        System.out.println(benchi.getHeight());
        // 公开
        System.out.println(benchi.price);

    }
}
