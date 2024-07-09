package test.t240709.object4;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("책 이름 : ");
		String name = sc.next();
		sc.nextLine();
		
		System.out.print("출판사 : ");
		String publisher = sc.next();
		sc.nextLine();
		
		System.out.print("작가 이름 : ");
		String author = sc.next();
		sc.nextLine();
		
		System.out.print("가격 : " );
		int price = sc.nextInt();
		
		System.out.print("할인율 : ");
		double discount = sc.nextDouble();
		
		Book b1 = new Book();
		Book b2 = new Book(name, publisher, author);
		Book b3 = new Book(name, publisher, author, price, discount);
		
		System.out.println("b1");
		b1.information();
		System.out.println("b2");
		b2.information();
		System.out.println("b3");
		b3.information();
	}

}
