package com.lg.test1.inhe;

public class CompFriend extends Friend {
	private String department;

	public CompFriend(String name, String phone) {
		super(name, phone);
		// TODO Auto-generated constructor stub
	}

	public CompFriend(String name, String phone, 
			String department) {
		super(name, phone);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
		System.out.println("부서: " + department);
	}
}
