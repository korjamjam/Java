package test.t240704;

import java.util.Scanner;

public class T_04 {
	/*
	 * 사용자로부터 입력받은 숫자의 단부터 9단까지 출력하세요
	 * 단, 9를 초과하는 숫자가 들어오면 "9이하의 숫자만 입력해주세요
	 * 숫자 : 4
	 * ====4단====
	 * 4 * 1 = 4
	 * ...
	 * ====5단====
	 * ...
	 * ====9단====
	 * ...
	 * 9 * 9 = 81
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dan;
		System.out.print("숫자 :");
		dan = sc.nextInt();
		
		if(dan <= 9) {
			for(int i = dan; i <= 9; i++) {
				System.out.println("==== "+ i +"단 ====");
				for(int j = 1; j <=9; j++) {
					System.out.println(i + " * " + j + " = "+ (i*j));
				}
			}
		}
		else {
			System.out.println("9 이하의 숫자만 입력해주세요.");
		}
		
		
	}
}
