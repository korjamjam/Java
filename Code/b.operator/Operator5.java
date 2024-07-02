package b.operator;

import java.util.Scanner;

public class Operator5 {
	/*
	 * 5. 논리연산자
	 * 두개의 논리값을 연산해주는 연산자
	 * 논리연산한 결과도 논리값이 된다.
	 * 
	 * 논리값 && 논리값 : 왼쪽, 오른쪽에 두 논리값이 모두 true일 때만 결과가 true이다.
	 * 논리가 || 논리값 : 왼쪽, 오른쪽 두 값중 하나라도 true라면 결과는 true가 된다.
	 * 
	 * &&
	 * true  && true  -> true
	 * true  && false -> false
	 * false && true  -> false
	 * false && false -> false
	 * => 앞의 결과가 false일 경우 뒤의 조건은 굳이 실행하지 않는다.
	 * 
	 * ||
	 * true  || true   -> true
	 * true  || false  -> true
	 * false || true   -> true
	 * false || false  -> false
	 * => 앞의 결과가 true일 때 뒤의 조건은 굳이 실행하지 않는다.
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		//Ctrl + shift + O누르면 스캐너 유틸 자동 추가
//		
//		/*
//		 * 사용자에게 숫자를 입력받아 해당 숫자가 1~100사이의 값인지 확인
//		 */
//		int num1;
//		System.out.print("정수 하나 입력 :");
//		num1 = sc.nextInt();
//		
//		boolean result = ((1 <= num1) && (100 >= num1));
//		System.out.println(result);
//		System.out.println((num1 >= 1) && (num1 <=100));
//		//1 <= num1 <=100은 안됨.
		
		//사용자에게 알파벳 하나를 입력받아 대소문자를 확인
		//문자 하나 입력 : 
		//사용자가 입력한 값이 대문자 입니다 : (true/false)
		// 
		
//		char ch1;
//		System.out.print("문자 하나 입력 : ");
//		
//		//문자하나를 입력받을 때는 charAt을 이용함.
//		ch1 = sc.nextLine().charAt(0); 
//		
//		//1번 방법
//		boolean res1 = (ch1 >= 65) && (ch1<=90);
//		boolean res2 = (ch1 >= 'A') && (ch1<='Z');
//		boolean res3 = (ch1 >= 'a') && (ch1<='z');
//		boolean res4 = res2 || res3;
//		System.out.println("사용자가 입력한 값이 대문자 입니다 :" + res1);
//		System.out.println("사용자가 입력한 값이 대문자 입니다 :" + res2);
//		System.out.println("사용자가 입력한 값이 소문자 입니다 :" + res3);
//		System.out.println("사용자가 입력한 값이 알파벳 입니다 :" + res4);
		
		int num = 10;
		
		boolean result = (num < 5) && (++num > 0);
		
		System.out.println("연산후의 num : " + num);
	}

}
