package jp.co.google.ssk.clz;

public class TestMyUser {

	public static void main(String[] args) {

		MyUser user = new MyUser();

		user.setName("zhang3");
		user.setPassword("123");
		
		System.out.println(user.getName());
		System.out.println(user.getPassword());

		MyUser li4 = new MyUser("li4","abc");
		
		System.out.println(li4.getName());
		System.out.println(li4.getPassword());

		// 如果实现了toString方法，打印toString方法的返回值 
		// 如果没实现toString方法，打印 类名@内存地址 
		
		System.out.println(li4);
		
	}

}
