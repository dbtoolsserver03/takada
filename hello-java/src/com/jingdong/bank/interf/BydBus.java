package com.jingdong.bank.interf;


// 类可以继承具只能继承一个类，同时实现多个接口
public class BydBus extends Bus implements MyColor,MyEngine {

    @Override
    public void callMyColor() {
       System.out.println("byd color");
    }
    @Override
    public void callName() {
        System.out.println("bydBus");
    }
    @Override
    public void callMyEngine() {
        System.out.println("bydBus engine");

    }
}
