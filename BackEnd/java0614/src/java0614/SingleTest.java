package java0614;

// 객체 지향 프로그래밍
// 1. UML - 프로그램의 구조를 도식화
// 2. 아키텍처(시스템 구조) 패턴(모든 프로그래밍) - MVC(웹)
// 		M:Model, V:View, C:Controller
// 3. 디자인 패턴 - 클래스를 정의, 생성, 사용하는 방법론

// 디자인 패턴중에서 실무에서 가장 많이 사용하는 싱글톤
// 만일, 인스턴스를 5개 생성하면 모두 서로 다른 인스턴스
// 싱글톤 방법으로 인스턴스를 5개 생상하면 모두같은 인스턴스
// 싱글톤: 최초에 생성된 1개의 객체만 사용하는 방법 -> 프로그램을 간결하고 깔끔하게 만들기 위한 방법
public class SingleTest {
	private static SingleTest inst;
	private int data;
	
	public SingleTest() {
		data = (int)(Math.random()*100);
	}
	
	public static SingleTest getInstance() {
		if ( inst == null) {
			inst = new SingleTest();
		}
		return inst;
	}
		public int getData() {
			return data;
		}
}
