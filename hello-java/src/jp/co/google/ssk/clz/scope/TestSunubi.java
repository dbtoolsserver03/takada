package jp.co.google.ssk.clz.scope;

public class TestSunubi {

	public static void main(String[] args) {
		Sunubi dog = new Sunubi();
		
		//System.out.println(dog.dna);
		//System.out.println(dog.birthday);
		
		// 子类只能继承父类的protected public的属性或方法
		System.out.println(dog.weight);
		System.out.println(dog.name);
		
	}
}
