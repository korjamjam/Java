package test.controller;

public class Test3 {
	/*
	 * 1부터 100까지의 모든 정수들의 합과 평균을 구하는 프로그램을 작성한다.
	   단, while문이나 do while문을 이용하여 작성한다. 
	 */

	public static void main(String[] args) {

		int num = 1; 
		double sum = 0, average = 0;
		while (num <= 100) {
			sum += num;
			num++;
		}
		average = sum / 2;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + average);
	}
}
