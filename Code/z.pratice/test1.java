package test.t240703;

import java.util.Scanner;

public class T_01 {
	/*
	 * 아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 "oo메뉴입니다"를
	 * 종료 번호를 누르면 "프로그램이 종료됩니다"를 출력하세요.
	 * System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 :");
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 :");
		int num = sc.nextInt();
		
		// swtich문
		switch (num) {
		case 1: {
			System.out.println("switch 입력 메뉴 입니다.");
			break;
		}
		case 2: {
			System.out.println("switch 수정 메뉴 입니다.");
			break;
		}
		case 3: {
			System.out.println("switch 조회 메뉴 입니다.");
			break;
		}
		case 4: {
			System.out.println("switch 삭제 메뉴 입니다.");
			break;
		}
		case 7: {
			System.out.println("switch 프로그램이 종료됩니다.");
			break;
		}
		default: {
			System.out.println("switch 잘못 입력했습니다.");
			break;
		}
		}

		//if문
		if(num == 1) {
			System.out.println("if 입력 메뉴 입니다.");
		}
		else if(num == 2) {
			System.out.println("if 수정 메뉴 입니다.");
		}
		else if(num == 3) {
			System.out.println("if 조회 메뉴 입니다.");
		}
		else if(num == 4) {
			System.out.println("if 삭제 메뉴 입니다.");
		}
		else if(num == 7) {
			System.out.println("if 프로그램이 종료됩니다.");
		}
		else {
			System.out.println("if 잘못 입력했습니다.");
		}
		
	}
}
