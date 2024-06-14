package com.lg.test1.inhe;

public class Main {
	public static void main(String[] args) {
		Friend[] f = new Friend[3];
		f[0] = new CompFriend("홍길동", "111", "개발팀");
		f[1] = new CompFriend("전우치", "222", "디자인팀");
		f[2] = new UnivFriend("유관순", "333", "전자과");
		
		for (int i=0; i<f.length; i++) {
			f[i].showInfo();
			System.out.println("--------------");
		}
	}
}
