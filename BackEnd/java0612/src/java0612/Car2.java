package java0612;

public class Car2 {
	public static final String JIJUM = "동대구 영업소";
	private String company; // 제조사
	private String price;	// 가격
	private String name;	// 모델명
	private String color;	// 색상
	
	//tool 사용해서 하기
	
	public Car2() {
		company = "기아";
		price = "4천만원";
		name = "K7";
		color = "검정";
	}

	public Car2(String company, String price, String name, String color) {
		super();
		this.company = company;
		this.price = price;
		this.name = name;
		this.color = color;
	}

	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	// 어노테이션: 자바 컴파일러에게 정보를 알려줌
	@Override
	public String toString() {
			String str = 
					String.format("Car:[%s, %s, %s, %s]",  
							company, price ,name, color);
			return str;	
	}
	
}

