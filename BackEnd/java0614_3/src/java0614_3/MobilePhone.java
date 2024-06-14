package java0614_3;

// 자바 교재 P332 참고
// private: 상속 X, 외부 접근 X
// protected: 상속 O
// public: 상속 O, 외부 접근 O
public class MobilePhone {
	protected String number;
	
	public MobilePhone(String num) {
		number = num;
	}
	
	public void answer() {
		System.out.println("부모 Hi~ from " + number);
	}
	
	public void playApp(String ver) {
		System.out.println("부모앱 실행: " + ver);
	}
}

class SmartPhone extends MobilePhone {
	private String androidVer;
	
	public SmartPhone(String num, String ver) {
		super(num);
		androidVer = ver;
	}
	
	// 오버로딩
	public void playApp() {
		System.out.println("SmartPhone:" + androidVer);
	}
	
	// 오버라이딩
	public void playApp(String ver) {
		System.out.println("SmartPhone:" + ver);
	}
}