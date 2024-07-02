package a.basic;
import java.util.Scanner;

public class Practice3 {
	/*
	 *문자열 => 객체(기능들이 있다.)
	 *ex) 문자열 비교시 -> 문자열.equals(비교문자열)
	 *
	 *문자열.chatAt(index) : 문자열에서 내가 원하는 index의 글자를 가져온다.
	 *index: 순서를 저장할 때 사용하는 것.
	 *
	 *영어 단어를 키보드로 입력받아 단어의 앞에서부터 3개를 출력하세요.
	 *ex_ apple -> app
	 *
	 *단어를 입력하세요. (키보드로 입력)
	 *첫 번째 문자 : a
	 *두 번째 문자 : a
	 *세 번째 문자 : a
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String str1 = "jemin";
//		char ch1 = str1.charAt(3);
//		System.out.println(ch1); //0부터 시작하기 때문에 i가 나옴.
		
		System.out.print("영어 단어를 입력하세요 :");
		String eng = sc.next();
		
//		char ch1 = eng.charAt(0);
//		char ch2 = eng.charAt(1);
//		char ch3 = eng.charAt(2);
//		
//		System.out.println("첫 번째 문자 :" + ch1);
//		System.out.println("두 번째 문자 :" + ch2);
//		System.out.println("세 번째 문자 :" + ch3);
		
		System.out.println("첫 번째 문자 :" + eng.charAt(0));
		System.out.println("두 번째 문자 :" + eng.charAt(1));
		System.out.println("세 번째 문자 :" + eng.charAt(2));
		
	}

}
