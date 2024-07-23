package k.exception.ex1;

import java.io.IOException;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		RunException ex = new RunException();
//		Scanner sc = new Scanner(System.in);
////		ex.method01();
////		ex.method02();
//		
//		try {
//			ex.methodA();
//		} catch (IOException e) {
//			System.out.println("main에서 해결");
//			e.printStackTrace();
//		}finally {// 예외가 발생하건 안하건 try-catch 종료후 마지막에 실행하는 코드
//			sc.close();
//		}
		
		try(Scanner sc = new Scanner(System.in);) {
			ex.methodA();
		} catch (IOException e) {
			System.out.println("main에서 해결");
			e.printStackTrace();
		}
		ex.myInfo(null);
	}

}
