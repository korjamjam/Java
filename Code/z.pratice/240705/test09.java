package test.t240705;

import java.util.Scanner;

public class T_09 {

	/*
	 * 정수를 입력 받아 양수일 때만 1부터 입력받은 수까지 홀수/짝수를 나눠서
	 * 홀수면 '박', 짝수면 '수'를 출력하도록 하세요.
	 * 단, 입력 받은 수가 양수가 아니면 "양수가 아닙니다"를 출력하세요
	 * 
	 * ex.
	 * 정수 5      정수 10          정수 0
	 * 박수박수박    박수박수박수박수박수  양수가 아닙니다.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;

		while (true) {
			System.out.print("정수 :");
			num = sc.nextInt();

			if (num > 0) {
				for (int i = 1; i <= num; i++) {
					// System.out.print(i % 2 == 0 ? "수" : "박");
					if (i % 2 == 1) {
						System.out.print("박");
					} else {
						System.out.print("수");
					}
				}
				System.out.println("");
			}
			else if(num == 0) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			else {
				System.out.println("양수가 아닙니다.");
				continue;
			}

		}
	}

}
