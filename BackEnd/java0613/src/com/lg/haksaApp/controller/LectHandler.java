package com.lg.haksaApp.controller;

import java.util.ArrayList;

import com.lg.haksaApp.model.Lecture;
import com.lg.haksaApp.model.Subject;

public class LectHandler {
	// Lecture 정보를 저장
	ArrayList<Lecture> lectList = 
			new ArrayList<>();

	public LectHandler(ArrayList<Lecture> lectList) {
		super();
		this.lectList = lectList;
	}
	
	public LectHandler() {
		super();
	}

	public ArrayList<Lecture> getLectList() {
		return lectList;
	}

	public void setLectList(ArrayList<Lecture> lectList) {
		this.lectList = lectList;
	}

	public ArrayList<Subject> getLectList1() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
