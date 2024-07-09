package f.object.ex4;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Run {
	/*
	 * jeon객체 생성 제민, 23살, 영어60, 수학70, 국어80
	 * min객체 생성 민제, 32살, 영어95, 수학50, 국어70
	 * 
	 */

	public static void main(String[] args) {
//		Student choi = new Student("제민", 15, 70, 60, 80);
//		Student min = new Student("민제", 18, 50, 95, 70);
//		
//		System.out.println(choi.getName() + "님의 평균 :" + choi.getEvg());
//		System.out.println(kim.getName() + "님의 평균 :" + kim.getEvg());
		
//		사용자로부터 이름, 나이, 영어점수, 수학점수, 국어점수를 입력받아
//		평균을 구하고 출력하는 프로그램 작성
//		ex) 이름 제민
//		이름 제민
//		나이 : 23
//		영어점수 : 60
//		수학점수 : 70
//		국어점수 : 80
//		제민님의 평균 : 70.0
		
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
