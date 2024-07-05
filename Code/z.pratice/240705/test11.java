package test.t240705;

import java.util.Scanner;

public class T_11 {
	/*
	 * 1부터 100사이의 정수 중 임의의 난수가 정해지고 사용자는 정해진 난수를 맞추는데 몇 번 만에 맞췄는지 출력하세요.
	 * ex.
	 * (랜덤수)90일 떄
	 * 
	 * 1~100 사이의 임의의 난수를 맞춰보세요 :0
	 * Up
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = 1;
		int ran = (int)(Math.random() * 100) + 1;

		while (true) {
			System.out.print("1~100 사이의 임의의 난수를 맞춰보세요 :");
			int number = sc.nextInt();

			if(number > 100 || number < 1) {
				System.out.println("1~100사이의 숫자를 입력해 주세요");
				continue;
			}			
			else{
			if (number < ran) {
				System.out.println("UP");
				count++;
				continue;
			} 
			else if (number > ran) {
				System.out.println("DOWN");
				count++;
				continue;
			} 
			else {
				System.out.println("정답입니다!");
				System.out.println(count+"회만에 맞추셨습니다.");
				break;
				}
			}	
		}
			sc.close();
	}
}
