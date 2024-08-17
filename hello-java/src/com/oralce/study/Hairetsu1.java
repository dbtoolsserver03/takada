package com.oralce.study;

import java.util.Arrays;

public class Hairetsu1 {
	public static void main(String[] args) {
        int[] array = {9, 2, 3, 4, 5, 4};
        
        // 升序排序
        Arrays.sort(array);
        
        // 打印排序后的数组
        System.out.println("升序排序后的数组: " + Arrays.toString(array));
    }

}
