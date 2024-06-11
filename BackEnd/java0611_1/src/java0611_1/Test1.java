package java0611_1;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// C, JS: 함수
		// 자바(객체지향언어): 메소드(함수와 의미가 동일함)
		//-------------------------------------------------
		Scanner s = new Scanner(System.in);
		System.out.print("숫자1 입력:");
		int n1 = s.nextInt();
		System.out.print("숫자2 입력:");
		int n2 = s.nextInt();
		System.out.print("연산자 입력(+,-,*,/):");
		char op = s.next().charAt(0); // 문자입력
		// 1.void 메소드명() {실행문;}
		// 메소드를 정의 하는 것만으로는 실행 할 수 없음 -> 메인에서 실행해줘야함
		//func1();
		// 2.void 메소드명(매개변수) {실행문;}
		//func2(n1, n2, op);
		// 3.데이터타입 메소드명() {실행문; return 값;}
		//int r = func3();
		//System.out.println("계산 결과:" + r);
		// 4.데이터타입 메소드명(매개변수) {실행문; return 값;}
		int r2 = func4(n1, n2, op);
		System.out.printf("%d %c %d = %d\n", n1, op, n2, r2);
		s.close();
	}
	// static 붙은것과 아닌것은 메모리 영역이 다름
	static void func1() {
		Scanner s = new Scanner(System.in);
		System.out.print("숫자1 입력:");
		int n1 = s.nextInt();
		System.out.print("숫자2 입력:");
		int n2 = s.nextInt();
		System.out.print("연산자 입력(+,-,*,/):");
		char op = s.next().charAt(0); // 문자입력
		switch (op) {
		case '+':
			System.out.printf("%d+%d=%d\n", n1, n2, n1+n2);
			break;
		// -, *, / 생략...
		}
		s.close();
	}
	
	static void func2(int num1, int num2, int opt) {
		switch (opt) {
		case '+':
			System.out.printf("%d+%d=%d\n", num1, num2, num1+num2);
			break;
		// -, *, / 생략...
		}
	}
	
	static int func3() { // return을 할때는 메소드와 동일한 타입으로 받아줘야함
		Scanner s = new Scanner(System.in);
		System.out.print("숫자1 입력:");
		int n1 = s.nextInt();
		System.out.print("숫자2 입력:");
		int n2 = s.nextInt();
		System.out.print("연산자 입력(+,-,*,/):");
		char op = s.next().charAt(0); // 문자입력
		int res = 0;
		switch (op) {
		case '+':
			res = n1 + n2;
			break;
		// -, *, / 생략...
		}
		s.close();
		return res;
	}
	
	static int func4(int num1, int num2, int opt) {
		int res = 0;
		switch (opt) {
		case '+':
			res = num1 + num2;
			break;
		// -, *, / 생략...
		}		
		return res;
	}

}
