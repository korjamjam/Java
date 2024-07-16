package i.polymorphism;

public class Run {
	public static void main(String[] args) {

    Cake c1 = new CheeseCake();
		//Cake까지 접근가능하며 메모리공간은 실제 CheeseCake다
		
    c1.sweet();
		c1.yummy();//오버라이딩시에는 실제 메모리에 있는 재정의된 메서드가 호출된다.
		
		//CheeseCake ch2 = new Cake();
		//실제메모리공간이 Cake이므로 CheeseCake공간에 접근할 수 없다.
	}

}
