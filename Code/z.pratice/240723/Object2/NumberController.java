package test.t240723.object2;

import test.t240723.object1.CharCheckException;

public class NumberController {

	public NumberController() {
		super();
	}
	
		public boolean checkDouble(int num1, int num2) throws NumRangeException {
			boolean firNum = num1 >= 1 && num1 <= 100;
			boolean secNum = num2 >= 1 && num2 <= 100;
			
			boolean baesu = num1 % num2 == 0;
			
			if(firNum && secNum) {
				
				// 매개변수로 들어온 두 값이 1~100 사이 일 때 num1이 num2의 배수면 true,
				if(baesu) {
					return baesu;
				}
				// 배수가 아니라면 false 반환
				else {
					return baesu;
				}
			}else {
				// 1~100사이가 아니라면 NumRangeException발생, 에러 메시지는 출력 값 참고
				throw new CharCheckException("1부터 100 사이의 값이 아닙니다.");
				
			}
			
		}
}
