package test.t240715.object2;

public class Practice2 {

	public static void main(String[] args) {
		
	     //문자열.split(구분자)
	     //문자열은 구분자로 나눠서 배열로 반환하는 메소드
		
		//배열에 들어있는 모든 요소를 가져와서 사용하는 경우가 매우많다.
		//for(자료형 변수명 : 배열)
		// 	  변수명 -> 배열에 있는 모든 요소가 한번씩 들어와서 반복
		 String str = "1.22,4.12,5.93,8.71,9.34";
		 String[] arr = str.split(",");
		 // str에서 데이터를 분리한다.
		
		 int count = 0;
		 double[] dArr = new double[arr.length];
		 for(int i = 0; i<arr.length; i++){
			 // 배열에 실수 데이터를 넣는다.
			//배열 데이터의 합을 구한다.
			 dArr[i] += Double.parseDouble(arr[i]);
			 count++;
		 }
		 
		 double sum = 0;
		 
//		 for(int i=0; i<dArr.length; i++) {
//			 double d = dArr[i];
//			 sum += d;
//		 }
		 
		 for(double d : dArr) {
			 sum += d;
		 }
		
		 System.out.printf("합계 : %.3f\n",sum);
		 System.out.printf("평균 : %.3f", (sum/count));
		 // 결과 값을 출력 핚다.
	}

}
