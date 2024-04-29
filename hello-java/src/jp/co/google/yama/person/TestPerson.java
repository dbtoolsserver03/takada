package jp.co.google.yama.person;

public class TestPerson {

	//	private static final String FACE_BLACK = "black";

	public static void main(String[] args) {
		//		String name;
		//		name = "";
		//		
		//		Person yama = new Person();
		//		//		yama.name="yamakawa";
		//		//		System.out.println(yama.name);
		//		yama.namae = "yamakawa";
		//		System.out.println(yama.namae);
		Person tanaka = new Person();
		tanaka.date("tanaka", 60, 1700);
		System.out.println("---------");
		Person HeiPerson = new HeiPerson();
		HeiPerson.say();
		System.out.println("---------");
		HeiPerson = new Person();
		HeiPerson.say();

		;
		//		System.out.println(FACE_BLACK);
	}

}
