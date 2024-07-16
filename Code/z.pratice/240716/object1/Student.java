package test.t240716.object2;

public class Student extends Human{
	
	private String number;
	private String major;
	
	//기본 생성자
	public Student() {
		super();
	}

	//6개의 초기값을 받는 생성자 (name, age, height, weight 는 부모생성자로 초기화 한다.)
	public Student(String name, int age, int height, int weight, String number, String major) {
		super(name, age, height, weight);
		this.number = number;
		this.major = major;
	}
	//Human의 toString() override 한다. 
	//Human의 toString()이 리턴한 값에 Student 정보를 추가해서 리턴한다.
	@Override
	public String toString() {
		return super.toString() + " " + this.number + " "+ this.major;
	}
}
