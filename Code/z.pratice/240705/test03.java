package test.t240705;

import java.util.Scanner;

public class T_03 {
	/*
	 * 3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.
	 * ex.
	 * 입력1 : 5
	 * 입력2 : -8
	 * 입력3 : 5
	 * 
	 * false
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.print("입력 1 :");
		num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("입력 2 :");
		num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("입력 3 :");
		num3 = sc.nextInt();
		sc.nextLine();
		
		
		boolean comparsion = (num1 == num2 && num1 ==  num3) ? true : false;
		System.out.println(comparsion);
		
		
		if(num1 == num2 &&  num1 == num3) {
			System.out.println("true");	
			}
		else {
			System.out.println("false");
		}
		
		int[] arr = new int[3];
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("입력%d :", i+1);
			arr[i] = sc.nextInt();
		}
		System.out.println(arr[0] == arr[1] && arr[0] == arr[2]);
		sc.close();
	}
}
