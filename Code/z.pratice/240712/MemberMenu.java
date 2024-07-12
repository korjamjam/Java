package test.t240712.object1;

import java.util.Scanner;

public class MemberMenu {

	Scanner sc = new Scanner(System.in);
	
	private MemberController mc = new MemberController();
	
	//기본생성자
	public MemberMenu() {
	}
	
	//메인 메뉴 출력 메소드 
	public void mainMenu() {
		int menu = 0;
		while(menu != 9) {
			System.out.println("최대 등록 가능한 회원 수는"+ mc.SIZE +"명 입니다.");
			System.out.println("현재 등록된 회원 수는 "+ mc.existMemberNum() +"명 입니다.");
			
			// MemberController(mc)클래스 안에 있는 멤버필드를 이용하여
			// 최대 등록 가능한 회원 수가 몇 명인지 출력
			// 또한 현재 등록된 회원 수는 mc에 existMemberNum()의 반환 값으로
			// 몇 명이 등록되어 있는지 출력
			// 현재 등록된 회원 수에 따라 메인 메뉴를 다르게 출력
			// 현재 등록된 회원 수가 10명이 아닐 때

			if (mc.existMemberNum() != mc.SIZE) {
				System.out.println("1. 새 회원 등록");
			}
			else {
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
			}
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				this.insertMember();
				break;
			case 2:
				this.searchMember();
				break;
			case 3:
				this.updateMember();
				break;
			case 4:
				this.deleteMember();
				break;
			case 5:
				this.printAll();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못 입력했습니다.");
			}
			}
			
		}
	//회원등록하기 위한 데이터를사용자에게 입력 받는 메소드
	public void insertMember() {
		
		// 회원 등록에 필요한 아이디, 이름, 비밀번호, 이메일, 성별, 나이를
		// 사용자에게 직접 입력 받되 아이디의 경우 기존 회원의 아이디와
		// 중복되지 않도록 mc의 checkId()메소드를 통해서 중복 검사를 함
		// 중복 검사를 한 결과 값에 따라 중복 값이 없으면 다음으로 넘어가고
		// 있으면 “중복된 아이디입니다. 다시 입력해주세요.”라는 문구를 출력 후
		// 다시 아이디를 받도록 함
		// 성별의 경우 M이나 m, F나 f가 아니면 “성별을 다시 입력하세요.”를
		// 출력 후 다시 성별을 입력하도록 함
		// 아이디부터 나이까지 모든 데이터를 받았으면
		// mc의 insertMember메소드의 매개변수로 넘김
		
		String id;
		String pwd;
		String name;
		String email;
		String gender;
		int age;
		
		System.out.println("새 회원을 등록합니다.");	
		sc.nextLine();
		
		while(true) {
		System.out.print("아이디 :");
		id = sc.nextLine();
		if(mc.checkId(id) == true) { // 사용가능
			break;
		}
		else { //사용불가
			System.out.println("중복된 아이디입니다. 다시 입력해주세요");
			}
		}
		System.out.print("이름 :");
		name = sc.nextLine();
		
		System.out.print("비밀번호 :");
		pwd = sc.nextLine();
		
		System.out.print("이메일 :");
		email = sc.nextLine();
		
		while(true) {
			System.out.print("성별(M/F) :");
			gender = sc.next();
			if(gender.equals("M") || gender.equals("m")|| gender.equals("F") || gender.equals("f")) { // 사용가능
				break;
			}
			else { //사용불가
				System.out.println("성별을 다시 입력해주세요");
				}
			}

		System.out.print("나이 :");
		age = sc.nextInt();
		
		mc.insertMember(id, name, pwd, email, gender, age);
		return;
	}
	
	//검색 메뉴 출력 메소드
	//아이디 검색을 위한 데이터를 사용자에게 입력 받는 메소드
	//이름 검색을 위한 데이터를 사용자에게 입력 받는 메소드
	//이메일 검색을 위한 데이터를 사용자에게 입력 받는 메소드
	public void searchMember() {
		
		// 메뉴 번호에 따라 각 메소드로 이동되며 9번을 입력했을 경우
		// “메인으로 돌아갑니다.” 출력 후 mainMenu()로 돌아감
		// 메뉴 번호를 잘못 입력했을 경우 “잘못 입력하셨습니다.” 출력 후
		// mainMenu()로 돌아감

		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		
		int menu = sc.nextInt();
		sc.nextLine();
		
		switch(menu) {
		case 1:
			this.searchId();
			break;
		case 2:
			this.searchName();
			break;
		case 3:
			this.searchEmail();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다");
			//this.mainMenu(); //실행은되지만 기존에 실행했던 mainmenu는 끝나지 않아서 메모리를 잡아먹음. 
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
	}	
	public void searchId() {
		// 검색할 아이디를 사용자에게 입력 받고 입력 받은 데이터를
		// mc의 searchId() 메소드의 매개변수로 넘김, 반환 값에 따라
		// 검색 결과 없으면 “검색 결과가 없습니다.” 출력 후 mainMenu()로 돌아감
		// 검색 결과가 있으면 “찾으신 회원 조회 결과입니다.” 출력 후
		// 회원 검색 결과 출력
		
		String id;
		System.out.print("검색할 아이디 : ");
		id = sc.nextLine();
		
		if(mc.searchId(id) == null) {
			System.out.println("검색 결과가 없습니다");
		}else {
			System.out.println(mc.searchId(id));
		}
	}	
	public void searchName() {
		String name;
		System.out.print("검색할 이름 : ");
		name = sc.nextLine();
		
		Member[] mArr = mc.searchName(name);
		if(mArr[0] == null) {
			System.out.println("검색 결과가 없습니다");
		}else {
			for(int i=0; i<mArr.length; i++) {
				if(mArr[i] == null) {
					break;
				}
				String info = mArr[i].inform();
				System.out.println(info);
			}
			
		}
	}	
	public void searchEmail() {
		String email;
		System.out.print("검색할 이메일 : ");
		email = sc.nextLine();
		
		Member[] mArr = mc.searchEmail(email);
		if(mArr[0] == null) {
			System.out.println("검색 결과가 없습니다");
		}else {
			for(int i=0; i<mArr.length; i++) {
				if(mArr[i] == null) {
					break;
				}
				String info = mArr[i].inform();
				System.out.println(info);
			}
			
		}
	
	}

	//수정 메뉴 출력 메소드
	//비밀번호 수정을 위한 데이터를 사용자에게 입력 받는 메소드
	//이름 수정을 위한 데이터를 사용자에게 입력 받는 메소드
	//이메일 수정을 위한 데이터를 사용자에게 입력 받는 메소드
	public void updateMember() {
		
		int menu;
		
		System.out.println("1. 비밀번호 수정하기");
		System.out.println("2. 이름 수정하기");
		System.out.println("3. 이메일 수정하기");
		System.out.println("9. 메인으로 돌아기기");
		System.out.println("메뉴 번호 : ");
		menu = sc.nextInt();
		sc.nextLine();
		
		switch(menu) {
		case 1:
			this.updatePassword();
			break;
			
		case 2:
			this.updateName();
			break;
			
		case 3:
			this.updateEmail();
			break;
			
		case 9:
			System.out.println("메인으로 돌아갑니다");
			//this.mainMenu(); //실행은되지만 기존에 실행했던 mainmenu는 끝나지 않아서 메모리를 잡아먹음. 
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
		// 메뉴 번호에 따라 각 메소드로 이동되며 9번을 입력했을 경우
		// “메인으로 돌아갑니다.” 출력 후 mainMenu()로 돌아감
		// 메뉴 번호를 잘못 입력했을 경우 “잘못 입력하셨습니다.” 출력 후
		// mainMenu()로 돌아감

	
	}
	public void updatePassword() {
		
		// 수정할 회원 id와 비밀번호를 사용자에게 입력 받고 입력 받은 데이터를
		// mc의 updatePassword() 메소드의 매개변수로 넘김, 반환 값에 따라
		// 검색결과 없으면 “존재하지 않는 아이디입니다.” 출력, mainMenu()로 감
		// 검색 결과가 있으면 “수정이 성공적으로 되었습니다.” 출력 후
		// mainMenu()로 돌아감	
		String id, pwd;
	
		System.out.print("수정할 회원의 아이디 : ");
		id = sc.nextLine();
		
		System.out.print("수정할 비밀번호");
		pwd = sc.nextLine();
		
		if(mc.updatePassword(id, pwd)) {
			System.out.println("수정이 성공적으로 되었습니다.");
		}
		else {
			System.out.println("존재하지 않는 아이디 입니다.");
		}
	}	
	public void updateName() {
		String id, name;
		
		System.out.print("수정할 회원의 아이디 : ");
		id = sc.nextLine();
		
		System.out.print("수정할 이름 :");
		name= sc.nextLine();
		
		if(mc.updateName(id, name)) {
			System.out.println("수정이 성공적으로 되었습니다.");
		}
		else {
			System.out.println("존재하지 않는 아이디 입니다.");
		}
		
	}
	
	public void updateEmail() {
	String id, email;
		
		System.out.print("수정할 회원의 아이디 : ");
		id = sc.nextLine();
		
		System.out.print("수정할 이름 :");
		email= sc.nextLine();
		
		if(mc.updateEmail(id, email)) {
			System.out.println("수정이 성공적으로 되었습니다.");
		}
		else {
			System.out.println("존재하지 않는 아이디 입니다.");
		}
		
	}

	//삭제 메뉴 출력 메소드
	//하나의 회원 삭제 결과를 출력하는 메소드
	//전체 회원 삭제 결과를 출력하는 메소드
	public void deleteMember() {

		int menu;

		System.out.println("1. 특정 회원 삭제하기");
		System.out.println("2. 모든 회원 삭제하기");
		System.out.println("9. 메인으로 돌아기기");
		System.out.println("메뉴 번호 : ");
		menu = sc.nextInt();
		sc.nextLine();

		switch (menu) {
		case 1:
			this.deleteOne();
			break;

		case 2:
			this.deleteAll();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다");
			// this.mainMenu(); //실행은되지만 기존에 실행했던 mainmenu는 끝나지 않아서 메모리를 잡아먹음.
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
		// 메뉴 번호에 따라 각 메소드로 이동되며 9번을 입력했을 경우
		// “메인으로 돌아갑니다.” 출력 후 mainMenu()로 돌아감
		// 메뉴 번호를 잘못 입력했을 경우 “잘못 입력하셨습니다.” 출력 후
		// mainMenu()로 돌아감
		
	}
	public void deleteOne() {
		
		System.out.print("삭제할 회원 ID :");
		String id = sc.nextLine();
		
		System.out.print("정말 삭제하시겠습니까?(y/n) : ");
		char result = sc.next().charAt(0);
		if(result == 'y' || result == 'Y') {
			mc.delete(id);
			System.out.println("성곡적으로 삭제하였습니다.");
		}
		else {
			System.out.println("존재하지 않는 아이디 입니다.");
		}
	}
	public void deleteAll() {
		System.out.print("정말 삭제하시겠습니까? : ");
		char result = sc.next().charAt(0);
		if(result == 'y' || result == 'Y') {
			mc.deleteAll();
			System.out.println("성곡적으로 삭제하였습니다.");
		}
	}

	//전체 회원을 출력하는 메소드
	public void printAll() {
		// mc의 printAll() 메소드의 반환 값을 가지고 저장된 회원을 출력하는데
		// 저장된 회원의 수가 0명이면 “저장된 회원이 없습니다.” 출력,
		// 0명이 아니면 저장된 모든 회원의 정보 출력
		if(mc.existMemberNum() == 0) {
			System.out.println("저장된 회원이 없습니다.");
		}
		else {
			Member[] mArr = mc.printAll();
			for(int i = 0; i<mArr.length; i++) {
				if(mArr[i] == null ) {
					break;
				}
				String info = mArr[i].inform();
				System.out.println(info);				
			}
		}
	}
}
