package test.t240705;

import java.util.Scanner;

public class T_10 {
	/*
	 * 사용자로부터 문자열을 입력 받고 문자열에서 검색될 문자를 입력 받아 해당 문자열에 그 문자가 몇 개 있는지 개수를 출력하세요
	 * 이 때, N이나 n이 나오면 프로그램을 끝내고 Y나 y면 계속 진행하도록 하되 Y, y, N, n이 아닌
	 * 다른 문자를 입력했을 경우 "잘못된 대답입니다. 다시 입력해주세요."를 출력하고
	 * 더 하겠냐는 물음을 반복하세요.
	 * 
	 * ex.
	 * 문자열 : apppeaw
	 * 문자 : a
	 * 포함된 개수 : 2
	 * 더 하시겠습니까? (y/n) : y
	 * 
	 * 문자열 : appppelaw
	 * 문자 : e
	 * 포함된 개수 : 1
	 * 더 하시겠습니까? (y/n) : n
	 * 
	 */

	
	//문자 입력
//	System.out.print("문자열 :");
//	String str = sc.next();
//
//	System.out.print("문자 :");
//	char word = sc.next().charAt(0);
//
//	char[] charArr = new char[str.length()]; //
//
//	System.out.print(str + "에 " + word + "가 존재하는 위치 (인덱스) :");
//
//	int count = 0;
//	for (int i = 0; i < charArr.length; i++) {
//		if (str.charAt(i) == word) {
//			System.out.print(i + " ");
//			count++;
//		}
//
//	}
//	System.out.println("\n" + word + "개수 :" + count);
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//
//		while (true) {
//			System.out.print("문자열 :");
//			String message = sc.next();
//
//			System.out.print("문자 :");
//			char word = sc.next().charAt(0);
//
//			char[] charArr = new char[message.length()];
//
//			int count = 0;
//			for (int i = 0; i < charArr.length; i++) {
//				if (message.charAt(i) == word) {
//					count++;
//				}
//			}
//			System.out.print(word + "개수 :" + count);	
//			
//			while(true) {
//			System.out.println(" ");
//			System.out.print("더 하시겠습니까? (y,n) :");
//			char choice = sc.next().charAt(0);
//			
//			if(choice == 'y' || choice == 'Y') {
//				break;
//			}
//			else if (choice == 'n' || choice == 'N'){
//				break;
//			}			
//			else {
//				System.out.print("잘못된 대답입니다. 다시 입력해주세요.");
//				continue;
//			}
//			}
//		}
		while(true) {
		System.out.print("문자열 : "); //전체를 탐색하여 입력받은 문자가 몇개 존재하는지 검사
		String str = sc.next();
		
		System.out.print("문자 :");
		char target = sc.next().charAt(0);
		
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == target) {
				count++;
			}
		}
		System.out.print(target + "개수 :" + count);
		System.out.println("");
		
		
		while(true) {
			System.out.print("더 하시겠습니까? (y/n) :");
		
			target = sc.next().charAt(0);
			if(target != 'n' || target !='N' || target != 'y'|| target != 'Y'){
				System.out.print("잘못된 대답입니다. 다시 입력해주세요.");
				System.out.println("");
			}
			else {
				break;
			}
		}
		if(target == 'n' || target =='N') {
			break;
		}
		
		}
	}
}
