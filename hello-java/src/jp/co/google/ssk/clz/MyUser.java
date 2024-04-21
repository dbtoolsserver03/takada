package jp.co.google.ssk.clz;


// 在CLASS上点ctrl + t 可以看到该CLASS的继承关系
public class MyUser {

	
	@Override
	public String toString() {
		return "MyUser [name=" + name + ", password=" + password + "]";
	}


	public MyUser(String name) {
		this.name = name;
	}


	public MyUser(String name, String password) {
		this.name = name;
		this.password = password;
		
	}
	
	
	// 如果没有构造方法，JVM会提供一个默认的无参的构造方法
	
	public MyUser() {
		
	}
	
	private String name;
	private String password;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}


