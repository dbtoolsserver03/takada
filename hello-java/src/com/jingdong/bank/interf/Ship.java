package com.jingdong.bank.interf;

public class Ship implements Vehicle {

    @Override
    public void callName() {

        System.out.println("ship");
    }

    @Override
    public void callWheels() {
        System.out.println("0");

    }

}
