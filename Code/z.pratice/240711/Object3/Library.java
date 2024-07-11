package test.t240711.object3;

import java.util.Scanner;

//사용자와의 소통
//입력을 받고 응답을 출력하는 것
//함수로 묶으면 가독성이 좋아지니 자주 사용하자

public class Library {
	private Scanner sc = new Scanner(System.in);
	private Book[] bArr = new Book[10]; 
	
	public void menu() {
		int menu = 0;
		
		while (menu != 9) {
			System.out.println("===========도서관리 프로그램===========");
			System.out.println("1. 도서등록");
			System.out.println("2. 도서목록 출력");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 삭제");
			System.out.println("9. 종료");
			System.out.print("메뉴 선택 : ");
			menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: //도서등록
				this.addBook();
				break;
			case 2: //도서목록
				this.printBook();
				break;
			case 3: //도서검색
				this.searchBook();
				break;
			case 4: //도서삭제
				this.printBook();
				this.deleteBook();
				break;
			case 9: //종료
				this.exit();
				break;
			default:
				System.out.println("잘못 입력했습니다.");
			}
		}
	}

	public void addBook() {
		String title, genre, name;
		int number;
		
		System.out.print("제목 :");
		title = sc.nextLine();
		
		System.out.print("장르 :");
		genre = sc.nextLine();
		
		System.out.print("저자 :");
		name = sc.nextLine();
		
		System.out.print("책번호 :");
		number = sc.nextInt();
						
		for(int i = 0; i < bArr.length; i++) {
			if(bArr[i] == null) {
				bArr[i] = new Book(title, genre, name, number);
				System.out.println("책을 등록하였습니다.");
				System.out.println(bArr[i].toString());
				break;
			}
			else if(i == bArr.length -1) {//마지막 인덱스까지 전부 확인한 후
				System.out.println("등록할 수 있는 책이 없습니다.");
				break;
			}
		}
	}
	
	public void printBook() {
		System.out.println("\n=============등록도서 목록=============");
		
		for(int i = 0; i<bArr.length; i++) {
			if(bArr[i] == null) {
				break;
			}
			System.out.println(bArr[i].toString());
		}
	}
	
	public void searchBook() {
		System.out.println("\n=============도서 검색=============");
		System.out.print("검색할 책 이름 입력 : ");
		String findtitle = sc.nextLine();
		
		//검색한 책~~~~
		//or 입력하신 제목의 책은 등록되어 있지 않습니다.
		
		for(int i = 0; i<bArr.length; i++) { //null을 발견하면 뒤에 데이터는 null이므로 반복종료
			
			if(bArr[i] == null) {
				System.out.println("업습니다.");
				break;
			}
			
			else if(bArr[i] != null && findtitle.equals(bArr[i].getTitle())){
				System.out.println(bArr[i].toString());
				break;
			}
		}
		
	}
	
	public void deleteBook() {
		System.out.println("삭제할 도서의 번호 입력 :");
		int num = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i<bArr.length; i++) {
			if(bArr[i] == null) {
				System.out.println("삭제할 값을 찾지 못했습니다.");
				break;
			}
			else if(num == bArr[i].getNumber()){
				System.out.println("삭제 데이터 : "+ bArr[i].toString());
				//삭제할 위치부터 마지막위치까지 모든 값을 한칸씩 앞으로 당김
				
				for(int j = i; j < bArr.length-1; j++) {//인덱스를 하나씩 당기기 때문에 마지막 인덱스는 
					bArr[j] = bArr[j+1];
				}
				//마지막 값에 null대입
				bArr[bArr.length-1] = null;
				break;
				
			}
		}	
	}
	
	public void exit() {
		System.out.println("프로그램을 종료합니다.");
		return;
	}
}
