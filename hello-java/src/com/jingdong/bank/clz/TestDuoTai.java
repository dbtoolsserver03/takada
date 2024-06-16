package com.jingdong.bank.clz;

public class TestDuoTai {

    public static void main(String[] args) {

         Car car = new Car();


//         Car dCar = new Date();

//         BevCar bCar = new Car();

         // aCar 是变量
         // aCar 类型是 Car
         // aCar 接收aCar类型的子类对象
        Car aCar = new BevCar();
        aCar.run();


        System.out.println(11111);

        Car hCar = new HyCar();
        Car[] cars = {car,aCar,hCar};

        System.out.println("-------------");
        for (Car myCar : cars) {
            // 类的多态
            //（用父类变量来接收子类对象，当调用多态方法时，会根据对象的类型来调用方法）
            myCar.run();
        }

//        BevCar[] cars = {car,aCar,hCar};


        Object[] objs = {car,aCar,hCar};

        System.out.println("-------------");
        for (Object obj : objs) {
            // 类的多态
            //（用父类变量来接收子类对象，当调用多态方法时，会根据对象的类型来调用方法）
            ((Car)obj).run();
        }


    }
}
