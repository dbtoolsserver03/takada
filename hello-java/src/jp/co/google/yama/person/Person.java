package jp.co.google.yama.person;

public class Person {
	public static final String FACE_BLACK = "black";
//	public final char[] FACE_BLACK = null;
	private String name;
	private int weight;
	private int heigh;

	public void date(String n, int w, int h) {
		this.name = n;
		this.weight = w;
		this.heigh = h;
		System.out.println(name + "" + weight + "才" + heigh + "メートル");
	}
	void say() {
		System.out.println("xxx");
	}
}
