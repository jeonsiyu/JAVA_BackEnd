package java0610_1;

public class Test1 {
	public static void main(String[] args) {
		// 객체지향프로그래밍 - 메소드(함수)
		System.out.println("안녕하세요 Test1");
		
		// 자바 출력 (타입이 존재하며 C언어와 거의 동일)
		int num1 = 10;
		int num2 = 20;
		int n = num1 + num2;
		// C에서 \n이 없는
		System.out.print(num1 + "+" + num2 + "=" + n);
		
		// C에서 \n이 있는
		System.out.println(num1 + "+" + num2 + "=" + n);
		
		// C와 동일한 형식
		System.out.printf("%d+%d=%d\n", num1, num2, n);
		
		// final 상수변수: 값을 변경할수 없음.
		// C, js 에서 const
		final int MAX_SIZE = 100;
		
		// String.format
		// String 	: 문자열 타입 " "
		// char 	: 문자 타입 ' '
		String name1 = "홍길동";
		String str1 = "안녕하세요";
		String msg1 = String.format("%s님, %s", name1, str1);
		System.out.println(msg1);
		
		// StringBuilder
		String name2 = "전우치";
		String str2 = "반갑습니다.";
		StringBuilder stb = new StringBuilder(name2)
				.append("님, ")
				.append(str2);
		System.out.println(stb);
		
	}
}
