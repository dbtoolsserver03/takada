package jp.co.yahoo.study.zhang3.d0820.cls.jicheng;

public class ExeDog {

	public static void main(String[] args) {

		//funJiCheng();

		//funDuoTai();

		funDuoTaiTest();

	}

	private static void funDuoTaiTest() {

		int x = 1;
		int y = 2;

		int min = x < y ? x : y;
		System.out.println("min:" + min);

		int[] a = { 1, 22, 3};

		for (int i : a) {
			System.out.println(i);
		}
		
		System.out.println("===============");
		
		// 多态的应用
		// 声明变量时要用父类，数组里面的所有对象，全是该父类的类型或子类
		Dog[] dogs = {new Dog(),new DogWoman(),new DogMan()};
		
		for (Dog dogObj : dogs) {
			dogObj.call();
		}
		
	}

	private static void funDuoTai() {

		// 用父类声明变量，用子类实例化
		Dog dog = new DogMan();
		// 变量调用方法时，实例化时，用的哪个类进行的实例化，就用哪个类的方法

		dog.call();

	}

	private static void funJiCheng() {
		DogMan dogMan = new DogMan();
		// 因为子类实现了父类方法
		dogMan.call();

		System.out.println("----------");

		DogWoman dogWoman = new DogWoman();
		// 因为子类实现了父类方法
		dogWoman.call();

		System.out.println("----------");
		Dog dog = new Dog();
		dog.call();

	}
}
