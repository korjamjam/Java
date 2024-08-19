package com.kh.menu;

import java.util.Scanner;

import com.kh.control.NetflixController;
import com.kh.control.MemberController;

public class Menu {
    Scanner sc = new Scanner(System.in);
    NetflixController nc = new NetflixController();
    MemberController mc = new MemberController();

    //로그인 기능을 추가하고 관리자 계정과 
    //관리자 계정은 NetflixController에 저장된 video들을
    //삭제하거나 새로운 video를 저장할 수 있다.
    
    /*
	<메인메뉴 보기>
    넷플릭스를 들어 갔을 때 사용가능한 기능을 보여줌
    <회원 관련>
    회원추가, 회원삭제, 회원검색, 모든 회원 보기
    <플레이리스트 관련>
    동영상 추가, 동영상 삭제, 모든 플레이리스트 보기
    <프로그램 종료>
    */
    public void mainMenu() {
        while (true) {
            System.out.println("★★ 넷플릭스 플레이리스트 메뉴 ★★");
            System.out.println("1. 회원 추가");
            System.out.println("2. 회원 삭제");
            System.out.println("3. 회원 검색");
            System.out.println("4. 등록된 회원 보기");
            System.out.println("5. 플레이리스트 동영상 추가");
            System.out.println("6. 플레이리스트 동영상 삭제");
            System.out.println("7. 모든 플레이리스트 보기");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 선택 : ");

            int choice = sc.nextInt();
            sc.nextLine();

            //입력받은 choice를 switch를 이용해 메서드와 연결
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
                	this.viewAllMember();
                	break;
                case 5:
                    this.saveVideo();
                    break;
                case 6:
                    this.deleteVideo();
                    break;
                case 7:
                    this.viewMemberPlaylist();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                	System.out.println("=================잘못 입력했습니다.=================");
                    break;
            }
        }
    }

    /*
    <회원 추가 메뉴>
     - 이름, 이메일, 나이를 입력하여 회원을 추가
     - 이름, 이메일은 String, 나이는 int타입으로 값을 받음
     - Controller클래스에 메서드를 만들고 그 메서드에서 회원을 추가하는 기능을 수행
     - 메서드에서 기능을 수행하고 반환한 값을 이용해 반복분을 다시 하거나 탈출
     <추가 기능>
     - 회원을 더 추가하는 질문을 넣음
     - 입력받는 값의 타입은 char로 하고 n,N을 입력받으면 추가x, y,Y를 입력받으면 추가o
     */
    public void addMember() {
        while (true) {
            System.out.println("==================회원 추가 메뉴==================");
            System.out.print("이름 : ");
            String name = sc.nextLine();

            while (true) {
                System.out.print("이메일 (@와 .com을 포함) : ");
                String email = sc.nextLine();
                if (email.contains("@") && email.contains(".com")) {
                    System.out.print("나이 : ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    mc.addMember(name, email, age);
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
                    mc.printMembers();
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
    
    /*
    <회원 삭제 메뉴>
    - 이름을 이용해 회원 찾기 (이름은 입력값으로)
    - 단, 등록된 회원이 아니라면 다시 구문 출력 후 다시 반복문 수행
    - Controller클래스에 메서드를 만들고 그 메서드에서 회원을 추가하는 기능을 수행
    - 메서드에서 기능을 수행하고 반환한 값을 이용해 반복분을 다시 하거나 탈출
    <추가 기능>
    - 회원을 더 삭제하는 질문을 넣음
    - 입력받는 값의 타입은 char로 하고 n,N을 입력받으면 추가x, y,Y를 입력받으면 추가o
    */
    public void deleteMember() {
        while (true) {
            System.out.println("==================회원 삭제 메뉴==================");
            System.out.print("삭제할 회원의 이름을 입력 : ");
            String name = sc.nextLine();

            if (mc.deleteMember(name)) {
                System.out.println("회원이 성공적으로 삭제되었습니다.");
            } else {
                System.out.println("해당 이름의 회원이 없습니다.");
            }

            while (true) {
                System.out.print("회원을 더 삭제 하시겠습니까? (y,n) : ");
                char choice = sc.next().charAt(0);
                sc.nextLine();
                if (choice == 'n' || choice == 'N') {
                	 System.out.println("==============================================");
                     mc.printMembers();
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
    
    /*
    <회원 검색 메뉴>
    - 이름을 이용해 회원 찾기 (이름은 입력값으로)
    - 단, 등록된 회원이 아니라면 다시 구문 출력 후 다시 반복문 수행
    - Controller클래스에 메서드를 만들고 그 메서드에서 회원을 추가하는 기능을 수행
    - 메서드에서 기능을 수행하고 반환한 값을 이용해 반복분을 다시 하거나 탈출
    <추가 기능>
    - 회원을 더 검색하는 질문을 넣음
    - 입력받는 값의 타입은 char로 하고 n,N을 입력받으면 추가x, y,Y를 입력받으면 추가o
    */
    public void searchMember() {
        while (true) {
            System.out.println("==================회원 검색 메뉴==================");
            System.out.print("검색할 회원의 이름 입력 : ");
            String name = sc.nextLine();

            if (!mc.searchMember(name)) {
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
   
    /*
    <모든 회원 보기>
    Controller클래스에서 모든 회원을 보여주는 기능 가진 메소드 호출
    */
    public void viewAllMember() {
        System.out.println("=================등록된 회원 보기=================");
        mc.printMembers();
        System.out.println("=============================================");
    }

    /*
    <회원의 플레이리스트에 동영상 추가 메뉴>
    - 미리 저장된 동영상 목록 보여주기
    - 이름을 이용해 회원 찾기 (이름은 입력값으로)
    - 단, 등록된 회원이 아니라면 다시 구문 출력 후 다시 반복문 수행
    - Controller클래스에 메서드를 만들고 그 메서드에서 입력받은 회원에 동영상을 추가하는 기능을 수행
    - 메서드에서 기능을 수행하고 반환한 값을 이용해 반복분을 다시 하거나 탈출
    <추가 기능>
    - 동영상을 추가할 때 동영상이름이 다르면 추가하지 못하게 만듦
    */
    public void saveVideo() {
        System.out.println("===================동영상 목록===================");
        nc.printAllVideos();
        System.out.println("==============================================");
        while (true) {
            System.out.print("회원의 이름 입력: ");
            String name = sc.nextLine();
            if (!mc.searchMember(name)) {
                System.out.println("해당 회원이 존재하지 않습니다.");
            } else {
                System.out.print("추가할 동영상 제목 입력: ");
                String videoTitle = sc.nextLine();

                if (nc.saveVideo(mc, name, videoTitle)) {
                    System.out.println("☆동영상이 성공적으로 추가되었습니다.☆");
                    break;
                } else {
                    System.out.println("동영상을 추가하지 못했습니다.");
                    System.out.println("메인화면으로 돌아갑니다.");
                    break;
                }
            }
        }
    }

    /*
    <회원의 플레이리스트에 있는 동영상 삭제 메뉴>
    - 미리 저장된 동영상 목록 보여주기
    - 이름을 이용해 회원 찾기 (이름은 입력값으로)
    - 단, 등록된 회원이 아니라면 다시 구문 출력 후 다시 반복문 수행
    - Controller클래스에 메서드를 만들고 그 메서드에서 회원에게 저장된 동영상을 삭제하는 기능을 수행
    - 메서드에서 기능을 수행하고 반환한 값을 이용해 반복분을 다시 하거나 탈출
    <추가 기능>
    - 동영상을 추가할 때 동영상이름이 다르면 추가하지 못하게 만듦
    */
    public void deleteVideo() {
        System.out.println("=================동영상 삭제 메뉴=================");
        System.out.print("회원의 이름 입력: ");
        String name = sc.nextLine();

        if (mc.searchMember(name)) {
            System.out.print("삭제할 동영상 제목 입력: ");
            String videoTitle = sc.nextLine();

            if (nc.deleteVideo(mc, name, videoTitle)) {
                System.out.println("동영상이 성공적으로 삭제되었습니다.");
            } else {
                System.out.println("동영상을 삭제하지 못했습니다.");
            }
        } else {
            System.out.println("해당 회원이 존재하지 않습니다.");
        }
    }

    /*
    <모든 플레이리스트 보기 메뉴>
    - 모든 회원의 플레이리스트 목록 보여주기
    */
    public void viewMemberPlaylist() {
        System.out.println("==========등록된 모든 회원의 플레이리스트 보기==========");
        mc.viewMemberPlaylist();
        System.out.println("=============================================");
    }
   
}
