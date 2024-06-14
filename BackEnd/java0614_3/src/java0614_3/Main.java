package java0614_3;

public class Main {
	public static void main(String[] args) {
		SmartPhone sp = 
				new SmartPhone("010-1111", "갤럭시S24");
		sp.answer();
		sp.playApp("아이폰Pro14");
		sp.playApp();
		
		System.out.println(">>> 다형성(폴리모피즘) <<<");
		MobilePhone mp = 
				new SmartPhone("010-2222", "갤럭시S25");
		mp.answer();
		mp.playApp("아이폰Pro15");
		//mp.playApp(); // 자식에서 새롭게 추가된 메소드 사용 X
	}
}
