package solopractice;

import java.util.Scanner;

public class SoloPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		int i, j;
//		System.out.println("구구단");
//		for(i=2; i<=9; i++) {
//			System.out.println("\n"+ i+"단");
//			for(j=1; j<=9; j++) {
//				System.out.println( i + "x" + j + "=" + i*j);
//			}
//		}
//		
//		int num1 = 6;
//		System.out.println(++num1); //7(7)
//		System.out.println(num1++); //7(8)
//		System.out.println(num1);   //8
//		System.out.println(num1++); //8(9)
//		System.out.println(num1--); //9(8)
//		System.out.println(num1++); //8(9)
//		System.out.println(--num1); //8(8)
//		System.out.println(--num1); //7(7)
//		System.out.println(++num1); //8(8)
//		System.out.println(num1);   //8
		
		//문자 입력
//		String str;
//		System.out.print("문자 입력 :");
//		str = sc.next();
//		
//		//char배열 생성 후 문자열의길이 
//		char[] cArr = new char[str.length()]; 
//		
//		
//		for(int i = 0; i < cArr.length; i++) {
//			cArr[i] = str.charAt(i);
//			System.out.println(i + "번 인덱스 값 :"+ cArr[i]);
//		}
		
		//문제에서 다시 사용자가 값을 입력하도록 할 때는
		//while(true)를 써서 무한루프를 만든 뒤 break;와 continue;를 적절히 사용한다.
		
		//계산기를 만들어라
		//단, 사칙연산만을 할 수 있고, 종료 문구를 입력하면 프로그램이 종료되었습니다가 나오게 한다.
		
//		int num1, num2, choice;
//		boolean exit = false;
//
//		System.out.println("계산기 프로그램입니다.");
//		
//		System.out.print("첫번째 숫자를 입력하세요: ");
//		num1 = sc.nextInt();
//
//		System.out.print("두번째 숫자를 입력하세요: ");
//		num2 = sc.nextInt();
//
//		do {
////			System.out.print("첫번째 숫자를 입력하세요: ");
////			num1 = sc.nextInt();
////
////			System.out.print("두번째 숫자를 입력하세요: ");
////			num2 = sc.nextInt();
//
//			System.out.println("1. 더하기");
//			System.out.println("2. 빼기");
//			System.out.println("3. 곱하기");
//			System.out.println("4. 나누기(몫)");
//			System.out.println("5. 나누기(나머지)");
//			System.out.println("6. 종료");
//
//			System.out.print("번호를 입력하고 원하는 연산을 선택하세요: ");
//			choice = sc.nextInt();
//
//			switch (choice) {
//			case 1:
//				System.out.println("합: " + (num1 + num2)+"\n");
//				break;
//			case 2:
//				System.out.println("차: " + (num1 - num2)+"\n");
//				break;
//			case 3:
//				System.out.println("곱: " + (num1 * num2)+"\n");
//				break;
//			case 4:
//				if (num2 != 0) {
//					System.out.println("나누기(몫): " + (num1 / num2)+"\n");
//				} else {
//					System.out.println("0으로 나눌 수 없습니다."+"\n");
//				}
//				break;
//			case 5:
//				if (num2 != 0) {
//					System.out.println("나누기(나머지): " + (num1 % num2)+"\n");
//				} else {
//					System.out.println("0으로 나눌 수 없습니다."+"\n");
//				}
//				break;
//			case 6:
//				System.out.println("프로그램을 종료합니다.");
//				exit = true;
//				break;
//			default:
//				System.out.println("잘못된 선택입니다. 다시 선택하세요."+"\n");
//				break;
//			}
//
//			// 사용자가 6(종료)를 선택하지 않았다면 다시 메뉴로 돌아가도록 합니다.
//		} while (!exit);
//
//		sc.close(); // 프로그램 종료 전에 Scanner 객체를 닫아줍니다.
		
		//정수 하나를 입력하여 한 자릿수인지 두자릿수 이상인지 판별하는 프로그램
		//단, 0과 음수를 포함한 모든 정수이다
		
//		System.out.print("정수 하나 입력 :");
//		int num = sc.nextInt();
//		
//		if(num >= 10 || num <= -10) {
//			System.out.println(num + "은/는 두자릿수 입니다.");
//		}
//		else {
//			System.out.println(num + "은/는 한자릿수 입니다.");
//		}
		/*
		 * 길이가 10인 정수 배열을 선언하고 
		 * 1부터 10까지의 값을 반복문을 이용하여 순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		 */
//		int[] arr = new int[10];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = i+1;
//		}
//		for(int i = 0; i< arr.length; i++) {
//			System.out.print(arr[i]+ " ");
//		}
		
		/*
		 * 사용자가 배열의 길이를 직접 입력하여 
		 * 그 값만큼 정수형 배열을 선언 및 할당하고 
		 * 배열의 크기만큼 사용자가 직접 값을 입력하여 
		 * 각각의 인덱스에 값을 초기화 하세요. 
		 * 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요 
		 * ex. 정수 : 3 배열 
		 * 0번째 인덱스에 넣을 값 : 4 배열 
		 * 1번째 인덱스에 넣을 값 : -4 배열 
		 * 2번째 인덱스에 넣을 값 : 3 배열 
		 * 3번째 인덱스에 넣을 값 :-3 배열
		 * 4 -4 3 -3
		 * 총 합 : 0
		 */
		
//		System.out.print("정수 :");
//		int num = sc.nextInt();
//		
//		int[] arr = new int[num];
//		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(i + "번째 인덱스에 넣을 값 :");
//			arr[i] = sc.nextInt();
//		}
//		int sum = 0;
//		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//			sum += arr[i];
//		}
//		System.out.println();
//		System.out.println("총합: "+sum);
//		
//		sc.close();
		
		/*
		 * 3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고, 
		 * 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요. 
		 * 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고 다시 정수를 받도록 하세요. 
		 * ex. 
		 * 정수 : 4 
		 * 다시 입력하세요. 
		 * 정수 : -6 
		 * 다시 입력하세요. 
		 * 정수 : 5 
		 * 1 2 3 2 1
		 */
		
//		while (true) {
//
//			System.out.print("정수 :");
//
//			int num = sc.nextInt();
//
//			int count = 0;
//
//			if (num >= 3 && num % 2 == 1) {
//				int[] arr = new int[num];
//				for (int i = 0; i < arr.length; i++) {
//					if (arr.length / 2 >= i) {
//						arr[i] = ++count; // 선증가 후처리를 한다.
//					} else {
//						arr[i] = --count; // 선감소 후처리를 한다.
//					}
//				}
//				for (int i = 0; i < arr.length; i++) {
//					System.out.print(arr[i] + " ");
//				}
//				break;
//
//			} else {
//				System.out.println("다시 입력하세요");
//			}
//		}
//		sc.close();
		
		/*
		 * 사용자가 입력한 값이 배열에 있는지 검색하여 있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
		 * 단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
		 * 
		 * ex. 치킨 이름을 입력하세요 : 양념 
		 * 양념치킨 배달 가능
		 * 
		 * 치킨 이름을 입력하세요 : 불닭 
		 * 불닭치킨은 없는 메뉴입니다.
		 * 
		 * 문제해석
		 * 배열에 있는지 -> 배열 인덱스에 값을 넣어놔라
		 * 검색하여 있으면 -> 문자열 비교 .equals() 사용
		 */
//		  String[] chickenMenu = {"후라이드", "양념", "간장", "마늘", "치즈", "핫후라이드"};
//	        
//	        // Scanner 객체 생성
//	        //Scanner scanner = new Scanner(System.in);
//	        
//	        // 사용자 입력 받기
//	        System.out.print("치킨 이름을 입력하세요: ");
//	        String userInput = sc.nextLine();
//	        
//	        // 배열에서 치킨 메뉴 검색
//	        boolean found = false;
//	        for (int i = 0; i < chickenMenu.length; i++) {
//	            if (chickenMenu[i].equals(userInput)) {
//	                found = true;
//	                break;
//	            }
//	        }
//	        
//	        // 결과 출력
//	        if (found) {
//	            System.out.println(userInput + "치킨 배달 가능");
//	        } else {
//	            System.out.println(userInput + "치킨은 없는 메뉴입니다.");
//	        }
//	        sc.close();
     
	        // Scanner 닫기

		/*
		 * 자바에서 사용자로부터 5개의 정수를 입력받아 배열에 저장하고, 
		 * 이 배열의 모든 원소들을 더한 후 그 결과를 출력하는 프로그램을 작성해보세요.
		 */
//		Scanner sc = new Scanner(System.in);
//		int num, sum = 0;
//		int [] numArr = new int[5];
//		
//		for(int i=0; i<numArr.length; i++) {
//			System.out.print("정수 입력 :");
//			num = sc.nextInt();
//			numArr[i] = num;
//			
//			sum += numArr[i];
//		}
//		System.out.println("배열의 모든 원소의 합 :" + sum);
		
		/*
		 * 사용자로부터 정수를 입력받아 배열에 저장하고, 
		 * 해당 배열에서 가장 큰 값과 가장 작은 값을 찾아 출력하는 프로그램을 작성해보세요.
		 */
//		Scanner sc = new Scanner(System.in);
//		int num1, num2;
//		
//		System.out.print("정수 개수 입력 :");
//		num1 = sc.nextInt();
//		
//		int[] arr = new int[num1];
//		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print("정수 입력 :");
//			num2 = sc.nextInt();
//			
//			arr[i] = num2;		
//		}
//		 // 최소값과 최대값 찾기
//        int min = arr[0];
//        int max = arr[0];
//        
//        for (int i = 1; i < num1; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        // 결과 출력
//        System.out.println("입력한 정수 중 최소값: " + min);
//        System.out.println("입력한 정수 중 최대값: " + max);
//        		
//		
	}
}
