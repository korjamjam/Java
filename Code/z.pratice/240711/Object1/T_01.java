package test.t240711.object1;

import java.util.Scanner;

public class T_01 {

	public static void main(String[] args) {
		//정수 n(2~9)를 입력 받아서 2부터 n까지 중 짝수의 구구단을 출력하는 함수를 작성하세요.
		//만약 2~9사이의 값을 입력하지 않는다면 다시 입력하세요를 반복합니다.
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();
			
			if(num >= 2 && num <= 9) {
				for(int i = 2; i <= num; i++) {
					if(i % 2 == 0) {
						for(int j = 1; j <= 9; j++) {
							System.out.println(i + " * " + j + " = " + (i*j));
						}
					}
					System.out.println();
				}
				break;
			}
			else{
				System.out.println("다시 입력하세요");
				continue;
			}
		}
	}

}
