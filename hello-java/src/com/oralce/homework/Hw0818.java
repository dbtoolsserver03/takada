package com.oralce.homework;

public class Hw0818 {

	public static void main(String[] args) {
		
		int[] aArr = {9,2,3,4,5,4};
		
		for(int i = 0; i<aArr.length; i++) {
			for(int j = i; j<aArr.length-1; j++) {
				if(aArr[j]>aArr[j+1]) {
					int temp = aArr[j];
					aArr[j] = aArr[j+1];
					aArr[j+1] = temp;
				}
			}
		}
		
		for (int num : aArr) {
			System.out.println(num);
		}
		
		System.out.println("---------------");
		int[] bArr = {9,2,3,4,5,4};
		
		for (int i = 0; i < bArr.length/2; i++) {
			int temp = bArr[i];
			bArr[i] = bArr[bArr.length-1-i] ;
			bArr[bArr.length-1-i] =temp;
		}
		
		for (int num : bArr) {
			System.out.println(num);
		}
	}
	
	

}
