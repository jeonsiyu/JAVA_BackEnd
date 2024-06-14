package com.lg.haksaApp.model;

public class Lecture {
	private String startDate;	// 개강일
	private String endDate;		// 종강일
	private String office;		// 강의실
	private Student std;		// 학생정보
	private Professor pro;		// 교수정보
	
	public Lecture(String startDate, String endDate, 
			String office, Student std, Professor pro) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.office = office;
		this.std = std;
		this.pro = pro;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public Student getStd() {
		return std;
	}

	public void setStd(Student std) {
		this.std = std;
	}

	public Professor getPro() {
		return pro;
	}

	public void setPro(Professor pro) {
		this.pro = pro;
	}
	
	public void showLect() {
		System.out.println("개강일:" + startDate);
		System.out.println("종강일:" + endDate);
		System.out.println("강의실:" + office);
		std.printStd();
		pro.printProf();
		System.out.println("#########################");
	}
}

