package jp.co.yahoo.nakayama.cls.keisho;


//extends only one
public class People extends Animal{

	public People(boolean isSea, int sex, int legNum, String dna) {
		
		// super 直前メソッド利用
		super(isSea, sex, legNum, dna);
	}
	
	public People() {
		
	}
	
	public static void main(String[] args) {
		People p = new People();
		System.out.println(p.isSea);
		System.out.println(p.sex);
		System.out.println(p.legNum);
		
		// dna項目を継承できない
		// System.out.println(p.dna);
		
		// dna項目のgetter setterを継承できます
		System.out.println(p.getDna());
	}
}
