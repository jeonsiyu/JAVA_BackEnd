package java0614_8;

public class Main1 {
	public static void main(String[] args) {
		House h = new Hanok();
		h.method1();
		h.method2();
		
		House h1 = new Apartment();
		h1.method1();
		h1.method2();
		
		// 추상클래스는 객체 생성 X
		// House h2 = new House();
	}
}

abstract class House {
	public void method1() {
		System.out.println("땅을 다진다");
	}
	// 추상메소드
	public abstract void method2();
}

class Apartment extends House {
	@Override
	public void method2() {
		System.out.println("아파트 공사");
	}
}

class Hanok extends House {
	@Override
	public void method2() {
		System.out.println("한옥 공사");
	}
}
