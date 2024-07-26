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
		
		//이름과 이메일(단,@와 .com을 포함 해야함), 나이를 입력후 배열에 값을 넣음
		//회원이 다 차면 회원을 등록할 수 없게 만듦.
		//회원을 더 추가할 거라고 물어본 뒤, 'y','Y'면 반복문을 돌아서 처음 회원 추가 메뉴로 돌아가고 , 
		//'n','N'이면 등록한 회원들을 보여주고 반복문 이탈 후 mainMenu로 이동
		//그외의 글자를 입력시 '잘못 입력했습니다' 출력후 처음 회원 추가 메뉴로 돌아가기.
		
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
			sc.nextLine();
			if (choice == 'n' || choice == 'N') {
				System.out.println(nc.toString());
				return;
			} else if (choice == 'y' || choice == 'Y') {
				
			}
			
		}
		
	}
	
	//회원 이름과 이메일을 검색 후 배열에서 삭제
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
	
	//회원 이름을 검색후 회원의 플레이리스트를 보여줌
	//삭제할 동영상 이름을 작성 후 같은 이름의 동영상을 플레이리스트에서 삭제
	public void deleteVideo() {
		
	}
	
	//등록된 모든 회원과 그 회원의 플레이리스트를 보여줌.
	public void viewMemberPlaylist() {
		
	}
}
