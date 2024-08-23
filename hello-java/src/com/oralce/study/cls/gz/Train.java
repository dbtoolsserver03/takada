package com.oralce.study.cls.gz;

// ctrl + t
public class Train {

	private String name;
	private int boxNum;
	
	// 构造方法（方法名和类名一样）

	// 如果提供了有参的构造方法，默认的无参构造方法就不在提供
	public Train(String name, int boxNum) {
		
		// this.name 指的是当前 对象/实例
		this.name = name;
		this.boxNum = boxNum;
	}
	
	// 无参构造方法
	public Train() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBoxNum() {
		return boxNum;
	}

	public void setBoxNum(int boxNum) {
		this.boxNum = boxNum;
	}

	@Override
	public String toString() {
		return "Train [name=" + name + ", boxNum=" + boxNum + "]";
	}
	
	
	
	
}
