package jp.co.yahoo.basic;

//自动整形
//ctrl + shift +f


public class BasicLogic {

	public static void main(String[] args) {

		//	int x=1,y=2;

		int a = 1;
		int b = 2;

		// 统一变量改名，alt + shift + r (改类名，改方法名)
		int max = 0;

		if (a < b) {
			max = b;
		} else {
			max = a;
		}
		System.out.println(max);

		// 三目运算符
		// ? 前如果成立，就会把：前的值设给左面变量
		// ? 前如果不成立，就会把：后的值设给左面变量
		int min = a < b ? a : b;
		System.out.println(min);

		int x = 1;
		int y = x++;// 先赋值，再运算
		System.out.println("x:" + x); // 2
		System.out.println("y:" + y); // 1

		// x =2
		int z = ++x;// 先运算，再赋值
		System.out.println("x:" + x); // 3
		System.out.println("z:" + z); // 3

		System.out.println("a:" + a);
		System.out.println("b:" + b);

		if (a < 100 || b < 0) {
			System.out.println("a<100||b<0");
		}
		
		// 或短路
		if (a < 100 || ++b < 0) {
			System.out.println("a < 100 || ++b < 0");
		}
		System.out.println("b:" + b);
		
		// 与短路
		if(a>100 && ++b>100) {
			
		}
		System.out.println("b:" + b);
		
		
		System.out.println("switch case");
		// switch case 文里，多数要有break;
		char ch = '1';
		
		switch (ch) {
		case 'a': {
			System.out.println("a");
			break;
		}
		case 'b': {
			System.out.println("b");
			break;
		}
		case 'c': 
	    case 'd': {
			System.out.println("cd");
		}
		case 'e': {
			System.out.println("e");
		}
		default:
			System.out.println("..........");
		}

	}

}
