package com.lg.haksaApp.model;

public class Professor {
	private String name;	// 교수명
	private String major;	// 전공
	private String tel;		// 전하
	
	public Professor(String name, 
			String major, String tel) {
		super();
		this.name = name;
		this.major = major;
		this.tel = tel;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void printProf() {
		System.out.println("교수명:" + name);
		System.out.println("전공" + major);
		System.out.println("전화:" + tel);
	}
}

