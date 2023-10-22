package com.bai.collection;

import java.util.Date;

public class People implements Comparable<People> {

	private String name;
	private Date birthday;
	private int height;
	private int sex;
	
	
	
	
	@Override
	public String toString() {
		return "People [name=" + name + ", birthday=" + birthday + ", height=" + height + ", sex=" + sex + "]";
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Date getBirthday() {
		return birthday;
	}



	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}



	public int getHeight() {
		return height;
	}



	public void setHeight(int height) {
		this.height = height;
	}



	public int getSex() {
		return sex;
	}



	public void setSex(int sex) {
		this.sex = sex;
	}



	public People() {
		// TODO 自動生成されたコンストラクター・スタブ
	}



	@Override
	public int compareTo(People o) {
		
		return this.height-o.height;
		
	}

}
