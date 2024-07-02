package a.basic;

public class Conversion {
	/*
	 * 형변환
	 * 자료형을 다른 자료형으로 변경해주는 것이다
	 * 
	 * 자동형변환
	 * 두개 이상의 자료형을 연산할 때 하나의 자료형으로 일치시켜야 연산이 가능하다.
	 * 그래서 데이터 손실이 적은 방향으로 컴파일러가 직접 형변환을 해주는 것
	 * 
	 * 명시적형변환(강제)
	 * 값의 범위가 큰 자료형을 값의 범위가 작은 자료형으로 변환할 때
	 * 자동으로 컴파일러가 해주지 않기 때문에 프로그래머가 명시적으로 진행한다.
	 */

	public static void main(String[] args) {
		int num10 = 10;
		double result = num10; // int -> double (자동형 변환)
		System.out.println(result);
		
		double pi = 3.1415;
		int num1 = (int)pi;
		System.out.println(num1);
		
		long num = 3000000007L;
		int num2 = (int)num;
		System.out.println(num2);
		
		short num4 = 2;
		short num5 = 3;
		short num6 = (short)(num4 + num5);
		System.out.println(num6);
	}

}
