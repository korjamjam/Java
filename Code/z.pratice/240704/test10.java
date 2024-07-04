package test.t240704;

public class T_10 {
	/*
	 * 4행 4열짜리 정수형 배열을 선언 및 할당하고
	 * 1) 16~1까지 값을 차례대로 저장하세요
	 * 2)저장된 값들을 차례대로 출력하세요.
	 * 
	 * ex.
	 *  16 15 14 13
	 *  12 11 10 9
	 *  8  7  6  5
	 *  4  3  2  1
	 */

	public static void main(String[] args) {
		int[][] arr = new int[4][4];
		int num = 16;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				arr[i][j] = num--;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}

	}

}
