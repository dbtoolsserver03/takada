package jp.co.yahoo.nakayama.basic;


/*
	public class の名前はファイル名と一緒ではないといけない
	public class は唯一
*/
public class Basic03 {

	public static void main(String[] args) {
		
		int num = 1;
		
		// step1.numの内容を出力する
		// step2.num = num + 1;
		System.out.println(num++);
		System.out.println(num);
		
		System.out.println("-------");
		
		int preNum = 1;
		// step1.num = num + 1;
		// step2.numの内容を出力する
		System.out.println(++preNum);
		
		
		System.out.println("-------minus-------");
		int preNumMinus = 1;
		System.out.println(--preNumMinus);
		
		
		int aftNumMinus = 1;
		System.out.println(aftNumMinus--);
		
	}
}

class B{
	
}
