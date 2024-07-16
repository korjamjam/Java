package test.t240716.object2;

public class Human {
	//필드
	private String name;
	private int age;
	private int height;
	private int weight;
	
	//기본 생성자
	public Human() {
		super();
	}

	//4개의 초기값을 받는 생성자
	public Human(String name, int age, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	//Object 의 toString() override 한다. Human 정보를 리턴한다.
	@Override
	public String toString() {
		return this.name + " " + this.age + " "+ this.height + " "+ this.weight;
	}
	
	
	
}
