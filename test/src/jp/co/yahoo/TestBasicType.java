package jp.co.yahoo;

public class TestBasicType {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		byte  b = 1;  // 1个字节  8位
		short s = 2;  // 2个字节  16位
		int i = 5;    // 4个字节  32位
		long l = 6;   // 4个字节  64位
		
		
		// 大类型往小类型设置时，需要强制转换
		b=(byte)s;
		System.out.println(b);
		
		// 小类型往大类型设置时，不需要强制转换
		l = i;
		
		float f = 5.0f;
		double d = 6.0d;
		
		// 禁止float和double做==比较
		// 可以做>= <=
		System.out.println(i==f);
		System.out.println(l==d);

		// 字符类型
		char ch = 'a';
		int chVal = (int)ch;
		System.out.println(ch);
		System.out.println(chVal);
		
		boolean retYes = true;
		System.out.println(retYes);
		
	}

}
