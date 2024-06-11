package java0610_2;

public class Test1 {

	public static void main(String[] args) {
		// 1차원 배열의 초기화
		//int[] arr = {1, 2, 3, 4, 5};	// 객체지향 
		int arr[] = {1, 2, 3, 4, 5}; 	// C 형태
		int hap = 0;
		for (int i=0; i<arr.length; i++) {
			hap += arr[i];
		}
		System.out.printf("합:%d, 평균:%d\n",
				hap, hap/arr.length);
		
		// 1차원 비어있는 배열
		// 크기가 100인 빈 정수형 1차원 배열
		int[] arr2 = new int[100];
		// 크기가 100인 빈 스트링 1차원 배열
		String[] strArr = new String[100];
		float[] arr3 = new float[100];
		char[] arr4 = new char[100];
		
		// 1~100까지의 수를 빈 배열에 저장
		// 배열에 저장된 값중에서 5의 배수만 출력
		// 배열의 위치가 90번째 일때 반복문 탈출
		int[] arr5 = new int[100];
		for (int i=0; i<arr5.length; i++) {
			if (i == 89) break;
			arr5[i] = i+1;
			if (arr5[i] % 5 == 0) {
				System.out.println(arr5[i]);
			}
		}
	}
}
