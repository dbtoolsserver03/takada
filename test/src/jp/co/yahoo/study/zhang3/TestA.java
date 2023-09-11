package jp.co.yahoo.study.zhang3;

public class TestA {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 调用方法funSum（），将方法返回值赋给sum变量
		int sum = funSum();
		System.out.println(sum);
		
		System.out.println(funMinus(5,2));
		
	}
	 public int funChange() {
		return 0;
	}
	
	 
	 static int funMinus(int a,int b) {
		return a-b;
	}
	

	// 返回值  方法名（参数类型1 参数1， 参数类型2 参数2。。。。）
	public static int funSum(int i, int j) {
		
		return i+j;
	}
	
	public static int funSum() {
		
		funDiv();
		return 0;
	}
	
    private static int funDiv() {
    	return 0;
    }

	// public      公开方法 可以被其他类所调用
	// 什么也不写  默认方法  可以被同一个包下的类所调用
	// private     私有方法 仅在自己的类里可以调用
	
}
