package java0614_10;

public class Main1 {
	public static void main(String[] args) {
		Printable p = new Printer();
		p.print("문서 출력");
	}
}

interface Printable {
	void print(String s);
}

class Printer implements Printable {
	@Override
	public void print(String s) {
		System.out.println(s);
	}
}