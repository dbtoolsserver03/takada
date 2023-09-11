package jp.co.yahoo.study.zhang3.d0820.cls.fengzhuang;

import java.util.Date;

public class Emp {

	public String empNo;
	private Date birthday;
	private int salary;
	private String tel;
	
	public Emp(String empNo, Date birthday, int salary, String tel) {
		this.empNo = empNo;
		this.birthday = birthday;
		this.salary = salary;
		this.tel = tel;
	}

	
	@Override
	public String toString() {
		return "Emp [empNo=" + empNo + ", birthday=" + Exe01.getStringDate(birthday) + ", salary=" + salary + ", tel=" + tel + "]";
	}


	public String getEmpNo() {
		return empNo;
	}


	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}


	public Date getBirthday() {
		return birthday;
	}


	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
}
