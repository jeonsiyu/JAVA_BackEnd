package com.lg.haksaApp.model;

import java.util.ArrayList;

public class Student {
	private String id;		// 학번
	private String name;	// 이름
	private String major;	// 전공
	private String tel;		// 전화
	
	// 과목 저장
	private ArrayList<Subject> subList =
			new ArrayList<>();
	
	public Student(String id, String name, 
			String major, String tel, 
			ArrayList<Subject> subList) {
		super();
		this.id = id;
		this.name = name;
		this.major = major;
		this.tel = tel;
		this.subList = subList;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public ArrayList<Subject> getSubList() {
		return subList;
	}

	public void setSubList(ArrayList<Subject> subList) {
		this.subList = subList;
	}

	public void printStd() {
		System.out.println("학번: " + id);
		System.out.println("이름: " + name);
		System.out.println("전화: " + tel);
		System.out.println("전공: " + major);
		System.out.println(">>> 신청 과목 목록 <<<");
		showSubject();
	}
	
	private void showSubject() {
		for (int i=0; i<subList.size(); i++) {
			subList.get(i).showSub();
		}
	}
}
