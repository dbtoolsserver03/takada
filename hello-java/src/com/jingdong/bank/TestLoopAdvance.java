package com.jingdong.bank;

public class TestLoopAdvance {

    public static void main(String[] args) {

        int a = 6/2;
        System.out.println(a);

        int b = 5%3;
        System.out.println(b);

        System.out.println("----------");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {

            if (i % 7 == 0 && i % 5 == 0 && i % 2 == 0) {
                System.out.println(i);
                break;
                // 跳出循环
            }
            sum += i;
        }

        System.out.println(sum);


        System.out.println("----------");
        sum = 0;
        for (int i = 1; i <= 100; i++) {

            if (i % 7 == 0 && i % 5 == 0&& i % 2 == 0) {
                System.out.println(i);
                continue;
                // 继续下一次循环
            }
            sum += i;
        }

        System.out.println(sum);


    }

}
