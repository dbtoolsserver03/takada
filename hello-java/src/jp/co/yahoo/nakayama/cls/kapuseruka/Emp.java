package jp.co.yahoo.nakayama.cls.kapuseruka;

import java.util.Date;

public class Emp {

	// 可視範囲
	public String no;
	String name;

	// デフォルト値：0
	protected int sex;

	// デフォルト値：false
	boolean isLeader;

	// デフォルト値：空文字
	char sign;

	private Date hireDate;

	// コンストラクター（パラメーターあり）

	public Emp() {

	}

	//	public    String no;
	//    public String name;
	//	public  int sex;
	//	public    Date hireDate;

	// 右クリック→ソース→コンストラクター生成
	public Emp(String no, String name, int sex, Date hireDate) {
		super();
		this.no = no;
		this.name = name;
		this.sex = sex;
		this.hireDate = hireDate;
	}

	@Override
	public String toString() {
		return "Emp [no=" + no + ", name=" + name + ", sex=" + sex + ", isLeader=" + isLeader + ", sign=" + sign
				+ ", hireDate=" + hireDate + "]";
	}

	
	
	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public boolean isLeader() {
		return isLeader;
	}

	public void setLeader(boolean isLeader) {
		this.isLeader = isLeader;
	}

	public char getSign() {
		return sign;
	}

	public void setSign(char sign) {
		this.sign = sign;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public static void main(String[] args) {

		Emp emp = new Emp();

		// 同じファイルのため、全部見えます。
		System.out.println(emp.no);
		System.out.println(emp.name);
		System.out.println(emp.sex);
		System.out.println(emp.hireDate);

		// toString()メソッドがない場合、empオブジェクト出力時
		// jp.co.yahoo.nakayama.cls.Emp@36baf30c
		// クラス名（パッケージ付き）@メモリアドレス
		System.out.println(emp);
		
		fun01(emp.no,emp.name,emp.sex);
		fun02(emp);
		
		
	}

	// カプセル化利用する場合、一つパラメーター充分です。
	private static void fun02(Emp emp) {
		
	}

	// カプセル化利用しない場合
	private static void fun01(String no2, String name2, int sex2) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
}
