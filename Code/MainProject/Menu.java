package com.kh.menu;

import java.util.Scanner;
import com.kh.control.NetflixController;

public class Menu {
    private Scanner sc = new Scanner(System.in);
    private NetflixController nc = new NetflixController();

    // 메인 메뉴를 표시하고 사용자로부터 입력을 받아 각 기능을 실행하는 메소드
    public void mainMenu() {
        while (true) {
            System.out.println("★★ 넷플릭스 플레이리스트 메뉴 ★★");
            System.out.println("1. 회원 추가");
            System.out.println("2. 회원 삭제");
            System.out.println("3. 회원 검색");
            System.out.println("4. 플레이리스트 동영상 추가");
            System.out.println("5. 플레이리스트 동영상 삭제");
            System.out.println("6. 모든 회원과 플레이리스트 보기");
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

    // 회원 추가 기능
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

            System.out.println("회원을 추가 하시겠습니까? (y,n) : ");
            char choice = sc.next().charAt(0);
            sc.nextLine();
            if (choice == 'n' || choice == 'N') {
                nc.printMembers();
                return;
            } else if (choice == 'y' || choice == 'Y') {
                continue;
            } else {
                System.out.println("잘못 입력했습니다.");
            }
        }
    }

    // 회원 삭제 기능
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

            System.out.println("더 삭제하시겠습니까? (y,n) : ");
            char choice = sc.next().charAt(0);
            sc.nextLine();
            if (choice == 'n' || choice == 'N') {
                return;
            } else if (choice == 'y' || choice == 'Y') {
                continue;
            } else {
                System.out.println("잘못 입력했습니다.");
            }
        }
    }

    // 회원 검색 기능
    public void searchMember() {
        while (true) {
            System.out.println("====회원 검색 메뉴====");
            System.out.print("검색할 회원의 이름을 입력 : ");
            String name = sc.nextLine();
            nc.searchMember(name);

            System.out.println("더 검색하시겠습니까? (y,n) : ");
            char choice = sc.next().charAt(0);
            sc.nextLine();
            if (choice == 'n' || choice == 'N') {
                return;
            } else if (choice == 'y' || choice == 'Y') {
                continue;
            } else {
                System.out.println("잘못 입력했습니다.");
            }
        }
    }

    // 플레이리스트 동영상 추가 기능
    public void saveVideo() {
        while (true) {
            System.out.println("====동영상 추가 메뉴====");
            System.out.print("회원 이름을 입력 : ");
            String memberName = sc.nextLine();
            if (!nc.isExistMember(memberName)) {
                System.out.println("해당 이름의 회원이 없습니다. 메인 메뉴로 돌아갑니다.");
                return;
            }
            nc.printVideos();
            System.out.print("추가할 동영상 이름을 입력 : ");
            String videoName = sc.nextLine();
            if (nc.saveVideo(memberName, videoName)) {
                System.out.println("동영상이 플레이리스트에 추가되었습니다.");
            } else {
                System.out.println("동영상을 추가할 수 없습니다.");
            }

            System.out.println("더 추가하시겠습니까? (y,n) : ");
            char choice = sc.next().charAt(0);
            sc.nextLine();
            if (choice == 'n' || choice == 'N') {
                return;
            } else if (choice == 'y' || choice == 'Y') {
                continue;
            } else {
                System.out.println("잘못 입력했습니다.");
            }
        }
    }

    // 플레이리스트 동영상 삭제 기능
    public void deleteVideo() {
        while (true) {
            System.out.println("====동영상 삭제 메뉴====");
            System.out.print("회원 이름을 입력 : ");
            String memberName = sc.nextLine();
            if (!nc.isExistMember(memberName)) {
                System.out.println("해당 이름의 회원이 없습니다. 메인 메뉴로 돌아갑니다.");
                return;
            }
            System.out.print("삭제할 동영상 이름을 입력 : ");
            String videoName = sc.nextLine();
            if (nc.deleteVideo(memberName, videoName)) {
                System.out.println("동영상이 플레이리스트에서 삭제되었습니다.");
            } else {
                System.out.println("동영상을 삭제할 수 없습니다.");
            }

            System.out.println("더 삭제하시겠습니까? (y,n) : ");
            char choice = sc.next().charAt(0);
            sc.nextLine();
            if (choice == 'n' || choice == 'N') {
                return;
            } else if (choice == 'y' || choice == 'Y') {
                continue;
            } else {
                System.out.println("잘못 입력했습니다.");
            }
        }
    }

    // 모든 회원과 플레이리스트 보기 기능
    public void viewMemberPlaylist() {
            nc.viewMemberPlaylist();
        
    }
}
