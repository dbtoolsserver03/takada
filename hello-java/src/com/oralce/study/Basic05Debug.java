package com.oralce.study;
//sum=200;
public class Basic05Debug {

	public static void main(String[] args) {

/*
1.在变数视图里直接改值 
2.在debug shell视图里通过语句来修改，放大镜
3.在代码任意位置，选择可执行行语句，放大镜

4.眼镜视图 看表达式的值，只能看不能改
*/
		int[] arr = {1,2,3,4};
		int sum = 0;
		for(int i = 0 ;i < arr.length;i++) {
			sum= sum + arr[i];
		}
		System.out.println(sum);
	}
}
