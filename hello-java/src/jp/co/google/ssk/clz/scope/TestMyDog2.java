package jp.co.google.ssk.clz.scope;

public class TestMyDog2 {

	public static void main(String[] args) {
		MyDog dog = new MyDog();
		
		// 除了  private 属性 都能被访问
		System.out.println(dog.birthday);
		System.out.println(dog.weight);
		System.out.println(dog.name);
	}
}
