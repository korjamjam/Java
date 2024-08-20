package com.kh.menu;

import java.util.Scanner;

import com.kh.control.NetflixController;
import com.kh.control.MemberController;
import com.kh.control.LoginController;

public class NeflixMenu {
	Scanner sc = new Scanner(System.in);
	NetflixController nc = new NetflixController();
	MemberController mc = new MemberController();
	LoginController lc = new LoginController(mc);

	/*메인 메뉴*/
	public void mainMenu() {
		while (true) {
			System.out.println("★★ 넷플릭스 플레이리스트 메뉴 ★★");
			System.out.println("1. 회원 가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 검색");
			System.out.println("4. 회원 탈퇴");
			System.out.println("5. 등록된 모든 회원 보기");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 선택 : ");

			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				this.addMember();
				break;
			case 2:
				lc.login();
				if (lc.isAdmin()) {
					adminMenu();
				} else if (lc.isLoggedIn()) {
					userMenu();
				}
				break;
			case 3:
				this.searchMember();
				break;

			case 4:
				this.deleteMember();
				break;

			case 5:
				this.viewAllMember();
				break;
				
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
				
			default:
				System.out.println("=================잘못 입력했습니다.=================");
				break;
			}
		}
	}

	/*관리자 메뉴*/
	public void adminMenu() {
		while (true) {
			System.out.println("★★ 관리자 메뉴 ★★");
			System.out.println("1. 동영상 추가");
			System.out.println("2. 동영상 삭제");
			System.out.println("3. 등록된 동영상 보기");
			System.out.println("0. 로그아웃");
			System.out.print("메뉴 선택 : ");

			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				this.addVideo();
				break;
				
			case 2:
				this.removeVideo();
				break;
				
			case 3:
				this.viewAllVideos();
				break;
				
			case 0:
				lc.logout();
				return;
				
			default:
				System.out.println("=================잘못 입력했습니다.=================");
				break;
			}
		}
	}

	/*일반 회원 메뉴*/
	public void userMenu() {
		while (true) {
			System.out.println("★★ 일반 회원 메뉴 ★★");
			System.out.println("1. 동영상 추가");
			System.out.println("2. 동영상 삭제");
			System.out.println("3. 모든 회원의 플레이리스트");
			System.out.println("4. 등록된 동영상 보기");
			System.out.println("0. 로그아웃");
			System.out.print("메뉴 선택 : ");

			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				this.saveMemberPlaylistVideo();
				break;
				
			case 2:
				this.deleteMemberPlaylistVideo();
				break;
				
			case 3:
				mc.viewAllMemberVideo();
				break;
			case 4:
				this.viewAllVideos();
				break;
				
			case 0:
				lc.logout();
				return;
				
			default:
				System.out.println("=================잘못 입력했습니다.=================");
				break;
			}
		}
	}

	/*회원 추가*/
	public void addMember() {
		System.out.println("==================회원 추가 메뉴==================");
		while (true) {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			System.out.print("아이디 : ");
			String userId = sc.nextLine();
			
			System.out.print("비밀번호 : ");
			String userPwd = sc.nextLine();
			
			while (true) {
				System.out.print("이메일 (@와 .com을 포함) : ");
				String email = sc.nextLine();
				
				if (email.contains("@") && email.contains(".com")) {
					System.out.print("나이 : ");
					int age = sc.nextInt();
					sc.nextLine();
					
					mc.addMember(userId, userPwd, name, email, age);
					break;
				} else {
					System.out.println("이메일 양식을 맞춰서 입력해주세요.");
				}
			}
			
			while (true) {
				System.out.print("회원을 더 추가 하시겠습니까? (y,n) : ");
				char choice = sc.next().charAt(0);
				sc.nextLine();
				
				if (choice == 'n' || choice == 'N') {
					this.viewAllMember();
					return;
				} else if (choice == 'y' || choice == 'Y') {
					break;
				} else {
					System.out.println("잘못 입력하셨습니다.");
				}
			}
			 System.out.println("---------------------------------------------------------");
		}
	}

	/*회원 삭제*/
	public void deleteMember() {
		System.out.println("==================회원 탈퇴 메뉴==================");
		System.out.print("삭제할 회원의 이름 : ");
		String name = sc.nextLine();
		
		System.out.print("삭제할 회원의 아이디 : ");
		String userId = sc.nextLine();

		
		if (mc.deleteMember(name, userId)) {
			System.out.println("회원이 성공적으로 삭제되었습니다.");
		} else {
			System.out.println("존재하지 않는 회원입니다.");
		}
	}

	/*회원 검색(단일)*/
	public void searchMember() {
		System.out.println("==================회원 검색 메뉴==================");
		System.out.print("검색할 회원의 이름 : ");
		String name = sc.nextLine();
		
		System.out.print("검색할 회원의 아이디 : ");
		String userId = sc.nextLine();

		if (!mc.searchMember(name, userId)) {
			System.out.println("존재하지 않는 회원입니다.");
		}
	}

	/*회원정보'만' 보기*/
	public void viewAllMember() {
		System.out.println("==================회원 목록 보기==================");
		mc.AllMembers();
		System.out.println("==============================================");
	}

	/*관리자 계정으로 동영상 추가*/
	public void addVideo() {
		System.out.println("==================동영상 추가 메뉴==================");
		this.viewAllVideos();
		
			System.out.print("추가할 동영상 제목 : ");
			String title = sc.nextLine();

			System.out.print("추가할 동영상 장르 : ");
			String genre = sc.nextLine();
			
			System.out.print("추가할 동영상 나이 제한 : ");
			int ageLimit = sc.nextInt();
			sc.nextLine();
			
			nc.addVideo(title, genre, ageLimit);
		}

	/*관리자 계정으로 동영상 삭제*/
	public void removeVideo() {
		System.out.println("==================동영상 삭제 메뉴==================");
		this.viewAllVideos();
		
		System.out.print("삭제할 동영상 제목 : ");
		String title = sc.nextLine();

		nc.removeVideo(title);
	}

	/*일반 회원 계정으로 회원의 플레이리스트에 동영상 추가*/
	public void saveMemberPlaylistVideo() {
		System.out.println("==================동영상 추가 메뉴==================");
		this.viewAllVideos();
		
		System.out.print("동영상을 추가할 회원의 이름 : ");
		String name = sc.nextLine();
		
		System.out.print("동영상을 추가할 회원의 아이디 : ");
		String userId = sc.nextLine();
		
		System.out.print("추가할 동영상 제목 : ");
		String title = sc.nextLine();

		if (nc.saveVideo(mc, name, userId, title)) {
			System.out.println("동영상이 성공적으로 추가되었습니다.\n");
		}
	}

	/*일반 회원 계정으로 각 회원의 플레이리스트의 동영상 삭제*/
	public void deleteMemberPlaylistVideo() {
		System.out.println("==================동영상 삭제 메뉴==================");
		System.out.print("동영상을 삭제할 회원의 이름 : ");
		String name = sc.nextLine();

		System.out.print("동영상을 삭제할 회원의 아이디 : ");
		String userId = sc.nextLine();
		mc.viewMemberPlaylist(name, userId);
		

		System.out.print("삭제할 동영상 제목 : ");
		String title = sc.nextLine();

		if (nc.deleteVideo(mc, name, userId, title)) {
			System.out.println("동영상이 성공적으로 삭제되었습니다.\n");
		}
	}
	
	/*등록된 동영상 목록*/
	public void viewAllVideos() {
		System.out.println("===================동영상 목록===================");
		nc.printAllVideos();
		System.out.println("==============================================");
	}
}
