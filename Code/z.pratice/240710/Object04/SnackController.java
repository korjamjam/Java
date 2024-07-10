package solopractice.object.practice4;

public class SnackController {
	
	private Snack s = new Snack();

	//기본 생성자
	public SnackController() {		
		super();
	}
	//데이터 setter를 이용해 SnackMenu에서 받은 데이터 값 저장
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		
		return "저장되었습니다.";
	}
	//저장된 데이터를 반환
	public String confirmData() {
		return s.information();
		
	}
	
	
}
