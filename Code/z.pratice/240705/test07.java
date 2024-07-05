package test.t240705;

import java.util.Scanner;

public class T_07 {
	/*
	 * 사용자로부터 두개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요
	 * 만일 1 미만의 숫자가 입력됐다면 "1이상의 숫자를 입력해주세요"를 출력되면서
	 * 다시 사용자가 값을 입력하도록 하세요
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		while (true) {
//			int num1, num2;
//			System.out.print("첫 번째 숫자 :");
//			num1 = sc.nextInt();
//
//			System.out.print("두 번째 숫자 :");
//			num2 = sc.nextInt();
//
//			if (num1 > 0 && num2 > 0) {
//				if (num1 < num2) {
//					for (int i = num1; i <= num2; i++) {
//						System.out.print(i + " ");
//					}
//					break;
//				} 
//				else if (num1 > num2)
//					for (int i = num2; i <= num1; i++) {
//						System.out.print(i + " ");
//						break;
//					}
//			} 
//			else {
//				System.out.println("1 이상의 숫자를 입력해주세요");
//				continue;
//			}
//			sc.close();
//		}
		
		int num1, num2, max, min;
		
		while (true) {
		System.out.print("첫 번째 숫자 :");
		num1 = sc.nextInt();

		System.out.print("두 번째 숫자 :");
		num2 = sc.nextInt();
		
		max = (num1 > num2) ? num1 : num2;
		min = (num1 < num2) ? num1 : num2;
		
		if(min < 1 || max < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}
		else {
			for(int i = min; i<=max; i++) {
				System.out.print(i + " ");
			}
			break;
		}
		sc.close();
		}
	}
}
