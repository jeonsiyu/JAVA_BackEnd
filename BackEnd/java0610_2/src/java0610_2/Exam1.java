package java0610_2;

import java.util.Random;

public class Exam1 {

	public static void main(String[] args) {
		// 1차원 배열 지뢰찾기
		// 1: 지뢰, 0: 안전한 땅
		// dmz에서 지뢰를 찾아서 find 배열에 표기
		final int BOMB 		= 1;
		final int SAFTY 	= 0;
		final int WALL_MIN 	= -1;
		final int WALL_MAX 	= 5;
		final int BOMB_SIZE = 5;
		int[] dmz = {1, 1, 1, 0, 0};
		int[] find = new int[BOMB_SIZE];
		for (int i=0; i<dmz.length; i++) {
			if ((i-1) > WALL_MIN && dmz[i-1] == BOMB) find[i]++;
			if (dmz[i] == BOMB) find[i]++;
			if ((i+1) < WALL_MAX && dmz[i+1] == BOMB) find[i]++;
			System.out.print(find[i] + " ");
		}
		System.out.println("\n---------------------------");
		
		// 구구단의 결과값을 2차원 배열에 저장한 후 출력
		/*
		 2x1=2  3x1=3  4x1=4  ...  9x1=9
		 ...
		 2x9=18 3x9=27 4x9=36 ...  9x9=81
		 */
		
		// 2차원 배열 지뢰찾기
		// 1: 지뢰, 0: 안전한 땅
		// dmz2에서 지뢰를 찾아서 find2 배열에 표기
		int[][] dmz2 = {
				{1, 0, 1},
				{0, 1, 1}
		};
		int[][] find2 = new int[2][3];
		for (int i=0; i<dmz2.length; i++) {
			for (int j=0; j<dmz2[i].length; j++) {
				if (dmz2[i][j] == 1) find2[i][j]++;
				if ((i-1) > -1 && dmz2[i-1][j] == 1) find2[i][j]++;
				if ((i+1) < 2 && dmz2[i+1][j] == 1) find2[i][j]++;
				if ((j-1) > -1 && dmz2[i][j-1] == 1) find2[i][j]++;
				if ((j+1) < 3 && dmz2[i][j+1] == 1) find2[i][j]++;
				System.out.print(find2[i][j] + " ");
			}
			System.out.println();
		}		
		
		System.out.println("==========================");
		
		// 로또 생성 (중복 안되게)
		int[] lotto = new int[6];
		Random r = new Random();
		for (int i=0; i<lotto.length; i++) {
			lotto[i] = r.nextInt(45)+1; // 1~45 랜덤하게 획득
			System.out.println(lotto[i]);
		}
	}
}
