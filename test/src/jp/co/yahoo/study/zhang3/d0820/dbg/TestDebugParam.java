package jp.co.yahoo.study.zhang3.d0820.dbg;

import jp.co.yahoo.study.zhang3.d0820.cls.jicheng.Dog;

public class TestDebugParam {

//	String name;
	
	public static void main(String[] args) {
//		
//		TestDebug td = new TestDebug();
//		td.name="aaa";
//		
		
		
		Dog dog = new Dog();
		dog.setName("wang");
		
		String info = "";
		int salary = 100;
		

		System.out.println("dogName:"+dog.getName());
		System.out.println("info:"+info);
		System.out.println("salary:"+salary);
		System.out.println("args[0]:"+args[0]);
		
		reset(dog,info,salary,args);
		
		System.out.println("------------");
		System.out.println("dogName:"+dog.getName());
		System.out.println("info:"+info);
		System.out.println("salary:"+salary);
		System.out.println("args[0]:"+args[0]);

	}

	private static void reset(Dog dog, String info, int salary, String[] args) {
		
		dog.setName("rename xxx");
		info = "info xxx";
		salary=999;
		args[0]="axx";	
		
	}
}
