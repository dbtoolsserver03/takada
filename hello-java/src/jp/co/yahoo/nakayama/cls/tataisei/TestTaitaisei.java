package jp.co.yahoo.nakayama.cls.tataisei;

import jp.co.yahoo.nakayama.cls.kapuseruka.Emp;
import jp.co.yahoo.nakayama.cls.keisho.Animal;

public class TestTaitaisei {

	public static void main(String[] args) {

		int[] arr = {1,2,3};
		
		Dog dog1 = new Dog();
		dog1.setDna("dogA");
		Dog dog2 = new Dog();
		dog2.setDna("dogB");
		
		Dog[] dogs = {dog1,dog2};
		
		for(Dog o : dogs) {
			System.out.println(o.getDna());
		}
		
		System.out.println("--------");
		
		// 多態性の使い方
		Cat cat1 = new Cat();
		cat1.setDna("catA");
		Cat[] cats = {cat1};
		
		Animal[] animals = {dog1,dog2,cat1};
		
		for(Animal o : animals) {
			System.out.println(o.getDna());
		}
		
		
		Emp emp = new Emp();
		
		// Animal 親クラス
		// Cat    子クラス
		Animal catJp = new Cat();

		// 親クラスで定義しないといけない
		// Cat catJp = new Animal();
		
		// catJpのタイプは何でしょうか？
		
		if (catJp instanceof Animal) {
			System.out.println("catJp type is Animal");
		}

		if (catJp instanceof Cat) {
			System.out.println("catJp type is Cat");
		}
		
		
		Animal dogJp1 = new Dog();
		dogJp1.call();
		

		Animal dogJp2 = new Animal();
		System.out.println("----");
		dogJp2.call();
		System.out.println("----");
		
		// Object supperテスト
		Monkey m = new Monkey();
		m.call();
		
	}

}
