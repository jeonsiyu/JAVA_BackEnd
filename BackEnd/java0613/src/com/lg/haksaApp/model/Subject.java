package com.lg.haksaApp.model;

public class Subject {
	private String subName;	// 과목명
	private int score;		// 학점
	
	public Subject(String subName, int score) {
		super();
		this.subName = subName;
		this.score = score;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public void showSub() {
		System.out.println("과목명:" + subName);
		System.out.println("학점:" + score);
	}
}
