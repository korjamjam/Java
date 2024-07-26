package com.kh.menu;

import java.util.Scanner;

import com.kh.control.NetflixController;

public class Menu {
	Scanner sc = new Scanner(System.in);
	NetflixController nc = new NetflixController();
	
	public void mainMenu() {
		while (true) {
			System.out.println("★★ 넷플릭스 플레이리스트 메뉴 ★★");
			System.out.println("1. 회원 추가");
//			System.out.println("2. 회원 삭제");
//			System.out.println("3. 회원 검색");
//			System.out.println("4. 플레이리스트 동영상 추가");
//			System.out.println("5. 플레이리스트 동영상 삭제");
//			System.out.println("6. 모든 플레이리스트 보기");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 선택 : ");

			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				this.addMember(); break;
//			case 2:
//				this.deleteMember(); break;
//			case 3:
//				this.searchMember(); break;
//			case 4:
//				this.saveVideo(); break;
//			case 5:
//				this.deleteVideo(); break;
//			case 6:
//				this.viewMemberPlaylist(); break;
			case 9:
				System.out.println("프로그램을 종료합니다."); return;
			default:
				System.out.println("==============");
				System.out.println("잘못 입력했습니다.");
				System.out.println("==============");
				break;
			}

		}

	}
	
	public void addMember() {
		while (true) {

			System.out.println("====회원 추가 메뉴====");
			System.out.print("이름 : ");
			String name = sc.nextLine();

			while (true) {
				System.out.print("이메일 (@와 .com을 포함) : ");
				String email = sc.nextLine();
				if (email.contains("@") && email.contains(".com")) {
					System.out.print("나이 : ");
					int age = sc.nextInt(); sc.nextLine();
					nc.addMember(name, email, age);
					break;
				} else {
					System.out.println("이메일 양식을 맞춰서 입력해주세요.");
				}
			}

			System.out.println("회원을 추가 하시겠습니까? (y,n) : ");
			char choice = sc.next().charAt(0);
			if (choice == 'y' || choice == 'Y') {
				System.out.println();
				return;
			} else if (choice == 'n' || choice == 'N') {
				break;
				
			}
			
		}
		
	}
	
	public void deleteMember() {
		System.out.println("====회원 삭제 메뉴====");
		System.out.println("삭제할 회원의 이름을 입력 : ");
		String name = sc.nextLine();

	}
	
	//회원 검색을 하면 회원 정보와 그 회원의 플레이리스트 공개
	public void searchMember() {
		
		
	}
	
	//처음에 Video배열에 저장된 모든 동영상을 보여줌.
	//회원 이름으로 회원의 플레이리스트에 원하는 동영상 저장
	public void saveVideo() {
		
	}
	
	public void deleteVideo() {
		
	}
	
	public void viewMemberPlaylist() {
		
	}
	
	

}
