package b.operator;

import java.util.Scanner;

public class Operator6 {
	/*
	 * 삼항연산자 (항을 세개 사용)
	 * [표현식]
	 * 조건식 ? 조건식이 참(true)일 경우 결과값 : 조건식이 거짓일 경우 결과값
	 * 
	 * 이때, 조건식은 반드시 true 또는 false가 나오는 논리값이어야한다.
	 * 주로 비교, 논리연산자를 통해서 작성.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int num = (3 < 10) ? 10 : 20;
//		//조건식이 true이므로 10의 결과값이 num으로 들어간다.
//		System.out.println(num);

		//입력받은 정수값이 양수인지 아닌지 판별 후 출력
		// 정수값 입력 : 
		// 양수/ 음수 :
		System.out.println("정수값 입력 : ");
		int num1 = sc.nextInt();
		System.out.println( (num1 > 0 ? "양수" : "음수"));
		sc.close();
	}

}
