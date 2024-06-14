package java0614_9;

public class Main2 {
	public static void main(String[] args) {
		DBox<String, Integer> box = new DBox<>();
		box.set("오렌지", 30);
		System.out.println(box);
		
		DBox<String, Integer> box2 = new DBox<>();
		box2.set("사과", 20);
		System.out.println(box2);
	}
}

class DBox<L, R> {
	private L left;
	private R right;
	
	public void set(L l, R r) {
		left = l;
		right = r;
	}
	
	public String toString() {
		return left + ":" + right;
	}
}