package test.t240712.object1;

public class MemberController {
	
	public static final int SIZE = 10;
	private Member[] m =new Member[SIZE];
	
	public int existMemberNum(){
		int count = 0;
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null) {
				count++;
			}else{
				break;
			}
		}
		return count;
	}
	
	//inputID를 넘겨 받아서 사용 중 여부를 체크하고,
	//중복된 Id일 경우 사용불가 -> return false
	//중복되지 않은 id일 경우 -> return true
	public Boolean checkId(String inputId) {
		for(int i = 0; i < m.length; i++) { //for문 조건문에 i < m.length && m[i] != null라고 써도 됨.
			if(m[i] == null) {
				return true;
			}
			if(m[i].getId().equals(inputId)) { //중복id찾음
				return true;
			}
		}
		return false; //사용가능
	}
	
	public void insertMember(String id, String name, String pwd,String email, String gender, int age) {
		for(int i = 0; i < m.length; i++) {
			if(m[i] == null) {
				m[i] = new Member(id, name, pwd, email, gender, age);
				break;
			}
		}
	}
	
	public String searchId(String id) {
		System.out.println("찾으신 회원 결과입니다");
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				return m[i].inform();
			}	
		}
		return null;
	}
	
	public Member[] searchName(String name) {
		Member[] mArr = new Member[this.SIZE];
		System.out.println("찾으신 회원 결과입니다");
		int index = 0;
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getName().equals(name)) {
				mArr[index++] = m[i];
			}	
		}
		return mArr;	
	}
	
	public Member[] searchEmail(String email) {
		Member[] mArr = new Member[this.SIZE];
		System.out.println("찾으신 회원 결과입니다");
		int index = 0;
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getEmail().equals(email)) {
				mArr[index++] = m[i];
			}	
		}
		return mArr;
	}
	
	// 성공적으로 비밀번호 변경시 return true
	// 비밀번호 변경 실패시
	public Boolean updatePassword(String id, String password) {	
		for(int i = 0; i < m.length; i++) {
			//배열 m의 i번째 인덱스가 null이 아니고 id가 사용자가 입력한 id와 동일할 떄
			if(m[i] != null && m[i].getId().equals(id)) {
				m[i].setPassword(password);
				return true;
			}
		}
		//배열의 모든 index에 담긴 member를 확인했지만 id와 같은 member를 찾지 못함.
		return false;
	}
	
	public Boolean updateName(String id, String name) {
		for(int i = 0; i < m.length; i++) {
			//배열 m의 i번째 인덱스가 null이 아니고 id가 사용자가 입력한 id와 동일할 떄
			if(m[i] != null && m[i].getId().equals(id)) {
				m[i].setName(name);
				return true;
			}
		}
		return false;
	}
	
	public Boolean updateEmail(String id, String email) {
		for(int i = 0; i < m.length; i++) {
			//배열 m의 i번째 인덱스가 null이 아니고 id가 사용자가 입력한 id와 동일할 떄
			if(m[i] != null && m[i].getId().equals(id)) {
				m[i].setEmail(email);
				return true;
			}
		}
		return false;
	}
	
	//true -> 정상적으로 삭제됨
	//false -> id를 찾지 못함
	public Boolean delete(String id) {
	    for (int i = 0; i < m.length; i++) {
	        if (m[i] == null) {
	            continue; // null인 경우는 패스
	        }
	        if (m[i].getId().equals(id)) {
	            // i 위치 이후의 모든 요소를 한 칸씩 앞으로 이동
	            for (int j = i; j < m.length - 1; j++) {
	                m[j] = m[j + 1];
	            }
	            m[m.length - 1] = null; // 마지막 위치를 null로 설정
	            return true;
	        }
	    }
	    return false; // ID를 찾지 못한 경우
	}	
	public void deleteAll() {
		this.m = new Member[this.SIZE];
		
	}
	
	public Member[] printAll() {
		return this.m;
	}
}
