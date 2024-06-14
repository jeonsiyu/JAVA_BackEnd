package com.lg.test1;

public class Main {
	public static void main(String[] args) {
		UnivFriend[] uf = new UnivFriend[3];
		CompFriend[] cf = new CompFriend[3];
		
		for (int i=0; i<uf.length; i++) {
			uf[i] = new UnivFriend("홍길동", "111", "전자과");
			uf[i].showInfo();
			
			cf[i] = new CompFriend("전우치", "222", "개발부");
			cf[i].showInfo();
		}
	}
}
