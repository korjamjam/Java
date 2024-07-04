package test.t240704;

import java.util.Scanner;

public class T_02 {
	/*
	 * 사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하세요
	 * 단, 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
	 * 회원은 게시글 작성,게시글 조회, 댓글 작성이 가능하고
	 * 비회원은 게시글 조회만 가능합니다.
	 * 
	 * ex.
	 * 권한을 확인하고자 하는 회원 등급 : 관리자
	 * 회원관리 게시글관리 게시글작성 댓글작성 게시글조회
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		String grade;
//		System.out.print("권한을 확인하고자 하는 회원 등급 :");
//		grade = sc.next();
//		
//		if(grade.equals("관리자")) {
//			System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
//		}
//		else if(grade.equals("회원")) {
//			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
//		}
//		else if(grade.equals("비회원")) {
//			System.out.println("게시글 조회");
//		}
//		else {
//			System.out.println("잘못된 입력입니다.");
//		}
//		
//		int i = 0;
//		while (i < 1) {
//
//			switch (grade) {
//
//			case "관리자": {
//				System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
//				break;
//			}
//			case "회원": {
//				System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
//				break;
//			}
//			case "비회원": {
//				System.out.println("게시글 조회");
//				break;
//			}
//			default: {
//				System.out.println("잘못된 입력입니다");
//				continue;
//			}
//			}
//			i++;
//			sc.close();
//		}
		
		String grade;
		String access ="";
		System.out.print("권한을 확인하고자 하는 회원 등급 :");
		grade = sc.next();
		
		switch (grade) {

		case "관리자": {
			access += "회원관리 게시글 관리 ";
		}
		case "회원": {
			access += "게시글 작성 댓글 작성 ";
		}
		case "비회원": {
			access += "게시글 조회";
		}
		default: {
			System.out.println("잘못된 입력입니다");
		}
		System.out.println(access);
		}
	}
}
