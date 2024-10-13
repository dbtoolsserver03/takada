package jp.co.yahoo.basic;

//因为Date,List,ArrayList 这个类不在java.lang下，所以需要用import显示的引用
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
// 默认java.lang包下面的所有类全部引进来了

public class BasicType02 {

	public static void main(String[] args) {
		// https://docs.oracle.com/javase/jp/8/docs/api/index.html?org/w3c/dom/Document.html
		String str = "hello world";
		System.out.println(str.contains("llo"));

		String[] strArr = str.split(" ");
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}

		Date date = new Date();
		System.out.println("Date型 = " + date);

		String strDate = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss").format(date);
		System.out.println("String型 = " + strDate);
		
		// 数组定义方式（不要这么写）
		//int arrA[] = {1,2,3};
		
		// 变量名是arrOk  类型是int[]
		// 数组缺点是变量定义时，长度已经分配好，长度不可调整
		int[] arrOk = {1,2,3};
		//当不需要索引时，要用下面的方式循环（代码简洁，速度快）
		for (int num : arrOk) {
			System.out.println(num);
		}
		arrOk[0] = 11;
		for (int num : arrOk) {
			System.out.println(num);
		}
		
		// ArrayList 长度可调整，提供的方法多，灵活
		// 当变量里需要多个值时，优先考虑ArrayList
		ArrayList<Integer> lst = new ArrayList<Integer>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		
		System.out.println(lst.size());

		lst.add(2);
		System.out.println(lst.size());
		System.out.println("----");
		for (int num : lst) {
			System.out.println(num);
		}
		
	}

}
