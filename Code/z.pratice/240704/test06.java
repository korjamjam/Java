package test.t240704;

import java.util.Scanner;

public class T_06 {
	/*
	 * 사용자에게 입력받은 양의 정수만큼 배열크기를 할당하고
	 * 1부터 입력받은 값까지 배열에 초기화한후 출력하세요.
	 * 
	 * ex.
	 * 양의 정수 : 5
	 * 1 2 3 4 5
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.print("양의 정수 :"); // num > 0
		num = sc.nextInt();
		
		int[] arr = new int[num];
		
		if (num > 0) {
			for (int i = 0; i < arr.length; i++) {
				arr[i] = i + 1;
				System.out.println(i + "번 인덱스 값 : " + arr[i]);
			}
		}
		else {
			System.out.println("양의 정수가 아닙니다.");
		}
	}
}
