package test.t240715.object1;

public class Student {
	//Student class는 name(String), classRoom(int)
	//javaScore(double), sqlScore(double), practiceScore(double)값을 가진다.
	//각 필드데이터의 getter/setter, 기본생성자, 모든필드데이터를 초기화하는 생성자를 작성하고
	//또한 toString : 학생의 정보를 "xx반 xxx학생 xx점 xx점 xx점"으로 정보를 반환하는 메소드 
	//각점수는 자바, sql, practice순으로 작성
	// isPassed: 모든 점수가 60점이상이면서 평균이 60점이상이면 true 아니면 false를 반환하는 메소드
	// reTest : 학생의 모든 점수를 랜덤(0~100)으로 다시 부여하는 메소드 반환 없음.
	
	private String name;
	private int classRoom;
	private double javaScore;
	private double sqlScore;
	private double practiceScore;
	
	public Student() {
		super();
	}

	public Student(String name, int classRoom, double javaScore, double sqlScore, double practiceScore) {
		super();
		this.name = name;
		this.classRoom = classRoom;
		this.javaScore = javaScore;
		this.sqlScore = sqlScore;
		this.practiceScore = practiceScore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}

	public double getJavaScore() {
		return javaScore;
	}

	public void setJavaScore(double javaScore) {
		this.javaScore = javaScore;
	}

	public double getSqlScore() {
		return sqlScore;
	}

	public void setSqlScore(double sqlScore) {
		this.sqlScore = sqlScore;
	}

	public double getPracticeScore() {
		return practiceScore;
	}

	public void setPracticeScore(double practiceScore) {
		this.practiceScore = practiceScore;
	}
	//또한 toString : 학생의 정보를 "xx반 xxx학생 xx점 xx점 xx점"으로 정보를 반환하는 메소드 
		//각점수는 자바, sql, practice순으로 작성
		// isPassed: 모든 점수가 60점이상이면서 평균이 60점이상이면 true 아니면 false를 반환하는 메소드
		// reTest : 학생의 모든 점수를 랜덤(0~100)으로 다시 부여하는 메소드 반환 없음.
	
	public String toString() {
		System.out.println(this.classRoom + "반 "+ this.name  + "학생 "+this.javaScore + "점 "+ this.sqlScore + "점 "+ this.practiceScore + "점 ");
		return null;
	}
	public boolean isPassed() {
		double sum = this.javaScore + this.sqlScore + this.practiceScore;
		double average = sum / 3;
		boolean allScore = (this.javaScore >= 60 && this.sqlScore >= 60 && this.practiceScore>=60);
		
		if( allScore && average >=60) {
			System.out.println("합격입니다.");
			return true;
		}
		else {
			System.out.println("불합격입니다.");
			return false;
		}
	}
	public void reTest() {
		this.javaScore = Math.random()*101; //0~100
		this.sqlScore = Math.random()*101;
		this.practiceScore = Math.random()*101;
		
		System.out.printf("랜덤 자바점수 : %.2f \n",this.javaScore);
		System.out.printf("랜덤 SQL점수 : %.2f \n",this.sqlScore);
		System.out.printf("랜덤 연습점수 : %.2f \n",this.practiceScore);
	}
}
