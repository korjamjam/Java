package test.t240708;

public class Test10 {
	/*
	 * 2차원 배열에 들어있는 데이터들 중 3의 배수만 골라내서 새로운 1차원 배열에 기록하고 출력한다.
	 * 단 중복 값은 하나만 기록되게 한다.
	 * 
	 * 
	 * int [][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}};
	 * int[] copyAr = new int[array의 행갯수 * 열갯수];
	 */

	public static void main(String[] args) {
		int [][] array = {
				{12, 41, 36, 56}, 
				{82, 10, 12, 61}, 
				{14, 16, 18, 78}, 
				{45, 26, 72, 23}
				};
		int size = 0;
		
		for(int i=0; i<array.length; i++) {
			size += array[i].length;//array의 1차원 배열의 길이를 더함.
		}
		int[] copyAr = new int[size];
		int copyIndex = 0;
		
		//2차원배열 array를 전체 검사함.
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				
				// array의 i,j요소가 3의 배수인지 확인
				if (array[i][j] % 3 == 0) { 
					
					//i,j의 요소가 이미 copyAr들어있는 요소인지 확인					
					boolean isContinue = false;
					for(int k=0; k<copyIndex; k++) {
						if(copyAr[k] == array[i][j]) {
							isContinue = true;
							break;
						}
					}
					//isContinue -> true일 때는 반복값이 존재;
					if(!isContinue) {
						copyAr[copyIndex++] = array[i][j];
					}
				}
			}
		}
		System.out.print("copyAr : ");
		for(int i=0; i<copyIndex; i++) {
			System.out.print(copyAr[i]+ " ");
		}
	}
}
