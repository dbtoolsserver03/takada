package com.jingdong.bank.interf;

public class TestInterFace {

    public static void main(String[] args) {

        Bus bus = new Bus();
        Ship ship = new Ship();
        BydBus bydBys = new BydBus();

        // 接口不可以实例化，因为有方法没有被实现
        // Vehicle vehicle = new Vehicle();

        // MyCar のインスタンスを生成できません 因为MyCar是抽象类，所以不能生成对象
        // MyCar mycar = new MyCar();

        Vehicle[] vehicles = { bus, ship ,bydBys};
        for (Vehicle vehicle : vehicles) {
            vehicle.callName();
        }

    }

}
