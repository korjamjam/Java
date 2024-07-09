package test.t240709.object1;

public class Member {
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	//생성자
	public Member() {}
	
	public Member(String memberId, String memberPwd, String memberName) {
		
	//아이디, 비밀번호, 이름을 넘겨받아 초기화하는 생성자
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
//		this.age = age;
//		this.gender = gender;
//		this.phone = phone;	
	}
	//메소드
	
	//memberName의 필드값을 넘겨받은 name값으로 변경
	public void changeName(String name) {
		this.memberName = name;
	}
	//memberName의 값을 출력하는 메소드
	public void printName() {
		System.out.println("아이디: " + memberId);
		System.out.println("비밀번호: " + memberPwd);
		System.out.println("멤버이름: " + memberName);
		
	}
}
