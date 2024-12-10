package jp.co.yahoo.nakayama.cls.interf;

import jp.co.yahoo.nakayama.cls.keisho.Animal;

// implements 複数可能
public class Koi extends Animal implements Color,Breath {

	@Override
	public void printColor() {
	}

	@Override
	public int printBreath() {
		return 0;
	}

}
