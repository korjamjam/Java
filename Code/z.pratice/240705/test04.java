package test.t240705;

import java.util.Scanner;

public class T_04 {
	/*
	 * A,B,C 사원의 연봉을 입력 받고 각 사원의 연봉과 인센티브를 포함한 연봉을 계산하여 출력하고
	 * 인센티브 포함 급여가 3000만원 이상이면 "3000 이상", 미만이면 "3000 미만"을 출력하세요.
	 * (A 사원의 인센티브는 0.4, B 사원의 인센티브는 없으며, C 사원의 인센티브는 0.15)
	 * 
	 * ex.
	 * A사원의 연봉 : 2500
	 * B사원의 연봉 : 2900
	 * C사원의 연봉 : 2600
	 * 
	 * A사원 연봉/연봉+a : 2500/3500.0
	 * 3000 이상
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A사원의 연봉 :");
		int Amoney = sc.nextInt();
		
		System.out.print("B사원의 연봉 :");
		int Bmoney = sc.nextInt();
		
		System.out.print("C사원의 연봉 :");
		int Cmoney = sc.nextInt();
		
		double Aincentive = Amoney * 0.4;
		double Cincentive = Cmoney * 0.15;
		
		double Asum = Amoney + Aincentive;
		double Bsum = Bmoney;
		double Csum = Cmoney + Cincentive;
		
		if(Asum >= 3000) {
			System.out.println("A사원 연봉/연봉+a : " +Amoney+"/"+Asum);
			System.out.println("3000이상");
		}
		else {
			System.out.println("A사원 연봉/연봉+a : " +Amoney+"/"+Asum);
			System.out.println("3000미만");
		}
		
		if(Bsum >= 3000) {
			System.out.println("B사원 연봉/연봉+a : " +Bmoney+"/"+Bsum);
			System.out.println("3000이상");
		}
		else {
			System.out.println("B사원 연봉/연봉+a : " +Bmoney+"/"+Bsum);
			System.out.println("3000미만");
		}
		
		if(Csum >= 3000) {
			System.out.println("C사원 연봉/연봉+a : " +Cmoney+"/"+Csum);
			System.out.println("3000이상");
		}
		else {
			System.out.println("C사원 연봉/연봉+a : " +Cmoney+"/"+Csum);
			System.out.println("3000미만");
		}
		sc.close();
		
	}
}
