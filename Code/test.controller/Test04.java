package test.controller;

import java.util.Scanner;

public class Test4 {
	/*
	 * main의 argument로 1자리 정수형(1부터 9까지만) 값을 2개 입력받아 4칙연산 결과를 출력한다.
	   입력값은 모두 int 형으로 처리한다
	   4와 2를 입력하였을 경우
		합 : 6
		차 : 2
		곱 : 8
		나누기 : 2 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 System.out.print("정수1 입력 : ");
		 int num1 = sc.nextInt();
		 sc.nextLine();
		 
		 System.out.print("정수2 입력 : ");
		 int num2 = sc.nextInt();
		 sc.nextLine();
		 
			if (num1 >= 1 && num1 <= 9 && num2 >= 1 && num2 <= 9) {
				System.out.println("합 : " + (num1 + num2));
				System.out.println("차 : " + (num1 - num2));
				System.out.println("곱 : " + (num1 * num2));
				if(num1 > num2) {
				System.out.println("나누기 : " + (num1 / num2));
				}
				else {
					System.out.println("나누기 : " + (num2 / num1));
					
				}
				
			}
			else {
				System.out.println("1~9까지의 숫자가 아닙니다.");
			}
		 
		 

	}

}
