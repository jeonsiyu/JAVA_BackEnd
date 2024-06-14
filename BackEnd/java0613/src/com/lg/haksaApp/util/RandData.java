package com.lg.haksaApp.util;

import java.util.Random;

public class RandData {
	// 학생 정보
	String[] sid = {"S0001","S0002","S0003","S0004","S0005"};
	String[] sname = {"홍길동", "김길동", "박길동", "이길동", "최길동"};
	String[] stel = {"010-1234-5678", "010-4321-5678", "010-3478-1278", 
	         "010-4523-1978", "010-7890-2134"};
	String[] smajor = {"컴퓨터공학과", "전자과", "통계과", "경영정보", "기계과"};
	
	// 과목 정보
	String[] subject = {"전자회로", "자바", "빅데이터", "리더쉽경영", "기계공학"};
	int[] score = {2, 3, 4};
	
	// 교수 정보
	String[] pname = {"전우치", "이순신", "유관순", "임꺽정", "안중근"};
	String[] pmajor = {"컴퓨터공학과", "전자과", "통계과", "경영정보", "기계과"};
	String[] ptel = {"010-1234-5678", "010-4321-5678", "010-3478-1278", 
	         "010-4523-1978", "010-7890-2134"};
	
	// 수강 정보
	String[] startDate = {"2024년1월3일", "2024년1월4일", "2024년1월5일"};
	String[] endDate = {"2024년4월3일", "2024년5월4일", "2024년6월5일"};
	String[] office = {"A101호", "A201호", "A301호", "B101호", "B201호"};
	
	
	Random r = new Random();
	
	// 학생 정보
	public String getSId() {
		return sid[r.nextInt(sid.length)];
	}
	
	public String getSName() {
		return sname[r.nextInt(sname.length)];
	}
	
	public String getSTel() {
		return stel[r.nextInt(stel.length)];
	}
	
	public String getSMajor() {
		return smajor[r.nextInt(smajor.length)];
	}
	
	// 과목 정보
	public String getSubject() {
		return subject[r.nextInt(subject.length)];
	}
	
	public int getScore() {
		return score[r.nextInt(score.length)];
	}
	
	// 교수정보
	public String getPName() {
		return pname[r.nextInt(pname.length)];
	}
	
	public String getPMajor() {
		return pmajor[r.nextInt(pmajor.length)];
	}
	
	public String getPTel() {
		return ptel[r.nextInt(ptel.length)];
	}
	
	// 수강정보
	public String getStartDate() {
		return startDate[r.nextInt(startDate.length)];
	}
	
	public String getEndDate() {
		return endDate[r.nextInt(endDate.length)];
	}
	
	public String getOffice() {
		return office[r.nextInt(office.length)];
	}
}

