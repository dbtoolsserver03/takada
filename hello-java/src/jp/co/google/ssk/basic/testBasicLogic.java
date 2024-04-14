package jp.co.google.ssk.basic;


/**
 * JAVA里简单逻辑运算
 */
public class testBasicLogic {

	public static void main(String[] args) {

		int a = 100;
		int b = 200;

		// if else 例子
		int max = getMaxVal(a, b);

		System.out.println(max);

		// 三目运算符 例子
		int max2 = getMaxVal2(a, b);
		System.out.println(max2);

		// switch 例子
		getDayInfo(100);

		// ++ 运算  就是变量自身+1操作 主要是前加还是后加
		// 后加：先执行操作，再自身加1
		System.out.println("---    ++   ---");
		int c = 0;
		System.out.println(c++);
		System.out.println(c);

		// 前加：先变更自身加1，再执行操作
		int d = 0;
		System.out.println(++d);
		System.out.println(d);

		// 与或非
		if (a == 100 && b == 200) {
			System.out.println("a==100&&b==200");
		}

		// 与短路(从左到右判断表达式，如果表达式是FALSE,后面的表达式不会再做判断)
		if (a++<1000 && a == 99 && ++b==201) {
			System.out.println("a == 99 && ++b==201");
		}
		System.out.println(a);
		System.out.println(b);

		// 或
		
		if (a<1000 || b==0) {
			System.out.println("a<1000 || b==0");
		}
		
		// 或 短路
		if (a<1000 || ++b==0) {
			System.out.println("a<1000 || ++b==0");
		}
		System.out.println(b);

		
		// 非  取返
		boolean isOk = true;
		if(!isOk) {
			System.out.println("!isOk");
		}
	}

	private static void getDayInfo(int day) {

		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("....");
			break;
		}
	}

	private static int getMaxVal2(int a, int b) {

		// 三目运算符 (? 前面的表达式如果是真，返回：前面的变更 ，否则返回：后面的变量)
		int ret = a < b ? b : a;
		return ret;
	}

	private static int getMaxVal(int a, int b) {

		int ret = 0;
		if (a < b) {
			ret = b;
		} else {
			ret = a;
		}
		return ret;

	}
}
