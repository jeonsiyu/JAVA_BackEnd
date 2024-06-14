package com.lg.myapp;

import java.util.ArrayList;
import com.lg.myapp.std.Student;
import com.lg.myapp.util.RandData;

public class Main {
	public static void main(String[] args) {
		// 객체를 생성하기 위해서는 반드시 생성자 필요!
		Student[] st = new Student[100];
		for (int i=0; i<st.length; i++) {
			st[i] = new Student(RandData.getName(), RandData.getAge(),
						RandData.getGender(), RandData.getAddr());
			//System.out.println("번호: " + (i+1));
			//st[i].showStudent();
		}
		
		// 배열 대신 컬렉션 클래스의 ArrayList
		ArrayList<Student> list = new ArrayList<>();
		for (int i=0; i<100; i++) {
			list.add(new Student(RandData.getName(), 
					RandData.getAge(),
					RandData.getGender(), 
					RandData.getAddr()));
			System.out.println("번호: " + (i+1));
			list.get(i).showStudent();
		}
	}
}
