package jp.co.google.ssk.basic;

public class TestBasicLoop {

	public static void main(String[] args) {
		
		
		//  1..100的和
		System.out.println(funWhile(100));
		System.out.println(funDoWhile(100));
		
		// for循环是最常用的
		System.out.println(funFor(100));
		
		
		// 2 1..100的和 (3的倍数不做为运算对象)(总合>2000 break)
		System.out.println(funForEscape3(100));
		
		
	}

	private static int funForEscape3(int num) {

		int ret = 0;
		
		for (int i = 1; i <= num; i++) {
			if (i%3==0) {
				// 后面的操作不执行，继续循环
				continue;
			}
			
			ret += i;
			
			if(ret>2000) {
				// 后面的操作不执行，跳出循环
				break;
			}
		}
		
		return ret;
	}

	private static int funFor(int num) {

		int ret = 0;

		
		// 1.int i = 1
		// 2.i <= num
		// 3.语句块里的内容
		// 4.i++
		// 5 回到2
		for (int i = 1; i <= num; i++) {
			ret += i;
		}
		
		return ret;
	}

	private static int funDoWhile(int num) {

		int ret = 0;
		int i=1;
		do {
			
			ret += i;
			i++;
		} while(i<=100);
		
		return ret;
	}

	private static int funWhile(int num) {
		
		int ret = 0;
		
		int i=1;
		while(i<=100) {
			//ret = ret + i;
			ret+=i;
			i++;
		}
		return ret;
	}

}
