package com.jingdong.bank;

public class TestMethod {

	public static void main(String[] args) {

		
		
		// 方法调用
		int leng = -2;
		int width = 3;
		
		// check para
		boolean isOk = check(leng,width);
		
		if (isOk) {
			// leng,width 实参
			int area = getArea(leng,width);
			
			System.out.println(leng);
			System.out.println(area);
		} else {
			System.err.println("para error");
		}
		/////////////////////////////////////////////
		int myLeng = 2;
		float myWidth = 1.5f;
		
		float myArea = getArea(myLeng,myWidth);
		System.out.println(myArea);
		
	}
	// 方法由以下部分组成
	// 返回值   （方法执行结束后，将值返回）
	// 方法名
	// 参数（个数，参数类型，参数的顺序）
	// 方法体
	
	// 抽出方法的好处
	// 1.提取共通处理
	// 2.使代码更加结构化
	
	private static float getArea(int myLeng, float myWidth) {
		// TODO 自動生成されたメソッド・スタブ
		return myLeng*myWidth;
	}

	// 方法定义与实现
	//paraLeng,paraWidth 形参
	private static int getArea(int paraLeng, int b) {
		paraLeng = 5;
		int ret = paraLeng*b;
		return ret;
	}
	
	
	
	private static boolean check(int leng, int width) {
		
		boolean ret = true;
		if (leng<=0) {
			ret = false;
		}
		return ret;
	}



	
	

}
