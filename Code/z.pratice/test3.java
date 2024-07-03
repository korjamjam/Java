package test.t240703;

import java.util.Scanner;

public class T_03 {
	/*
	 * 국어, 영어, 수학, 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
	 * 합계와 평균을 이용하여 합격/ 불합격 처리하는 기능을 구현하세요.
	 * (합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
	 * 합격 했을 경우 과목 별 점수와 합계, 평균 "축하합니다, 합격입니다!"를 출력하고
	 * 불합격인 경우에는"불합격입니다"를 출력하세요.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int korScore, engScore, mathScore, sum = 0;
		
		System.out.print("국어점수 :");
		korScore = sc.nextInt();
		
		System.out.print("영어점수 :");
		engScore = sc.nextInt();
		
		System.out.print("수학점수 :");
		mathScore = sc.nextInt();
		
		sum	= korScore + engScore + mathScore;
		double average = (double)sum / 3.0;
		
		if(korScore > 0 && engScore > 0 && mathScore > 0) 
		{
			if(korScore >= 40 && engScore >= 40 && mathScore >= 40 && average >= 60) 
			{	
					System.out.println("국어 :" + korScore);
					System.out.println("영어 :" + engScore);
					System.out.println("수학 :" + mathScore);
					System.out.println("합계 :"+ sum);
					System.out.println("평균 :" + average);
					System.out.println("축하합니다, 합격입니다!");
				}
			
			else {
				System.out.println("불합격입니다.");
			}
		}
		else {
			System.out.println("잘못 입력했습니다.");
		}
	}

}
