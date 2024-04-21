package jp.co.google.ssk.clz.abs;


// abstract class 抽象类  （有被实现的方法，或明示class 为abstract）
public  abstract class People {

	
	// 可以有一部分方法被实现
	public void run() {
		System.out.println("people run");
	}
	
	
	public abstract void  call();
}
