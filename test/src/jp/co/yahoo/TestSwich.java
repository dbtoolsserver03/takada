package jp.co.yahoo;

public class TestSwich {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 6;
		
		String ret = "";
		
		if (a<b) {
			System.out.println("OK");
		} else {
			System.out.println("NG");
		}
		
		//三目运算符
		ret =a<b?"aaa":"bbbb";
		System.out.println(ret);
		System.out.println("------------");
		
		
		int score = 78;
		if (score>90) {
			System.out.println("you");
		} else if(score>80) {
			System.out.println("liang");
		} else if(score>70) {
			System.out.println("ke");
		}
		
		
		System.out.println("---     num++ and ++num 变量自身+1    ---------");

		int index=0;
		++index;
		
		int num=0;
		System.out.println(num++);//0
		System.out.println(num);//1
		
		num=0;
		System.out.println(++num);//1
		System.out.println(num);//1
		
		
		int c=10;
		if (a<b && a<c++) {
			System.out.println("a<b && a<c++  &&  --OK");
		}
		
		if (a<b || a>c) {
			System.out.println("a<b || a>c  ||  --ok");
		}
		
		
		System.out.println(c);
		
		System.out.println("短路判断");
		
		if (a>b && a<c++) {
			System.out.println("a>b && a<c++  与运算短路 ---OK");
		}
		System.out.println(c);


		if (a<b || a>c++) {
			System.out.println("a<b || a>c  ||  --ok");
		}
		System.out.println(c);

		System.out.println("===========  swich case ============");
		char ch = 'c';
		switch (ch) {
		case 'a': {
			System.out.println("aaaaaaaaaa");
		}
		break;
		case 'b': {
			System.out.println("bbbbbbbbbbbbb");
		}
		break;
		case 'c' :{
			System.out.println("cccccccccccc");
		}
		case 'd' :{
			System.out.println("ddddddddddd");
		}
		break;
		default:
			System.out.println("????");
		}
		
	}

}
