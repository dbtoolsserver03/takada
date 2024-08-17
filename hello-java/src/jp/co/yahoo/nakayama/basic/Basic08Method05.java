package jp.co.yahoo.nakayama.basic;

public class Basic08Method05 {

	// 関数
	// public         関数の可視範囲
	// static         全局共有領域に定義
	// void	          関数の戻り値　（戻り値がない場合、void）
	// main           関数の名前
	// String[] args  関数のパラメーター
	public static void main(String[] args) {
		
		System.out.println("args の長さ:" + args.length);
		for(String str : args) {
			System.out.println(str);
		}
	}

}
