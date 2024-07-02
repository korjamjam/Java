package a.basic;
import java.util.Scanner;

public class Practice2 {
	/*
	 * 키보드로 가로, 세로, 값을 실수형으로 입력받아 사각형의 면적과 둘레를 계산하여 출력하세요
	 * 면적 : 가로 * 세로
	 * 둘레 : (가로 + 세로)*2
	 * 
	 * 가로 : (키보드로 입력)
	 * 세로 : (키보드로 입력)
	 * 
	 * 면적 :~
	 * 둘레 :~
	 * + 소수점 2번쨰 자리까지만 출력
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 :");
		double hor = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("세로 :");
		double ver = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("가로 :" + hor);
		System.out.println("세로 :" + ver);
		
		System.out.printf("면적 : %.2f", (hor * ver));
		System.out.printf("둘레 : %.2f",(hor + ver) * 2);
		
		if(ver == hor) {
			System.out.printf("면적 : %.2f", (hor * ver));
			System.out.printf("둘레 : %.2f\n",(hor + ver) * 2);
			System.out.println("가로와 세로가 같은 정사각형 입니다.");
		}
	}
}
