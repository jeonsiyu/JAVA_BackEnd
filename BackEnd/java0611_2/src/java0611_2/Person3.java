package java0611_2;


	// 클래스 : 클래스명 첫자는 대문자
	// 클래스 정의
	// 캡슐화: 정보 외부 노출 방지
	// 추상화: 일반적인 정보에서 필요한 정보만 정의
	// public: 외부에서 접근 O
	// private: 외부에서 접근 X
public class Person3 {
		// 상수변수 (C, JS, C#: const)
		public static final String CITY = "대구"; // 클래스 변수
		private String name;	// 속성, 멤버변수, 인스턴스 변수
		private String tel;
		private String addr;
		
		// 인스턴스 메소드, setter
		// this: 객체(인스턴스) 자신의 정보
		public void setName(String name) {
			this.name = name;
		}
		
		// getter
		public String getName() {
			return name;
		}
		
		public void setTel(String tel) {
			this.tel = tel;
		}
		
		public String getTel() {
			return tel;
		}
		
		public void setAddr(String addr) {
			this.addr = addr;		
		}
		
		public String getAddr() {
			return addr;
		}
		
		public String toString() {
			String str = 
					String.format("Person:[%s, %s, %s]", 
							name, tel, addr);
			return str;
		}
		
		public static void showPerson() {
			//System.out.println("이름:" + name); // 인스턴스 변수 사용 X
		}
}
