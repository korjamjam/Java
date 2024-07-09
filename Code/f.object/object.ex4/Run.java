package f.object.ex4;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Run {
	/*
	 * choi객체 생성 최지원, 15살, 영어60, 수학70, 국어80
	 * kim객체 생성 김도한, 18살, 영어95, 수학50, 국어70
	 * 
	 */

	public static void main(String[] args) {
//		Student choi = new Student("최지원", 15, 70, 60, 80);
//		Student kim = new Student("김도한", 18, 50, 95, 70);
//		
//		System.out.println(choi.getName() + "님의 평균 :" + choi.getEvg());
//		System.out.println(kim.getName() + "님의 평균 :" + kim.getEvg());
		
//		사용자로부터 이름, 나이, 영어점수, 수학점수, 국어점수를 입력받아
//		평균을 구하고 출력하는 프로그램 작성
//		ex) 이름 최지원
//		이름 최지원
//		나이 : 14
//		영어점수 : 80
//		수학점수 : 100
//		국어점수 : 75
//		최지원님의 평균 : 85
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		
		
		Student choi = new Student(name, age, eng, math, kor);
		
		System.out.println(choi.getName() + "님의 평균 : " + choi.getEvg());
 		choi.printEvg();
	}

}
