package com.lg.myapp.util;

import java.util.Random;

public class RandData {
	static String[] name = {"홍길동", "김길동", "박길동", "이길동", "최길동"};
	static int[] age = {10, 20, 30, 40, 50};
	static char[] gender = {'남', '여'};
	static String[] addr = {"대구 동구 신천동", "서울 동구 신천동", "광주 동구 신천동", "대전 동구 신천동", "부산 동구 신천동"};
	
	static Random r = new Random();
	
	public static String getName() {
		return name[r.nextInt(5)];
	}
	
	public static int getAge() {
		return age[r.nextInt(5)];
	}
	
	public static char getGender() {
		return gender[r.nextInt(2)];
	}
	
	public static String getAddr() {
		return addr[r.nextInt(5)];
	}
}
