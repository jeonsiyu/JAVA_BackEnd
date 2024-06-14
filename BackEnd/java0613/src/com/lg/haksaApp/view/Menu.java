package com.lg.haksaApp.view;

import java.util.Scanner;

public class Menu {
	public static final int SUKANG_INSERT = 1;
	public static final int SUKANG_RAND_INS = 2;
	public static final int SUKANG_VIEW = 3;
	public static final int MAIN_EXIT = 4;
	
	public int mainMenu(Scanner s) {
		System.out.println("==================");
		System.out.println(" 학사 관리 앱 v1.0");
		System.out.println("==================");
		System.out.println("1.수강 신청하기");
		System.out.println("2.랜덤 데이터 생성");
		System.out.println("3.수강 보기");
		System.out.println("4.종료");
		System.out.println("==================");
		System.out.print("메뉴 선택:");
		int m = s.nextInt();
		return m;
	}
}

