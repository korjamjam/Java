package test.t240704;

import java.util.Scanner;

public class T_03 {
	/*
	 * 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
	 * 만일 1미만의 숫자가 입력됐다면 "1이상의 숫자를 입력해주세요"를 출력하세요
	 * 
	 * ex.
	 * 첫번째 숫자 : 8 두번째 숫자 : 4
	 * 4 5 6 7 8
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 숫자 :");
		int num1 = sc.nextInt();
		sc.nextLine();

		System.out.print("두번째 숫자 :");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		int max = (num1 > num2) ? num1: num2;
		int min = (num1 < num2) ? num2: num1;
		
		if(min < 1 || max < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		else {
		for(int i = min; i<=max; i++) {
			System.out.print(i + " ");			
		}
		}
		
//		if (num1 >= 1 && num2 >= 1) {
//			if (num1 > num2) {
//				for (int i = num2; i <= num1; i++) {
//					System.out.print(i + " ");
//				}
//			} 
//			else {
//				for (int i = num1; i <= num2; i++) {
//					System.out.print(i + " ");
//				}
//
//			}
//		} 
//		else {
//			System.out.println("1이상의 숫자를 입력해주세요");
//		}
	}
}
