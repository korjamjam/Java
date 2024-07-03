package d.loop;

import java.util.Scanner;

public class D_break {
	/*
	 * break; : 반복문,switch문 안에서 사용되는 분기문
	 *          break;가 실행되는 순간 현재 속해있는 가장 가까운 반복문 또는 switch문을 강제로 탈출
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//랜덤값(1~100) 발생시키고 그 랜덤값을 출력해보기
		//단, 발생한 값이 3의 배수(3으로 나누면 0)일 경우 반복문 종료	
//		while(true) {
//			int num = (int)(Math.random() * 100) + 1;
//			System.out.println(num);
//			if(num % 3 == 0) {
//				break;
//			}			
//		}
		//사용자에게 문자열을 입력받아 해당 문자열의 길이를 출력(과정 반복)
		//단, 사용자가 입력한 문자열이 "exit"일 경우 반복문을 탈출
		
		//코딩을 볼 때 예외가 많다.
		//그럴 때 문제의 기본이되는 코드를 작성하고, 예외를 작성해주면 된다.
		String str;
		
		while(true) {
			System.out.print("영어 문자 입력 :");
			str = sc.next();
			if(str.equals("exit")) //문자열 비교 equals 무조건 외울 것!
			{
				break;
			}
			System.out.println(str.length());
		}
		sc.close();
	}

}
