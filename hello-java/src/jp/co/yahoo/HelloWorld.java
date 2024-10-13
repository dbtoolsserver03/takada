
// 当前类所在的路径
package jp.co.yahoo;
// public 一个类文件里有且只能有一个public类，
// 并且这个类名要和文件名一样
// 定义成public的类可以被其他类所引用
public class HelloWorld {

	// ctrl + shift + c 增减注释
	// main ctrl + space/ alt + /
//	public static void main(String[] args) {
//		
//	}
	
	// main 程序主入口
	// public 公开，可以被外面的类调用
	// static 静态
	// void 这个方法的返回值 
	// main 方法名
	// String[] args 方法的参数
	// String[] 参数类型
	// args 参数名
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//syso ctrl + space/ alt + /
		// 调用系统类里的方法，输出到控制台
		if(args.length > 0) {
			System.out.println(args[0]);
		}else {
			System.out.println("no para");
		}
	}
}
