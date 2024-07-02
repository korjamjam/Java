package d.loop;

import java.util.Scanner;

public class C_do_while {
	/*
	 * do-while문
	 * 
	 * do{
	 *    실행할 코드
	 * }
	 *  while(조건식);{ 
	 *    반복적으로 실행시키고자하는 코드더미
	 *    [증감식 or 분기문];
	 *    }
	 * 처음에 무조건 실행코드 한번 실행하고 조건문 검사.
	 * 기존에 for/while문 과의 차이점
	 * for/while문은 처음 수행할 때 조건 검사 후 true일 경우 반복코드를 실행
	 * 하지만 do-while일 경우 첫 실행은 조건검사 없이 무조건 실행
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//사용자가 입력한 수를 계속해서 더하는 프로그램을 작성
		//단, 사용자가 0을 입력하면 종료
		int num;
		int sum = 0;
		System.out.println("숫자 입력 :");
		num = sc.nextInt();
		
		do {
			num = sc.nextInt();
			sum += num;
		}
		while(num != 0); 
		{
			System.out.println("합" + sum);	
		}
	}
}
