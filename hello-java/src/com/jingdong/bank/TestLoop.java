package com.jingdong.bank;

public class TestLoop {

    public static void main(String[] args) {

        int sum = 0;

        // 1.int i = 1;
        // 2.i <= 100;
        // 3.sum += i;
        // 4.i++;
        // 5. 2

        // 有循环操作时，尽量用for循环
        for (int i = 1; i <= 100; i++) {
            sum += i;//sum = sum + i;
        }
        System.out.println("for:" + sum);


        sum = 0;
        int i = 1;

        // 1.判断 i<=100
        // 2.如果1为真，就执行方法体里面的内容（i++别漏了）
        // 3.执行1的操作
        while(i<=100) {
            sum+=i;
            i++;
        }
        System.out.println("while:" + sum);

        sum = 0;
        i = 1;

        // 1.执行方法体里面的内容（i++别漏了）
        // 2.判断 i<=100
        // 2.如果2为真，就执行1里的操作
        // 至少会做一次
        do {
            sum+=i;
            i++;
        }
        while(i<=100);
        System.out.println("do while:" + sum);

    }

}
