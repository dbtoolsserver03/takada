package com.jingdong.bank.clz;


// 因为Car和TestCar在同一个包里，所以不需要明文导入
import java.util.Date;


public class TestCar {

    public static void main(String[] args) {

        Car benchi = new Car("benchi",new Date(),1550,5000000);

        // 无修饰
        System.out.println(benchi.brand);

        // 私有不可见 フィールド Car.madeDay は不可視です
        //System.out.println(benchi.madeDay);
        System.out.println(benchi.getMadeDay());

        // 可继承
        System.out.println(benchi.height);

        // 公开
        System.out.println(benchi.price);

    }
}
