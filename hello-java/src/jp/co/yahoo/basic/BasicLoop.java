package jp.co.yahoo.basic;

public class BasicLoop {

	public static void main(String[] args) {

		//1+100 sum

		int sum = 0;

		//1。 int i = 1;
		//2。 i <= 100;   如果是FALSE，跳出LOOP
		//3。 sum = sum + i;
		//4。 i++;
		//2。 i <= 100;   如果是FALSE，跳出LOOP
		//3。 sum = sum + i;
		//4。 i++;
		
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println("for sum:" + sum);

		
		// 下面两种了解就行，不建议使用
		sum = 0;
		int i=1;
	    while(i<=100) {
	    	sum = sum + i;
	    	
	    	// i++ 不要漏
	    	i++;
	    }
		System.out.println("while sum:" + sum);

		sum = 0;
		i=1;
		
		do {
	    	sum = sum + i;
	    	// i++ 不要漏
	    	i++;
		} while(i<=100);
		System.out.println("do while sum:" + sum);

		sum = 0;

		
		// break; 跳出该循环
		for (int j = 0; j < 10; j++) {
			
	    	sum = sum + i;
			if (sum>100) {
				break;
			}
		}
		System.out.println("sum>100:" + sum);

		// continue; skip 跳过后面的执行，继续循环
		sum = 0;
		for (int j = 0; j <= 3; j++) {
			
			// 数字是2的话skip
			if (j == 2) {
				continue;
			}
	    	sum = sum + j;
		}
		System.out.println("sum skip 2 :" + sum);
		
	}

}
