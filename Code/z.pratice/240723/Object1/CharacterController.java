package test.t240723.object1;

import java.io.IOException;

public class CharacterController {
	
	// 기본 생성자
	public CharacterController() {
		super();
	}

	public int countAlpha(String s) throws CharCheckException {

		// 매개변수로 들어온 값에 있는 영문자를 세어 반환
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
		// 문자열에 공백이 있다면 CharCheckException발생, 에러 메시지는 출력 값 참고
			if(c == ' ') {
				throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
			}else if(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
				count++;
			}

		}
		return count++;
	}
}
