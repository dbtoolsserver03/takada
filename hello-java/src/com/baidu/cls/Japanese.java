package com.baidu.cls;


// 继承 
// 可以继承父类的方法和属性（包含可视范围）
// 父类的私有属性和私有方法不可继承
public class Japanese extends Person { 
	public String city;

	@Override
	public void say() {
		System.out.println("jp say");
		
		// 显示调用父类方法
		super.eat();
		
	}
	


}
