package java0612;

public class Car {
	// 직접 코딩하기
	// 클래스 Car의 정의
	public static final String JIJUM = "동대구 영업소";
	private String company; // 제조사
	private String price;	// 가격
	private String name;	// 모델명
	private String color;	// 색상

	// 생성자도 하나의 특수한 메소드로 본다.
	// 기본생성자
	public Car(){ 
		company = "기아";
		price = "4천만원";
		name = "K7";
		color = "검정";
	 }
	
	// 매개변수를 가지는 생성자
	public Car(String company, String price, String name, String color) {
        this.company = company;
        this.price = price;
        this.name = name;
        this.color = color;
		}
	
	// setter
	public void setCompany(String company) {
		this.company = company;
	}
	
	//getter
	public String getCompany() {
		return company;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}
	
	public String getPrice() {
		return price;
	}
	
	public void setName(String name) {
		this.name = name;		
	}
	
	public String getName() {
		return name;
	}
	
	public void setColor(String color) {
		this.color = color;		
	}
	
	public String getColor() {
		return color;
	}
	
	// 모든 인스턴스 변수에 대해서 setter/getter가 필요함
	
	public String toString() {
		String str = 
				String.format("Car:[%s, %s, %s, %s]",  
						company, price ,name, color);
		return str;
	}
	
}



