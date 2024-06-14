package java0614_4;

public class Cake {
	public void yummy() {
		System.out.println("yummy Cake");
	}
}

class CheeseCake extends Cake {
	public void yummy() {
		System.out.println("yummy CheeseCake");
	}
}

class StrawberryCeeseCake extends CheeseCake {
	public void yummy() {
		super.yummy(); // this와 비교해서 정리
		System.out.println("yummy StrawberryCeeseCake");
	}
}

