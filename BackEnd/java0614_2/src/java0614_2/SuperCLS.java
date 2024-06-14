package java0614_2;

// 클래스 상속
// 상속 : 부모가 사용하는 것을 그대로 가져와서 사용 o
// 상속을 하면 객체 생성에 자동으로 super();가 생성되어짐(숨겨져있음)

public class SuperCLS {
	public SuperCLS() {
		System.out.println("SuperCLS 기본생성자");
	}
	
	public void hello() {
		System.out.println("안녕하세요");
	}
}

// SuparCLS: 부모클래스
// SubCLS: 자식클래스
class SubCLS extends SuperCLS {
	public SubCLS() {
	//super();
	System.out.println("SubCLS 기본 생성자");
	}
}

// SubCLS : 부모클래스
// ChildCLS : 자식 클래스
class ChildCLS extends SubCLS {
	public ChildCLS() {
		//super(); 
		System.out.println("ChlidCLS 기본생성자");
	}

	// 오버라이딩(재정의)
	public void hello() {
		System.out.println("니하오마!");
	}
} 
