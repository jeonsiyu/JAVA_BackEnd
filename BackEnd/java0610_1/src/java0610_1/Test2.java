package java0610_1;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("안녕하세요 Test2");
		
		// ctrl + shift + 0  : 자동 import
		// 입력 처리 - Scanner 클래스 필요!
		Scanner s = new Scanner(System.in);
		// 문자열 입력
		System.out.print("이름 입력:");
		String name = s.next(); // 문자열 입력(공백x)
		System.out.println("이름 출력:"+ name);
		
		// 숫자 입력
		System.out.println("나이 입력:");
		int age = s.nextInt(); // 정수 입력
		System.out.println("나이 출력:" + age);
		
		// 문자열 입력(공백 처리)
		s.nextLine(); // enter 키 값 처리
		System.out.println("주소 입력:");
		String addr =s.nextLine(); // 공백포함 문자열 입력
		System.out.println("주소 출력:" + addr);
		s.close();
		
		// 기본 사칙연산자: %
		// 비교 연산자: >, <, >=, ==,!=
		// 논리 연산자 &&, ||, !
		// 연산자 우선 순위 : () -> *, / => +,- => 비교 => 논리
		// 제어문 : if, switch
		// 반복문 : for, while, do-while
	
	}
}

