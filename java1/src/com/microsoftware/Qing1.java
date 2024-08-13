package com.microsoftware;

import java.util.Arrays;

public class Qing1 {
	public static void main(String[] args) {
		int[] a1= {1,3,5,5,6,7,2,3,9,6,7,5,6,2,8,1,2,3};
		
		int x = a1.length;
		int[] a2 = new int[x];
		for (int n = 0; n < x; n++) {
            a2[n] = 0;
            } 
		
		int y = 0;
		int z = x-1;
		for (int i = 0; i < x; i++) {
        	a2[y++] = a1[z--];
        	}
		
		System.out.println("结果"+Arrays.toString(a2));
		}
}