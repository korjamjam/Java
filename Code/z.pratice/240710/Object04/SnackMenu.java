package solopractice.object.practice4;

import java.util.Scanner;

public class SnackMenu {
	//사용자가 Snack 객체에 데이터를 저장할 수 있도록 값을 받음
	private Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();
	
	//변수 설정
	private String kind;
	private String name;
	private String flavor;
	private int numOf;
	private int price;
	
	//데이터 입력
	public void menu() {
		System.out.println("실행되는지 테스트");
		
		System.out.print("종류 :");
		this.kind = sc.next();
		
		System.out.print("이름 :");
		this.name = sc.next();

		System.out.print("맛 :");
		this.flavor = sc.next();
		
		System.out.print("개수 :");
		this.numOf = sc.nextInt();
		
		System.out.print("가격 :");
		this.price = sc.nextInt();
		
		
		//입력받은 데이터 값 Snack객체(SnackController안에 있는 객체)에 저장
		String res = scr.saveData(kind, name, flavor, numOf, price);
		System.out.println(res);
		
		//if문으로 저장된 값 확인
		System.out.println("저장된 값을 보시겠습니까?(yes/no)");
		String choice = sc.next();
		if(choice.equals("yes")) {
			res = scr.confirmData();
			System.out.println(res);
		}
		else {
			System.out.println("저장된 값을 보지 않습니다.");
		}
	}
}
