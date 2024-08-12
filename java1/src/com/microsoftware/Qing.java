package com.microsoftware;

import java.util.Arrays;

public class Qing {
	public static void main(String[] args) {
		int[] a1= {1,3,5,5,6,7,2,3,9,6,7,5,6,2,8,1,2,3};
		int x = a1.length;
		
		int[] a2 = new int[x];
	        for (int n = 0; n < x; n++) {
	            a2[n] = 0;
	        } //制作第二个array用于填写结果
	    int maxA1=0;
	    for (int i=1; i<x; i++) {
	    	if (maxA1<a1[i])
	    	{
	    		maxA1=a1[i];
	    		}
	    	} //找任务array的最大值
	    for (int i1=0; i1<x; i1++) {
	    	a2[i1]=a1[i1];
	    	for (int i=0; i<x; i++) {
	    		if (a2[i1]>a1[i]) {
	    			a2[i1]=a1[i];
	    			}
	    		}
	    	for (int i2 = 0; i2 < x; i2++) {
	    		if (a1[i2] == a2[i1]) 
	    		{
	    			a1[i2] = maxA1;
	    			break; 
	    			}
	    		}
	    	} //在第i1次循环中，通过两个for loop, 将a2的i1号元素赋予这次循环中a1的最小值，以及把a1中遇到的第一个这次循的最小值换做任务array的最大值
	    
		System.out.println("任务array改造后"+Arrays.toString(a1)); 
		System.out.println("结果"+Arrays.toString(a2)); 
		System.out.println(maxA1);
		
		
		
		
	}
}