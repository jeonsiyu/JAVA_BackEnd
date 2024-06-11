package java0611_2;

	// 클래스 : 클래스명 첫자는 대문자 사용 
	// 클래스는 객체를 코드로 풀어쓴 것으로 생각
	// 객체의 예 : 음식(객체) -> 볶음밥, 짜장면 같은 정보(속성)들의 메뉴를 모아 하나의 덩어리(객체)로 생각하면 됨
	// 클래스 정의
	// 캡슐화 : 정보 외부 노출 방지
	// -> private를 통해 정보를 외부로 노출 시키지 않게 캡슐화 하는 것
	// -> private: 외부에서 접근 x
	// -> public: 외부에서 접근 o
	// 추상화: 일반적인 정보에서 필요한 정보만 정의 -> 클래스를 정의 할때 꼭 담을 정보만 뽑아내는 과정(?) 
	
public class Person {
		private String name; //  속성, 멤버변수 
		public String tel; 	 // 인스턴스 변수
		public String addr;
		
		// 객체는 public 사용 
		// 메소드는 private 사용
		
		// 인스턴스 메소드
		// setter :매개변수로 값을 외부로 부터 받아서 설정 할때 사용함
		// this : 객체(인스턴스) 자신의 정보 
		// -> 객체가 만들어지는 시점에 객체 자기자신의 가지는.. 정확하게는 주소값임
		// 매개변수 name과 인스턴스 name의 이름이 중복되므로 this를 사용한것
		public void setName(String name) { // 매개 변수 name
			this.name = name;
		}
		
		
		// getter : 값이 설정된 것을 들고 올때 사용
		public String getName() { 
			return name;
		}

}
