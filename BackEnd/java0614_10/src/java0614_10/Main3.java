package java0614_10;

interface Printable3 {
	void print(String s);
}

public class Main3 {
	public static void main(String[] args) {
		Printable3 p = s->System.out.println(s);
		p.print("문서출력");
	}
}
