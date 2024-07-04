package test.t240704;

public class T_05 {
	/*
	 * 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복분을 이용하여
	 * 순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요
	 * 1 2 ... 9 10
	 */

	public static void main(String[] args) {
		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
//			System.out.print(arr[i]+" ");
			System.out.println(i + "번 인덱스 값 : " + arr[i]);
		}
		/*
		 * 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복분을 이용하여 
		 * 역순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요 
		 * 10 9 ... 2 1
		 */

		System.out.println("====역순====");
		int arr2[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = 10-i;
			System.out.println(i + "번 인덱스 값 : " + arr2[i]);
		}
		
		System.out.println("====인덱스 포함 역순====");
		for (int i = arr2.length - 1; i >= 0; i--) {
			arr2[i] = i+1;
			System.out.println(i + "번 인덱스 값 : " + arr2[i]);
		}
	}
}
