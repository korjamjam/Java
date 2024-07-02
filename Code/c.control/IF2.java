package c.control;

import java.util.Scanner;

public class A_if2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 나이를 입력받아
		// 13세이하 : 어린이
		// 13세초과 19세이하 : 청소년
		// 19세 초과 : 성인

		//
		// xx세는 xxx에 속합니다.

//		int age;	
//		System.out.print("나이를 입력 :" );
//		age = sc.nextInt();
//		sc.nextLine();
//		
//		if(age <= 13 && age > 0) {
//			System.out.println(age + "세는 " + "어린이에 속합니다.");
//		}
//		else if(age > 13 && age <=19) {
//			System.out.println(age + "세는 " + "청소년에 속합니다.");
//		}
//		else if(age > 19) {
//			System.out.println(age + "세는 " + "성인에 속합니다.");
//		}
//		else{
//			System.out.println("잘못 입력했습니다.");
//		}
//		sc.close();

		// 성별을 (대소문자 상관x)로 입력받아 남학생인지 여학생인지
		// 출력하는 프로그램을 작성하세요.

//		System.out.print("성별을 입력하세요(m, f) :");
//		char gen;
//		String result;
//		gen = sc.next().charAt(0);
//		sc.nextLine();
//		
//		if(gen == 'm' || gen == 'M') {
//			result = "남학생";
//			
//		}
//		else if(gen == 'f' || gen == 'F') {
//			result = "여학생";
//		}
//		else {
//			System.out.println("잘못 입력했습니다.");
//			return; // 1. 함수를 끝낸다.
//		}
//		System.out.println(result + "입니다.");
//		sc.close();

		// 정수(양수)를 입력받아
		// 짝수인지 홀수인지 출력하는 프로그램을 작성해라

		// 정수 입력: xx
		// 짝수다/ 홀수다 / 양수가 아닙니다.

		System.out.print("정수를 입력 :");
		int num;
		num = sc.nextInt();
		sc.nextLine();

		String result;
//		if(num % 2 == 0 && num > 0) {
//			result = "짝수다";
//		}
//		else if(num % 2 == 1 && num > 0) {
//			result = "홀수다";
//		}
//		else {
//			System.out.println("양수가 아닙니다.");
//			return;
		if (num > 0) {
			if (num % 2 == 0) {
				result = "짝수다";
			} else {
				result = "홀수다";
			}
		} else {
			System.out.println("양수가 아닙니다.");
			return;
		}
		System.out.println(result);
	}
}
