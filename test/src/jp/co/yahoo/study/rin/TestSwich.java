package jp.co.yahoo.study.rin;

public class TestSwich {

	public static void main(String[] args) {
		int a=5;
		int b=6;
		String ret = "";
		if(a<b) {
			System.out.println("OK");
		}else {
			System.out.println("NGs");
			
		}
			
		ret = a>b?"OK":"NGs";
		System.out.println(ret);
			System.out.println("------");
			
			int score=78;
			if(score>90) {
				System.out.println("you");
			}else if(score>80){
				System.out.println("liang");
			}else if(score>70){
				System.out.println("ke");
			}
			int num=0;
			System.out.println(num++);
			System.out.println(num);
			num=1;
			System.out.println(++num);
			System.out.println(num);
			
			char ch='j';
			switch(ch) {
			case'a':{
				System.out.println("aaaaa");
			}break;
			case'b':{
				System.out.println("bbbbbb");
			}
			case'c':{
				System.out.println("cccccc");
			}break;
			default:{
				System.out.println("?????");
			}
			}
	}

}
