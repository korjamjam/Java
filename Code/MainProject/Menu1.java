package com.kh.menu;

import java.util.Scanner;

//import com.kh.control.MemberController;
import com.kh.control.NetflixController;

public class Menu {
    Scanner sc = new Scanner(System.in);
    NetflixController nc = new NetflixController();
//  MemberController mc = new MemberController();

    public void mainMenu() {
        while (true) {
            System.out.println("★★ 넷플릭스 플레이리스트 메뉴 ★★");
            System.out.println("1. 회원 추가");
            System.out.println("2. 회원 삭제");
            System.out.println("3. 회원 검색");
            System.out.println("4. 플레이리스트 동영상 추가");
            System.out.println("5. 플레이리스트 동영상 삭제");
            System.out.println("6. 모든 플레이리스트 보기");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 선택 : ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    this.addMember();
                    break;
                case 2:
                    this.deleteMember();
                    break;
                case 3:
                    this.searchMember();
                    break;
                case 4:
                    this.saveVideo();
                    break;
                case 5:
                    this.deleteVideo();
                    break;
                case 6:
                    this.viewMemberPlaylist();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
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
                    int age = sc.nextInt();
                    sc.nextLine();
                    nc.addMember(name, email, age);
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
                	System.out.println("==============================================");
                    nc.printMember();
                    System.out.println("==============================================");
                    return;
                } else if (choice == 'y' || choice == 'Y') {
                    break;
                } else {
                    System.out.println("잘못 입력했습니다");
                }
            }
        }
    }

    public void deleteMember() {
        while (true) {
            System.out.println("====회원 삭제 메뉴====");
            System.out.print("삭제할 회원의 이름을 입력 : ");
            String name = sc.nextLine();

            if (nc.deleteMember(name)) {
                System.out.println("회원이 성공적으로 삭제되었습니다.");
            } else {
                System.out.println("해당 이름의 회원이 없습니다.");
            }

            while (true) {
                System.out.print("회원을 더 삭제 하시겠습니까? (y,n) : ");
                char choice = sc.next().charAt(0);
                sc.nextLine();
                if (choice == 'n' || choice == 'N') {
                    nc.printMember();
                    return;
                } else if (choice == 'y' || choice == 'Y') {
                    break;
                } else {
                    System.out.println("잘못 입력했습니다");
                }
            }
        }
    }

    public void searchMember() {
        while (true) {
            System.out.println("====회원 검색 메뉴====");
            System.out.print("검색할 회원의 이름 입력 : ");
            String name = sc.nextLine();

            if (!nc.searchMember(name)) {
                System.out.println("해당 이름의 회원이 없습니다.");
            }

            while (true) {
                System.out.print("회원을 더 검색 하시겠습니까? (y,n) : ");
                char choice = sc.next().charAt(0);
                sc.nextLine();
                if (choice == 'n' || choice == 'N') {
                    return;
                } else if (choice == 'y' || choice == 'Y') {
                    break;
                } else {
                    System.out.println("잘못 입력했습니다");
                }
            }
        }
    }

    public void saveVideo() {
		System.out.println("===================동영상 목록===================");
		nc.printAllVideos();
		System.out.println("==============================================");
		while (true) {
			System.out.print("회원의 이름 입력: ");
			String name = sc.nextLine();
			if (!nc.searchMember(name)) {
				System.out.println("해당 회원이 존재하지 않습니다.");
			} else {
				System.out.print("추가할 동영상 제목 입력: ");
				String videoTitle = sc.nextLine();

				if (nc.saveVideo(name, videoTitle)) {
					System.out.println("동영상이 성공적으로 추가되었습니다.");
					break;
				} else {
					System.out.println("동영상을 추가하지 못했습니다.");
					System.out.println("메인화면으로 돌아갑니다.");
					break;
				}

			}
		}
	}

    public void deleteVideo() {
        System.out.println("====동영상 삭제 메뉴====");

        System.out.print("회원의 이름 입력: ");
        String name = sc.nextLine();

        if (nc.printMemberPlaylist(name)) {
            System.out.print("삭제할 동영상 제목 입력: ");
            String videoTitle = sc.nextLine();

            if (nc.deleteVideo(name, videoTitle)) {
                System.out.println("동영상이 성공적으로 삭제되었습니다.");
            } else {
                System.out.println("동영상을 삭제하지 못했습니다.");
            }
        } else {
            System.out.println("해당 회원이 없거나 플레이리스트가 비어 있습니다.");
        }
    }

    public void viewMemberPlaylist() {
    	System.out.println("=============모든 회원의 플레이리스트 보기=============");
        nc.viewAllMemberPlaylists();
    }
}
