package jp.co.yahoo.basic;

/**
 * BasicMethod練習
 */
public class BasicMethod {

	public static void main(String[] args) {

		int a = 200;
		int b = 300;
		int c = 100;
		int d = 400;

		int area = getArea(a, b);
		System.out.println(area);

		int sum = getSum(a, b);
		System.out.println(sum);
		
		int sumx = getAll(a,b,c);
		System.out.println(sumx);
		sumx = getAll(a,b,c,d);
		System.out.println(sumx);
		
		// 如果方法上有javadoc，就可以显示出来方便引用
		sumx = getAll(1,2,3);

				
	    long x = 10000;
		long y = 20000;
		
		long areaLong = getArea(x, y);
	}

	// java doc
	/**
	 * 取得所有参数的总和
	 * @param para
	 * @return
	 */
	private static int getAll(int ... para) {
		int ret = 0;
		for (int i = 0; i < para.length; i++) {
			ret += para[i];
		}
		return ret;
	}

	private static int getSum(int a, int b) {
		int ret = a + b;
		return ret;
	}

	//  方法名，参数类型，参数个数
	private static int getArea(int a, int b, int c) {
		int ret = a * b;
		return ret;
	}
	
//	// 只有返回值不一样，是不可以的
//	private static long getArea(int a, int b) {
//		long ret = a * b;
//		return ret;
//	}
	
	private static int getArea(int a, int b) {
		int ret = a * b;
		return ret;
	}

	private static long getArea(long a, long b) {
		long ret = a * b;
		return ret;
	}
}
