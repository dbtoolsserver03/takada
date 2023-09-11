package jp.co.yahoo.study.zhang3.d0820.cls.basic;

public class Person {

	String name;
	int weigth;
	boolean isMan;
	
	
	// this: 当前类的成员
	Person(String name){
		this.name = name;
	}
	// 下面方法不写也可以，JVM会默认提供无参构造方法
	// 如果代码中提供了有参的构造方法，JVM就不会默认提供无参构造方法
//	Person() {
//		
//	}
}
