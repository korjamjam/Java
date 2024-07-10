package test.t240710.object3;

public class Run {

	public static void main(String[] args) {
		Employee Hong = new Employee(/*100, "홍길동", "영업부", "과장", 25, '남', 2500000, 0.05, "010-1234-5678", "서울시 강남구"*/);
		Hong.setEmpNo(100);
		Hong.setEmpName("홍길동");
		Hong.setDept("영업부");
		Hong.setJob("과장");
		Hong.setAge(25);
		Hong.setGender('남');
		Hong.setSalary(2500000);
		Hong.setBonusPoint(0.05);
		Hong.setPhone("010-1234-5678");
		Hong.setAddress("서울시 강남구");
		
		Hong.information();
	}

}
