package java0611_2;
// 클래스 : 클래스명 첫자는 대문자
// 클래스 정의
// 캡슐화: 정보 외부 노출 방지
// 추상화: 일반적인 정보에서 필요한 정보만 정의
// public: 외부에서 접근 O
// private: 외부에서 접근 X
public class Person4 {
		// 상수변수 (C, JS, C#: const)
		public static final String CITY = "대구"; // 클래스 변수
		private String name;	// 속성, 멤버변수, 인스턴스 변수
		private String tel;
		private String addr;
		
		// 기본생성자가 없더라고 자바 컴파일러가 자동으로 생성해줌-> 생성자 자체는 기본적으로 무조건 있어야함
		// 만약 생성자를 적었으면 적은대로 따라함ㅇㅇ
		// 객체(인스턴스)가 생성될 때 호출
		public Person4(){
			System.out.println("Person4 기본 생성자");
			name = "김유신";
			tel = "010-444";
			addr = "경북 경주";
			System.out.println();
		 }
		
		public 	Person4( String name, String tel, String addr) {
			this.name = name;
			this.tel = tel;
			this.addr = addr;
			System.out.println("person4 생성자");
		}
		
		public Person4(String name, String tel, String addr) {
				this.name = name;
				this.tel = tel;
				this.addr = addr;
					
		}
		
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
		
		// 객체 지향 언어에서는 동일한 메소드(함수) 선언이 가능하지만 매개변수의 개수, 타입은 다를 것
		// 오버로딩 (중복정의) : 메소드 이름이 동일 => 매개변수의 개수, 타입이 달라야 함
		public static void showPerson(String City) {
			System.out.println("사는 동네:" + City);
		}
}
