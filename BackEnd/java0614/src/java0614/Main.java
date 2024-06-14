package java0614;

public class Main {

	public static void main(String[] args) {
			for (int i = 0; i<5; i++) {
				System.out.println("인스턴스 생성방법:" + 
						new SingleTest().getData());
				System.out.println("싱글톤 생성방법:" + 
						SingleTest.getInstance().getData());
			}
		}
	}

