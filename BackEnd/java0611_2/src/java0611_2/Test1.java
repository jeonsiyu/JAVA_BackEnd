package java0611_2;

public class Test1 {

	public static void main(String[] args) {
		// 객체 정의만으로는 출력X -> 객체를 생성한 다음 사용가능
		// 클래스 person 객체 생성
		// person 클래스에 person 생성자로 객체 생성
		Person p = new Person();
  //-> 클래스타입 참조변수 = 객체를 생성하는 동작 (new+생성자) 
		// new person으로 만들어진 객체(덩어리)를 정확하게는 인스턴스라고 말함
		// p.name = "홍길동"; // -> 캡슐화 위배
		// 객체지향언어에서는 변수에 직접 접근하는 것을 별로 좋아하지 않음
		// private으로 name이 설정되어 빨간 줄이 그어지는 것 -> 캡슐화 위배
		p.setName("홍길동"); 
		System.out.println("이름:" + p.getName());
				
		// 객체 생성
		// 자동으로 사용하지 않는 객체 제거 -> 가비지 컬렉터 (->객체지향언어에서 프로그램 자체에서 사용되는..) 
		// -> 객체를 생성할 때는 무조건 생성자가 필요
		// person이 생성자가 됨 
		// new 힙 메모리에 객채를 할당하는 느낌..
		// 참조 변수가 없으므로 접근 할 수 없음 -> 인스턴스에 접근하려면 변수를 지정해주어야 함
		new Person(); // -> 인스턴스에 접근 x = 안에 속성에 접근 x
			
		// 객체끼리는 서로 다른 객체임 -> 같은 정보가 들어 갈순 있지만..
		Person p2 = new Person();
		// p.2name = "홍길동";
		p2.setName("홍길동");
			 
		// person2 객체 생성
		Person2 p3 = new Person2();
		// 객체에 정보를 설정
		p3.setName("전우치");
		p3.setTel("010-1111");
		p3.setAddr("한양 홍대감댁");
		// 객체 정보를 출력
		System.out.println("이름:" + p3.getName());
		System.out.println("전화:" + p3.getTel());
		System.out.println("주소:" + p3.getAddr()); 
		System.out.println(p3.toString());
		
		// Person3 객체 생성
		Person3 p4 = new Person3();
		Person3 p5 = new Person3();
		Person3 p6 = new Person3();
		System.out.println(p4.CITY); // 사용 가능하나 권장 x
		System.out.println(Person3.CITY); // 클래스 변수 사용(권장) -> 클래스의 이름을 사용하여..
		Person3.showPerson(); // 클래스 메소드 사용
		p4.showPerson(); // 사용 가능 하나 권장 x
		p5.showPerson();
		p6.showPerson();
		
		// -> 인스턴스는 인스턴스 참조 변수로 사용
		// -> 클래스는 클래스 참조 변수로 사용
		
		// 	Person4 객체 생성 -> 무조건 생성자에 의해서 생성
		Person4 p7 = new Person4(); // 생성자(클래스명과 동일)
		p7.setName("유관순");
		p7.setTel("010-222");
		p7.setAddr("서울 마포구");
		System.out.println(p7.toString());
		
		Person4 p8 = 
				new Person4("신사임당","010-333", "전남 목포"); // 매개변수가있는 생성자
		System.out.println(p8.toString());
	
		
	}

}
