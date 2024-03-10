package com.baizhi.entity.original;

import java.sql.Date;

public class Student {
		private Integer student_id;
		private String student_name;
		private String student_pwd;
		private Date birthdate;
		private String email;
		public Integer getStudent_id() {
			return student_id;
		}
		public void setStudent_id(Integer student_id) {
			this.student_id = student_id;
		}
		public String getStudent_name() {
			return student_name;
		}
		public void setStudent_name(String student_name) {
			this.student_name = student_name;
		}
		public String getStudent_pwd() {
			return student_pwd;
		}
		public void setStudent_pwd(String student_pwd) {
			this.student_pwd = student_pwd;
		}
		public Date getBiethdate() {
			return birthdate;
		}
		public void setBiethdate(Date biethdate) {
			this.birthdate = biethdate;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		@Override
		public String toString() {
			return "Student [student_id=" + student_id + ", student_name=" + student_name + ", student_pwd="
					+ student_pwd + ", biethdate=" + birthdate + ", email=" + email + "]";
		}
		public Student(Integer student_id, String student_name, String student_pwd, Date biethdate, String email) {
			super();
			this.student_id = student_id;
			this.student_name = student_name;
			this.student_pwd = student_pwd;
			this.birthdate = biethdate;
			this.email = email;
		}
		public Student() {
			super();
		}
		
}
