package test.controller;

import java.util.Scanner;

public class Test5 {
	/*
	 * 키보드로 2개의 정수형 데이터를 입력 받아, 
	 * 두 수가 모두 1부터 9까지의 수일 때만 두 수의 곱이 한자리 수인지 두자리 수인지를 출력한다. 
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 입력 :");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 입력 :");
		int num2 = sc.nextInt();
		
		boolean val1 = (num1 >= 1 && num1 <= 9);
		boolean val2 = (num1 >= 2 && num2 <= 9);
		
		if (val1 && val2) {
			int gob = num1 * num2;
			
			if(gob / 10 == 0){
				System.out.println("한자리 수 입니다.");
			}
			else{
				System.out.println("두자리 수 입니다.");
			}
		}
		
		else {
			System.out.println("1부터 9까지의 수가 아닙니다.");
		}
		
		
		
	}

}
