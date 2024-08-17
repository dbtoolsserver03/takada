package com.oralce.study;

import java.util.Arrays;
import java.util.Collections;

public class Hairetsu2 {
    public static void main(String[] args) {
        Integer[] array = {9, 2, 3, 4, 5, 4};
        
        // 降序排序
        Arrays.sort(array, Collections.reverseOrder());
        
        // 打印排序后的数组
        System.out.println("降序排序后的数组: " + Arrays.toString(array));
    }
}