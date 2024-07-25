package com.kh.vo;

public class Member {
	private String membername;
	private String email;
	private int age;
	
	
	public Member() {
		super();
	}

	public Member(String membername, int age) {
		super();
		this.membername = membername;
		this.age = age;
	}

	public String getMembername() {
		return membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
	}
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member [membername=" + membername + ", age=" + age + "]";
	}
	
	
}
