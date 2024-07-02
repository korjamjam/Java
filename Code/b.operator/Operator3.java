package b.operator;

public class Operator3 {
	/*
	 * 3. 산술연산자
	 * 
	 * +, -, *, /(몫), %(나머지)
	 * 
	 * * / % > + -
	 * 
	 * 복합 대입 연산자 산술연산자와 대입연산자를 결합해서 사용할 수 있다.
	 * +=, -=, *=, /=, %=
	 * 
	 * ex) a = a+3; -> a += 3;
	 * 
	 */
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int c = (++a) + b; // a=6 b=10 c= 16
		int d = c / a; 
		int e = c % a;
		int f = e++; 
		int g = (--b) + (d--);
		int h = 2;
		//a=6, b=9, c=16, d=1, e=5, f=4, g=11, h=2
		int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h);
		//        6   + 9 / (15 / 4) * (11 - 1)  % (6 + 2)
		
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(i);

	}

}
