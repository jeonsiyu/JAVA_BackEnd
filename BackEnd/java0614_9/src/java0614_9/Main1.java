package java0614_9;

public class Main1 {
	public static void main(String[] args) {
		Box<Apple> ab = new Box<>();
		ab.setOb(new Apple());
		System.out.println(ab.getOb());
		
		Box<Orange> ob = new Box<>();
		ob.setOb(new Orange());
		System.out.println(ob.getOb());
	}
}

// 제네릭(범용) 클래스: <모든 타입> 을 사용가능한 클래스
// ArrayList<Customer>
class Box<T> {
	private T ob;
	public T getOb() {
		return ob;
	}
	public void setOb(T ob) {
		this.ob = ob;
	}
}

class Apple {
	public String toString() {
		return "사과";
	}
}

class Orange {
	public String toString() {
		return "오렌지";
	}
}