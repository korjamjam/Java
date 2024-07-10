package test.t240710.object2;

import test.t240709.object4.Book;

public class Run {

	public static void main(String[] args) {
		Product p1 = new Product("운동화", 10000, "나이키");
		Student s1 = new Student(1, 3, "전제민", 180, '남');
		Book b1 = new Book();
		Book b2 = new Book("총균쇠", "교보문고", "전제민");
		Book b3 = new Book("IQ84", "바른출판사", "민제전",10000, 0.5);
		
				
		p1.information();
		System.out.println();
		s1.information();
		System.out.println();
		b1.information();
		System.out.println();
		b2.information();
		System.out.println();
		b3.information();
	}

}
