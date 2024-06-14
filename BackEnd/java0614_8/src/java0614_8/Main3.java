package java0614_8;

public class Main3 {
	public static void main(String[] args) {
		Unit[] u = new Unit[3];
		u[0] = new Marine2();
		u[1] = new Tank2();
		u[2] = new Dropship2();
		for (int i=0; i<u.length; i++) {
			u[i].move(100,  200);
		}
	}
}

// 추상클래스는 객체 생성 불가능
abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	void stop() {} // 현재 위치에서 정지
}

class Marine2 extends Unit {
	@Override
	void move(int x, int y) {
		System.out.printf("x:%d y:%d 걸어서 이동\n", x, y);
	}
	void marineFire() {} // 마린 전용 무기
}

class Tank2 extends Unit {
	@Override
	void move(int x, int y) {
		System.out.printf("x:%d y:%d 무한궤도 이동\n", x, y);
	}
	void TankFire() {} // 탱크 전용 무기
}

class Dropship2 extends Unit {
	@Override
	void move(int x, int y) {
		System.out.printf("x:%d y:%d 날아서 이동\n", x, y);
	}
	void DropshipFire() {} // 드랍쉽 전용 무기
}