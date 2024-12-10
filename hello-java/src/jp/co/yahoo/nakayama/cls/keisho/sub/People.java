package jp.co.yahoo.nakayama.cls.keisho.sub;

import jp.co.yahoo.nakayama.cls.keisho.Animal;

//extends only one
public class People extends Animal{

	// 新しい項目
	protected String job;
	protected String education;
	
	// 新しいメソッド
	protected void singSong() {
	}
	
	// Animal クラスのpublic,protected項目そのまま利用或いはオーバーロード

	
	public People(boolean isSea, int sex, int legNum, String dna) {
		
		// super 直前メソッド利用
		super(isSea, sex, legNum, dna);
	}
	
	public People() {
		
	}
	
	public static void main(String[] args) {
		People p = new People();
		System.out.println(p.isSea);
		
		// 同じパッケージ必要
		// System.out.println(p.sex);
		System.out.println(p.legNum);
		
		// dna項目を継承できない
		// System.out.println(p.dna);
		
		// dna項目のgetter setterを継承できます
		System.out.println(p.getDna());
	}
}
