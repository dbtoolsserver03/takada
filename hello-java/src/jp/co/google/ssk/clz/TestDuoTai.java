package jp.co.google.ssk.clz;

public class TestDuoTai {

	public static void main(String[] args) {

		
		
		// 类的多态
		Cat cat = new Douraimeng();
		cat.call();
		
		cat = new BoShiMao();
		cat.call();
		
		
		// 类  车
		// 车 obj = new 火车
		// 输出 obj.weight    100吨
		
		//    obj = new 自行车
		// 输出 obj.weight    10KG
		
		System.out.println("-------------");
		
		Cat[] catArr = {new Cat(),new Douraimeng(),new BoShiMao()};
		
		for (Cat c : catArr) {
			// 多态：同一个变量调用同一个方法，但是结果不一样
			c.call();
		}

	}

}
