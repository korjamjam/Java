package test.t240719.object1;

public class AnimalManager {

	public static void main(String[] args) {

		// Animal 타입의 객체배열 크기 5로 생성
		// 각 인덱스에 무작위로 Dog객체 또는 Cat객체로 생성
		// (이때, 매개변수 생성자를 이용하여 생성)
		// 반복문을 통해서 해당 배열의 0번 인덱스부터 마지막 인덱스까지의
		// 객체의 speak() 메소드 호출

		Animal[] aniArr = new Animal[5];
		
		aniArr[0] = new Dog("셰퍼드", "개", 30);
		aniArr[1] = new Cat("러시안", "고양이","러시아" ,"파란색");
		aniArr[2] = new Cat("누룽지", "고양이", "한국","갈색");
		aniArr[3] = new Dog("말티즈", "개", 30);
		aniArr[4] = new Cat("스핑크스", "고양이", "이집트", "살구색");
		
		for(Animal ani : aniArr) {
			ani.speak();
		}
		
	}

}
