/**
 * 
 */
package jp.co.yahoo;
/**
 * 
 */
public class TestHello {
	
    // 两个斜线//代表行注释
	
	/*
	 区块注释
	 xxxxxxxxxxx
	 yyyyyyyyyyy
	 */

	// 注释快捷键 ctrl + / 或者 ctrl + shift + c
	
	// main  ctrl+space或alt+/
	
	// 整形快捷键  选中想要整形的代码 ctrl + / 或者 ctrl + shift + f 
	public static void main(String[] args) {

		// syso ctrl+space或alt+/
		System.out.println(args.length);
		System.out.println(args[0]);
		System.out.println(args[1]);

		// 超出args最大索引值，会数组越界错误
		//System.out.println(args[2]);
		System.out.println("hello world123");

		// eclipse 
	}
	
}

