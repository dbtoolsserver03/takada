package com.jingdong.bank.clz;

// 凡是java.lang包下的类，不需要明文导入（相当于放到系统 环境变更 的感觉）
import java.util.Date;

// 类的三个特征
// 1。封装   对属性进行封装
// 2。继承
// 3。多态

public class Car {

    // 如果没有构造方法，那么就默认提供无参的构造方法
    // 如果提供了构造方法，那么无参的构造方法就不再默认提供，
    // 如果还想提供无参的构造方法，就需要在代码里手动加上
    public Car(String brand, Date madeDay, int height, int price) {
        this.brand = brand;
        this.madeDay = madeDay;
        this.price = price;
        this.height = height;
    }

    // 默认的无参构造方法
    public Car() {

    }

    // 下面是类的项目/属性/字段

    // 无修饰
    String brand;

    // 私有
    private Date madeDay;

    // 可继承
    protected int height;

    // 公开
    public int price;


    // 通过eclipse自动生成对类成员访问的公开方法
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Date getMadeDay() {
        return madeDay;
    }

    public void setMadeDay(Date madeDay) {
        this.madeDay = madeDay;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
