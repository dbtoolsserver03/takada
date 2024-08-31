package jp.co.yahoo.nakayama.cls.keisho;

public class Animal {

	public boolean isSea;
	
	// 0,W　1.M 2.WM 3.未定
	int sex;
	
	protected int legNum;

	// 私有の項目 継承できない
	private String dna;

	
	public Animal() {
		
	}
	public Animal(boolean isSea, int sex, int legNum, String dna) {
		this.isSea = isSea;
		this.sex = sex;
		this.legNum = legNum;
		this.dna = dna;
	}
	
	// getter setter
	public boolean isSea() {
		return isSea;
	}

	public void setSea(boolean isSea) {
		this.isSea = isSea;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getLegNum() {
		return legNum;
	}

	public void setLegNum(int legNum) {
		this.legNum = legNum;
	}

	public String getDna() {
		return dna;
	}

	public void setDna(String dna) {
		this.dna = dna;
	}
	
	public void call() {
		System.out.println("i am animal");
		
	}
	
	
}
