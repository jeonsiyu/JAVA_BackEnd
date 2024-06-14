package java0614_8;

public class Main2 {
	public static void main(String[] args) {
		Marine m = new Marine();
		Tank t = new Tank();
		Dropship d = new Dropship();
	}
}

class Marine {
	int x, y;
	void move(int x, int y) {} 	// x, y 좌표로 이동
	void stop() {}				// 현재 위치에 정지
	void marineFire() {}		// 무기 사용
}

class Tank {
	int x, y;
	void move(int x, int y) {} 	// x, y 좌표로 이동
	void stop() {}				// 현재 위치에 정지
	void TankFire() {}			// 무기 사용 
}

class Dropship {
	int x, y;
	void move(int x, int y) {} 	// x, y 좌표로 이동
	void stop() {}				// 현재 위치에 정지
	void DropshipFire() {}			// 무기 사용 
}