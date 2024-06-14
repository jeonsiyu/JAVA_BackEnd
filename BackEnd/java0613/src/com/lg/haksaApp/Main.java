package com.lg.haksaApp;

import java.util.ArrayList;
import java.util.Scanner;
import com.lg.haksaApp.controller.LectHandler;
import com.lg.haksaApp.model.Lecture;
import com.lg.haksaApp.model.Professor;
import com.lg.haksaApp.model.Student;
import com.lg.haksaApp.model.Subject;
import com.lg.haksaApp.view.Menu;

public class Main {
	public static void main(String[] args) {
		LectHandler lh = new LectHandler();
		Scanner s = new Scanner(System.in);
		Menu me = new Menu();
		while (true) {
			switch (me.mainMenu(s)) {
			case 1:
				System.out.println(">>> 수강 신청 입력 <<<");
				System.out.println("[학생 정보]");
				System.out.print("학번:");
				String id = s.next();
				System.out.print("이름");
				String name = s.next();
				System.out.print("전공:");
				String major = s.next();
				System.out.print("전화:");
				String tel = s.next();
				System.out.print("입력할 과목 수:");
				int count = s.nextInt();
				ArrayList<Subject> subList = 
						new ArrayList<>(); 
				for (int i=0; i<count; i++) {
					System.out.print((i+1) + "과목:");
					String sub = s.next();
					System.out.print((i+1) + "학점:");
					int score = s.nextInt();
					subList.add(new Subject(sub, score));
				}
				
				Student st = 
						new Student(id, name, major, tel, subList);
				
				// 교수 정보 입력
				System.out.println("[교수 정보]");
				System.out.print("이름:");
				String pName = s.next();
				System.out.print("전공:");
				String pMajor = s.next();
				System.out.print("전화:");
				String pTel = s.next();
				Professor pro = new Professor(pName, pMajor, pTel);
				
				// 강의 정보 입력
				System.out.print("개강일:");
				String startDate = s.next();
				System.out.print("종강일:");
				String endDate = s.next();
				System.out.print("강의실:");
				String office = s.next();
				Lecture lect = 
						new Lecture(startDate, endDate, office, 
								st, pro);
				System.out.println(">>> 입력한 정보 확인 <<<");
				lect.showLect();
				System.out.println("----------------------");
				lh.getLectList().add(lect);
				break;
			case 2: // 수강정보 보기
				int n = lh.getLectList().size();
				for (int i=0; i<n; i++) {
					lh.getLectList()
					.get(i)
					.showLect();
				}
				break;
			case 3:
				System.out.println("프로그램 종료!");
				s.close();
				System.exit(0);
				break;
			}
		}
	}
}
