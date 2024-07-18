package test.t240718.object2;

public class Run {

	public static void main(String[] args) {
		// PhoneController객체 생성하고 
		// 반복문을 이용하여 String배열의 각 인덱스 출력

		PhoneController pc = new PhoneController();
		//method() 호출 후 반환 값을 String 배열에 담고
		String[] results = pc.method();
		
		for(String res : results) {
			System.out.println(res);
		}
	}

}
