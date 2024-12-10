package jp.co.yahoo.nakayama.basic;

public class Basic07Debug {

	public static void main(String[] args) {
		
		
		// デバッグ利用で、途中変数の内容を修正可能です。
		// ①。変数ビューで修正する
		// ②。デバッグ・シェルビューで修正する
		// ③。arr[1] = 200;
		//     ソースの中に、どこでもいい、
		//     実行したいソースを選択し、インスペクションで内容を修正する。
		int[] arr = {1,2,3};
		
		int sum = 0;
		
		for(int num : arr) {
			sum = sum + num;
		}
		System.out.println(sum);
		
	}
}
