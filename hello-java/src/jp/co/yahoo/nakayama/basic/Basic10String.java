package jp.co.yahoo.nakayama.basic;

// String,Systemは java.langパッケージ下のクラスのため、
// 明示importが不要
public class Basic10String {

	public static void main(String[] args) {

		String str = "abc";
		
		String strA = "a";
		String strBC = "bc";
		String strABC = strA + strBC;
		
		// equals 内容の比較
		if(str.equals(strABC)) {
			System.out.println("内容同じ");
		}  else {
			System.out.println("内容違い");
		}
		
		// == の比較はメモリのアドレス比較
		if(str == strABC) {
			System.out.println("メモリのアドレスは同じ");
		}  else {
			System.out.println("メモリのアドレスは違い");
		}
		
		System.out.println("---------------");
		
		String abc = "abc";
		// equals 内容の比較
		if(str.equals(abc)) {
			System.out.println("内容同じ");
		}  else {
			System.out.println("内容違い");
		}
		
		// == の比較はメモリのアドレス比較
		if(str == abc) {
			System.out.println("メモリのアドレスは同じ");
		}  else {
			System.out.println("メモリのアドレスは違い");
		}
		
		
	}

}
