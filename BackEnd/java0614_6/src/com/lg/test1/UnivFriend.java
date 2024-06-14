package com.lg.test1;

public class UnivFriend {
	private String name;
	private String phone;
	private String major;
	public UnivFriend(String name, String phone, String major) {
		super();
		this.name = name;
		this.phone = phone;
		this.major = major;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("전화: " + phone);
		System.out.println("학과" + major);
		System.out.println("-----------------");
	}
}
