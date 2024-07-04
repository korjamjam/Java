package test.t240704;

import java.util.Scanner;

public class T_01 {
	/*
	 * 아이디 비밀번호를 정해두고 로그인 기능을 작성하세요
	 * 로그인 성공시 "로그인 성공"
	 * 아이디가 틀렸을 시 "아이디가 틀렸습니다"
	 * 비밀번호가 틀렸을 시"비밀번호가 틀렸습니다."를 출력하세요
	 * ex 1.
	 * 아이디 : myId
	 * 비밀번호 : myPassword12
	 * 로그인 성공
	 * 
	 * ex 2.
	 * 아이디 : my
	 * 비밀번호 : myPassword12
	 * 아이디가 틀렸습니다.
	 * 
	 * ex 3.
	 * 아이디 : myId
	 * 비밀번호 : myPassword
	 * 비밀번호가 틀렸습니다.
	 */

	public static void main(String[] args) {
		final String ID = "myId";
		final String PWD = "myPassword12";
		
		String scid, scpwd;
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 :");
		scid = sc.next();
		
		System.out.print("비밀번호 :");
		scpwd = sc.next();
		
//		if(ID.equals(scid)&& PWD.equals(scpwd)) {
//			if(PWD.equals(scpwd)) {
//				System.out.println("로그인 성공");
//			}
//			else {
//				System.out.println("비밀번호가 틀렸습니다.");
//			}
//		}
//		else {
//				System.out.println("아이디가 틀렸습니다.");
//		}
		
		if(ID.equals(scid)&& PWD.equals(scpwd)) {
			System.out.println("로그인 성공");
		}
		else if(ID.equals(scid)&& PWD.equals(scpwd) == false){
			System.out.println("비밀번호가 틀렸습니다.");
		}
		else if(ID.equals(scid) == false && PWD.equals(scpwd)){
			System.out.println("아이디가 틀렸습니다.");
		}
		else {
			System.out.println("둘다 틀렸습니다.");
		}
		
		
	}

}
