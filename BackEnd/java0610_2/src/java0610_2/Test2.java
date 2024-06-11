package java0610_2;

public class Test2 {

	public static void main(String[] args) {
		// 정수형 2차원 배열 초기화
		// 2x3
		int[][] arr = {
				{1, 2, 3},	// 1행
				{4, 5, 6}	// 2행
		};
		
		// 정수형 2차원 빈 배열 
		int[][] arr2 = new int[2][3];
		for (int i=0; i<2; i++) {
			for (int j=0; j<3; j++) {
				arr2[i][j] = arr[i][j];
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println(); // 줄바꿈
		}
		
		System.out.println("----------------------------");
		// hard coding 피하기
		for (int i=0; i<arr2.length; i++) {
			for (int j=0; j<arr2[i].length; j++) {
				arr2[i][j] = arr[i][j];
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println(); // 줄바꿈
		}
		
		int[][] arr3 = {
				{1, 2, 3, 4},
				{5, 6},
				{7, 8, 9},
				{10}
		};
		System.out.println("----------------------------");
		// hard coding 피하기
		for (int i=0; i<arr3.length; i++) {
			for (int j=0; j<arr3[i].length; j++) {
				System.out.print(arr3[i][j] + "\t");
			}
			System.out.println(); // 줄바꿈
		}
		
		// for-each 반복문
		for (int[] i : arr3) {
			for (int j : i) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}
	}

}
