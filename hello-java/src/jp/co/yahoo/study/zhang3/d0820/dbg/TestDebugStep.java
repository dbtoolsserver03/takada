package jp.co.yahoo.study.zhang3.d0820.dbg;

public class TestDebugStep {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		// DEBUG进行中时，预执行 选中想要执行的代码，按快捷键ctrl+shift+i  
		int c = funAdd(a, b);
		
		// DEBUG进行中时，用ctrl + r 执行到指定行
		System.out.println(c);
		
		// DEBUG进行中时，直接在视图变数里对变更改值。
		// DEBUG进行中时，通过调试脚本可以更改变量的值。
		
	}

	private static int funAdd(int x, int y) {
		
		int ret = x+y;
		return ret;
	}
	
}
