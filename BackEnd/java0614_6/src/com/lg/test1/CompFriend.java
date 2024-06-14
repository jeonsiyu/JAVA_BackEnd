package com.lg.test1;

public class CompFriend {
	private String name;
	private String phone;
	private String department;
	
	public CompFriend(String name, String phone, 
			String department) {
		super();
		this.name = name;
		this.phone = phone;
		this.department = department;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("전화: " + phone);
		System.out.println("부서: " + department);
		System.out.println("-----------------");
	}
}
