package jp.co.yahoo.nakayama.cls.tataisei;

import jp.co.yahoo.nakayama.cls.keisho.Animal;

public class Cat extends Animal{

	// アノテーション annotation 明示のため
	@Override
	public void call() {
		
		System.out.println("みょう");
	}

	
}
