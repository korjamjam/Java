package test.t240709.object1;

public class Run {

	public static void main(String[] args) {
		Member jiwon = new Member();
		jiwon.changeName("최지원");
		jiwon.printName();
		
		//아이디, 비번, 이름을 초기화하는 생성자를 통해
		//객체를 하나 생성하고 printName()을 통해 이름을 출력해라
		
		Member jaemin = new Member("jm5213", "jm3125", "전제민");
		jaemin.printName();
		
	}

}
