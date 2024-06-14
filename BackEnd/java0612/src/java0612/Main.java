package java0612;

public class Main {

	public static void main(String[] args) {
		// >>> 차량관리 프로그램을 위해 Car 클래스 정의 <<<
		// 1. 대리점명: JIJIM(상수 클래스 변수), 제조사 : company
		//    가격: price, 모델명 : name, 색상: Color
		// 2. 기본생성자를 만들고 아래의 값들로 초기화
		// 	  제조사: "기아", 색상:"검정", 모델명: "k7", 가격:"4천만원"
		// 3. 매개변수를 가지는 생성자 만들기.
		// 4. 모든 인스턴스 변수들에 대해서 setter/getter 추가
		// 5. 모든 인스턴스 변수정보를 출력하는 toString() 추가
		// 6. 기본생성자를 사용하여 객체를 생성하고 모든 정보 출력.
		 Car car = new Car();
		 System.out.println("K7 구매 지점:" + Car.JIJUM);
		 System.out.println(car.toString());
		// 7. 매개변수가 있는 생성자를 사용하여 객체 생성 후 정보 출력
		 Car car2 = new Car("현대", "4천만원", "그랜저", "흰색");
		 System.out.println("K7 구매 지점:" + Car.JIJUM);
		 System.out.println(car2.toString());
		 
	}
}
