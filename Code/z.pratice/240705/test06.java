package test.t240705;

import java.util.Scanner;

public class T_06 {
	/*
	 * 중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력하세요
	 * 평가 비율은 중간고사 20%, 기말고사 30%, 출석 20%로 이루어져 있고
	 * 이 때 출석 비율은 출석 회수의 총 강의 회수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
	 * 70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요
	 * 
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int midtest, fintest, assign ,attend;
		
		System.out.print("중간 고사 점수 :");
		midtest = sc.nextInt();
		//midtest *= 0.2;
		
		System.out.print("기말 고사 점수 :");
		fintest = sc.nextInt();
		//fintest *= 0.2;
		
		System.out.print("과제 점수 :");
		assign = sc.nextInt();
		//assign *= 0.2;
		
		System.out.print("출석 회수 :");
		attend = sc.nextInt();
		//attend *= 0.2;
		
		double midtest20 ,fintest30, assign30, attend20, sum;
		midtest20 = midtest * 0.2;
		fintest30 = fintest * 0.3;
		assign30 = assign *0.3;
		attend20 = attend;
		
		sum = midtest20 + fintest30 + assign30 + attend20;
		
		System.out.println("===============결과===============");
		
		System.out.println("중간 고사 점수(20) :" + midtest20);
		System.out.println("기말 고사 점수(30) :" + fintest30);
		System.out.println("과제 점수(30) :" + assign30);
		System.out.println("출석 점수(20) :" + attend20);
		System.out.println("총점 :" + sum);
		
		
		
		if(sum >= 70 && attend > 14) {
			System.out.println("Pass [통과]");
		}
		else if(sum < 70) {
			System.out.println("Fail [점수미달]");
		}
		else {
			System.out.println("Fail [출석미달]");
		}
		sc.close();
	}

}
