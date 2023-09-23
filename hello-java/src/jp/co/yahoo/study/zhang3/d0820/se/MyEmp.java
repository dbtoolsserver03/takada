package jp.co.yahoo.study.zhang3.d0820.se;

import java.io.Serializable;
import java.util.Date;

/*
	在 Java 编程中，序列化是一种将对象转换为字节流的过程，
	可以将对象在网络中传输或者保存到磁盘中。
	序列化可以将对象的状态保存下来，以便在需要时重新创建对象。
	Java 中提供了一套序列化机制，
	可以使得对象的序列化和反序列化变得简单而方便。
 */
public class MyEmp implements Serializable {

	private String no;
	private String name;
	private Date birthday;
	
	
	public MyEmp(String no, String name, Date birthday) {
		this.no = no;
		this.name = name;
		this.birthday = birthday;
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
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	
}
