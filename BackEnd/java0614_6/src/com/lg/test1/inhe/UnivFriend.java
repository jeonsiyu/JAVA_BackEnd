package com.lg.test1.inhe;

public class UnivFriend extends Friend {
	private String major;

	public UnivFriend(String name, String phone, 
			String major) {
		super(name, phone);
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
		System.out.println("학과: " + major);
	}
}
