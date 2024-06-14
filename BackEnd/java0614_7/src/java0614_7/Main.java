package java0614_7;

// 출력하는 기능
interface Printable {
	// 추상메소드: 반드시 재정의 하여 사용해야됨!!!
	public void print(String doc);
}

interface ColorPrintable extends Printable {
	public void printCMYK(String doc);
}

// 삼성 프린터 드라이버
class SprinterDriver implements Printable {
	public SprinterDriver() {
		System.out.println("삼성 프린터 드리이버 동작");
	}
	
	@Override
	public void print(String doc) {		
		System.out.println(doc);
	}
}

// LG 프린터 드라이버
class LprinterDriver implements Printable {
	public LprinterDriver() {
		System.out.println("LG 프린터 드리이버 동작");
	}
	
	@Override
	public void print(String doc) {
		System.out.println(doc);
	}
}

// 삼성 컬러 프린터 드라이버
class SPrn900Drv extends SprinterDriver implements ColorPrintable {
	public SPrn900Drv() {
		System.out.println("SPrn900Drv 드라이버 동작");
	}
	
	@Override
	public void printCMYK(String doc) {		
		System.out.println("컬러: " + doc);
	}

	@Override
	public void print(String doc) {
		System.out.println("흑백: " + doc);
	}
}

public class Main {
	public static void main(String[] args) {
		
	}
}


