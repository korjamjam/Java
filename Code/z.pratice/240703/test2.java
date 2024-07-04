package test.t240703;

import java.util.Scanner;

public class T_02 {
	/*
	 * 키보드로 정수를 입력 받아 정수가 양수이면서 짝수일 때만 "짝수다"를 출력하고
	 * 짝수가 아니면 "홀수다"를 출력하세요.
	 * 양수가 아니면 "양수만 입력해주세요."를 출력하세요
	 * 
	 * ex.
	 * 숫자를 한 개 입력하세요 : -8
	 * 양수만 입력해주세요.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0 && num > 0) {
			System.out.println("짝수다");
		}
		else if(num % 2 == 1 && num > 0) {
			System.out.println("홀수다");
		}
		else {
			System.out.println("양수만 입력해주세요");
		}
		
		//한번에 묶기
//		if(num > 0) {//양수일 때
//			if(num % 2 == 0) {
//				System.out.println("짝수다");
//			}
//			else if(num % 2 == 1) {
//				System.out.println("홀수다");
//			}
//		}
//		else {//양수가 아닐 때
//			System.out.println("양수만 입력해주세요");
//		}
	}
}
