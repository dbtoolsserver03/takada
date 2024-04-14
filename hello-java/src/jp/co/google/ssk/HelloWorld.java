package jp.co.google.ssk;

/**
 * JAVA DOC 可识别
 * 
 */

/*
  不被JAVA DOC识别的多行注释
 
  
 */

// 选中要注释掉的代码，ctrl + shift + c
//aaaa
//bb
//ccccc

//类的首字母一定要大写
//方法的首这母一定要小写

// public class后面的类名就是文件名。
public class HelloWorld {

	// main 快捷键   alt+/ 或 ctrl+space 自动联想

	// 程序入口方法

	// 方法（返回值，方法名，参数{参数类型，参数个数，参数顺序}）
	public static void main(String[] args) {

		// syso  快捷键   alt+/  或 ctrl+space 自动联想
		System.out.println("hello world 12345  !! ");
		System.err.println(2133);

		int a = 3;
		int b = 5;
		System.out.println(a + b);

		if (args != null && args.length > 0) {
			System.out.println("output args:" + args[0]);
		}

		// 快捷键  ctrl + shift + f 美化代码
	}

}

class Goodmorning {

}