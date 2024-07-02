package d.loop;

import java.util.Scanner;

public class B_while {
	/*
	 * while문
	 * 
	 * [표현법]
	 * 
	 * [초기식;]
	 * while(조건식){ 
	 *    반복적으로 실행시키고자하는 코드더미
	 *    [증감식 or 분기문];
	 * }
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*for(int i = 0; i < 5; i++) {
			System.out.println("안녕하세요.");
		}*/
		
		//사용자가 0을 입력할 때 까지 반복해서 숫자를 입력받아 그대로 출력한다.
//		while(true) {
//			int n = sc.nextInt();
//			if(n == 0) {
//				break;
//			}
//			else {
//				System.out.println(n);
//			}
//		}
		//1에서부터 10000사이의 홀수만을 출력
		//while문을 이용해서 하기
//		int i = 1;
//		while(i <= 10000) {
//			if(i % 2 == 1) {
//				System.out.println(i);
//			}
//			i++;
//		}
		//1부터 랜덤값(1~100)사이의 합계
		/*int i =1;
		int sum = 0;
		int num = (int)(Math.random() * 100)+1;
		while(i <= num) {
			sum += i;
			i++;
		}
		System.out.print("1부터 " + num + "까지의 합 :" + sum);*/
		
		//사용자에게 문자열을 입력받아
		//해당 문자열의 짝수자리 글자만 출력
		//문자열 입력 : hello
		
		String str;
		System.out.print("문자열 입력 :");
		str = sc.next();
		
//		int i = 0;
//		while(i <= str.length()) {
//			if(i % 2 == 1) {
//				System.out.print(str.charAt(i) + " ");
//			}
//			i++;
//		}
		
		int i = 1;
		while(i <str.length()) {
			System.out.println(str.charAt(i));
			i += 2;
		}
	}

}
