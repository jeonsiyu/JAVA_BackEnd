package java0614_5;

// 2023년 3회차 정보처리기사 실기 문제
// 알고리즘, C 포인터, 자바 클래스, 파이썬 슬라이싱 - 실기
// 상속, 오버라이딩, 다형성
public class Main {
	public static void main(String[] args) {
		SuperObj a = new SubObj();
		a.paint();
		a.draw();
	}
}

class SuperObj {
	public void draw() {
		System.out.print("A");
		draw();
	}
	
	public void paint() {
		System.out.print("B");
		this.draw();
	}
}

class SubObj extends SuperObj {
	public void paint() {
		super.paint();
		System.out.print("C");
		draw();
	}
	
	public void draw() {
		System.out.print("D");
	}
}