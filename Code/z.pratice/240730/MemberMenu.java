package test.t240730.object1;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class MemberMenu {
	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();

	public void mainMenu() {

		System.out.println("========== KH 사이트 ==========");
//		******* 메인 메뉴 *******
//		1. 회원가입 // joinMembership() 실행
//		2. 로그인 // logIn() 실행 후 memberMenu() 실행
//		3. 같은 이름 회원 찾기 // sameName()
//		9. 종료 // “프로그램 종료.” 출력 후 main()으로 리턴
//		메뉴 번호 선택 : >> 입력 받음
		// 메뉴 화면 반복 실행 처리
		// 잘 못 입력 하였을 경우 "잘못 입력하였습니다. 다시 입력해주세요" 출력 후 반복
		while (true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 같은 이름 회원 찾기");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				this.joinMembership();
				break;
			case 2:
				this.logIn();
				this.memberMenu();
				break;
			case 3:
				this.sameName();
				break;
			case 9:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}

		}

	}

	public void memberMenu() {
//		******* 회원 메뉴 *******
//		1. 비밀번호 바꾸기 // changePassword() 실행
//		2. 이름 바꾸기 // changeName()
//		3. 로그아웃 // “로그아웃 되었습니다.” 출력 후 mainMenu()로 리턴
//		메뉴 번호 선택 : >> 입력 받음
		// 메뉴 화면 반복 실행 처리
		// 잘 못 입력 하였을 경우 "잘못 입력하였습니다. 다시 입력해주세요" 출력 후 반복
		while (true) {
			System.out.println("******* 회원 메뉴 *******");
			System.out.println("1. 비밀번호 바꾸기");
			System.out.println("2. 이름 바꾸기");
			System.out.println("3. 로그아웃");
			System.out.println("메뉴 번호 선택 : ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				this.changePassword();
				break;
			case 2:
				this.changeName();
				break;
			case 3:
				System.out.println("로그아웃 되었습니다.");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			}
		}

	}

	public void joinMembership() {

		while (true) {
			System.out.print("아이디 : ");
			String id = sc.nextLine();

			System.out.print("비밀번호 : ");
			String password = sc.nextLine();

			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			Member m = new Member(password, name);			
			
			if(mc.joinMembership(id, m)) {
				System.out.println("성공적으로 회원가입 완료하였습니다");
			}else {
				System.out.println("중복된 대상입니다. 다시 입력하세요.");
				return;
			}
		}

	}

	public void logIn() {
		while (true) {
			System.out.print("아이디 : ");
			String id = sc.nextLine();

			System.out.print("비밀번호 : ");
			String password = sc.nextLine();

			String name = mc.logIn(id, password);
			if (name != null) {
				System.out.println(name + "님 환영합니다.");
				return;
			} else {
				System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
			}
		}
	}

	public void changePassword() {
		System.out.print("아이디 : ");
		String id = sc.nextLine();

		System.out.print("현재 비밀번호 : ");
		String password = sc.nextLine();
		
		System.out.print("새 비밀번호 : ");
		String newPwd = sc.nextLine();
		
		if(mc.changePassword(id, password, newPwd)) {
			System.out.println("비밀번호 변경에 성공했습니다.");
		}else {
			System.out.println("비밀번호 변경에 실패했습니다.");
		}

	}

	public void changeName() {
		while (true) {
			System.out.print("아이디 : ");
			String id = sc.nextLine();

			System.out.print("비밀번호 : ");
			String password = sc.nextLine();

			String name = mc.logIn(id, password);
			if (name != null) {
				System.out.println("현재 설정된 이름 : " + name);
				
				System.out.println("변경앟ㄹ 이름 : ");
				String newName = sc.nextLine();
				
				mc.changeName(id, newName);
			} else {
				System.out.println("이름 변경에 실패했습니다");
			}
		}

	}

	public void sameName() {
		System.out.println("이름 : ");
		String name = sc.nextLine();
		TreeMap result = mc.sameName(name);
		if(result.isEmpty()) {
			System.out.println("회원을 찾지 못하였습니다.");
		}else {
			for(Object entry : result.entrySet()) {
				Entry<String, String> en = (Entry)entry;
				System.out.println(en.getKey()+ " : " + en.getValue());
			}
		}

	}

}
