package jp.co.yahoo.study;

public class TestLoop {

	public static void main(String[] args) {
		int ret = 0;
		
		// for
		// 1.定义循环变量 i
		// 2.判断表达式是否成立
		// 3-1.如果为TRUE执行for语句块的内容
		// 3-2.如果为FALSE跳出循环
		// 4.执行i++
		// 5.执行2的操作
		for (int i = 1; i<=100;i++) {
			ret = ret + i;
		}
		
		System.out.println(ret);
		
		
		// while
		// 1.定义循环变更
		// 2.判断表达式是否成立
		// 3-1.如果为TRUE执行for语句块的内容
		// 3-2.如果为FALSE跳出循环
		// 4.执行i++
		// 5.执行2的操作
		ret=0;
		int i=1;
		while(i<=100) {
			ret += i; // 等同于 ret = ret + i;
			i++;
		}
		System.out.println(ret);
	
		ret=0;
		i=1;
	
		do {
			if(i<=100) {
				ret += i; // 等同于 ret = ret + i;
				i++;
			} else {
				break;
			}
		}while(true);
		System.out.println(ret);

		
		String[] strArr= {"aaa","bbb","ccc"};
		
		
		// 对于需要下标索引的情况，需要下面的方式循环判断处理
		for (int index = 0; index < strArr.length; index++) {
			if (index ==1) {
				continue;
			}
			String str = strArr[index];
			System.out.println(str);
		}

		// 对于从头到尾的，不需要下标索引，速度比较快
		System.out.println("for each");
		for (String str : strArr) {
			System.out.println(str);
		}
		//如果没有实现toString（）方法，则输出类型和内存地址
		System.out.println(strArr);

	}

}
