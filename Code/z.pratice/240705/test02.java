package test.t240705;

import java.util.Scanner;

public class T_02 {
	/*
	 * 주빈번호를 이용하여 남자인지 여자인지 구분하여 출력하세요
	 * ex.
	 * 주민번호를 입력하세요(- 포함) : 132456-2123456
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(- 포함) :");
		String num = sc.next();
		char gender = num.charAt(7);
		
		if(gender == '3' || gender == '1'){
			System.out.println("\n남자");
		}
		else if(gender == '2' || gender == '0'){
			System.out.println("\n여자");
		}
		else {
			System.out.println("잘못 입력했습니다.");
		}
		
		switch(gender) {
		case '1','3':
			System.out.println("\n남자");
			break;
		case '0','2':
			System.out.println("\n여자");
			break;
		default:
			System.out.println("잘못 입력했습니다.");
			
		}
	}

}
