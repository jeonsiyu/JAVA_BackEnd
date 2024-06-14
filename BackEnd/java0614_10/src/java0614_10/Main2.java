package java0614_10;

interface Printable2 {
	void print(String s);
}

public class Main2 {
	public static void main(String[] args) {
		Printable2 p = new Printable2() {
			@Override
			public void print(String s) {
				System.out.println(s);
			}
		};
		p.print("문서출력");
	}
}