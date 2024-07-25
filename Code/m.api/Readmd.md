package m.api.ex1;
import java.lang.*; //내가 직접 import하지 않아도 무조건 import됨

public class A_Math {
	//java.lang.Math
	//모든 필드는 상수필드, 모든 메소드는 static메소드이다.
	public void method01() {
		//상수필드
		System.out.println("파이 : " + Math.PI);
		
		//랜덤수
		System.out.println("랜덤(0~0.99)" + Math.random());
		
		//절대값을 알고싶다.
		int num1 = -10;
		System.out.println("절대값 : " + Math.abs(num1));
		
		//올림
		double num2 = 4.449;
		System.out.println("올림 : " + Math.ceil(num2));
		
		//반올림
		System.out.println("반올림 : " + Math.round(num2));
		
		//버림
		System.out.println("버림 : " + Math.floor(num2));
		
		//제곱
		System.out.println("2의 10제곱 : " + Math.pow(2, 10));
	}

}

package m.api.ex1;

import java.util.StringTokenizer;

public class B_String {
	public void method01() {
		// 1.생성자를 통한 문자열 생성
		// new는 메모리공간을 새로 만들기 때문에 주소값이 다름.
		String str1 = new String("hello");
		String str2 = new String("hello");

		System.out.println(str1);
		System.out.println(str2);
		// String클래스에 toString메소드는 이미 오버라이딩 되어있음.

		// 주소값을 비교하기 때문에 false가 나온다.
		System.out.println(str1 == str2);

		// String클래스에서 equals메소드는 이미 오버라이딩이 되어있음(주소값이 아닌 값비교)
		System.out.println(str1.equals(str2));

		// String클래스에서 hashCode메소드가 이미 오버라이딩이 되어있다(주소값이 아닌 문자열을 가지고 만들도록)
		System.out.println(str1.hashCode());

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));

		// -----------------------------------------------------

		// 2. 문자열을 리터럴값으로 생성
		String str3 = "hello";
		String str4 = "hello";
		// 리터럴 제시시 상수풀영역에 들어감
		// String Pool특징 : 동일한 문자열을 가질 수 없다.

		System.out.println(str3);
		System.out.println(str4);

		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());

		System.out.println(str3 == str4);
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));

		str3 = "bye";

		System.out.println(System.identityHashCode(str3));
		// 변경하는 순간 기존의 문자열 자리에서 변경되는게 아닌
		// 새로운 곳을 참조하도록 됨(새로운 주소값 부여받음 == 주소값 변경)

	}

	public void method02() {
		String str1 = "Hello World";
		System.out.println("str1 = " + str1);

		// 1. 문자열.charAt(int index) : char
		// 문자열에서 전달받은 index 위치에 문자만을 추출해서 리턴(반환형은 char)
		char ch = str1.charAt(6);
		System.out.println("ch : " + ch);

		// 2. 문자열.concat(String str) : String
		// 문자열과 전달된 또다른 문자열을 하나로 합쳐서 새로운 문자열로 리턴
		String str2 = str1.concat("!!!");
		System.out.println("str2 : " + str2);

		String str3 = str1 + "!!!";
		System.out.println("str3 : " + str3);

		// 3.문자열.contains(CharSequence str) : boolean
		// 문자열과 전달된 문자열이 포함되어 있는지를 반환
		System.out.println("str1에 Hello라는 문자열이 포함? : " + str1.contains("Hello"));
		System.out.println("str1에 Bye라는 문자열이 포함? : " + str1.contains("Bye"));

		// 4. 문자열.substring(int beginIndex, [int endIndex]) : String
		// 문자열을 beginIndex위치부터 endIndex-1 위치까지 추출해서 리턴
		System.out.println(str1.substring(6));

		// 5. 문자열.replace(char oldchar, char newChar) : String
		// 문자열에서 oldChar문자를 newChar문자로 변환한 채 문자열 리턴
		String str4 = str1.replace('l', 'c');
		System.out.println("str1 : " + str1);
		System.out.println("str4 : " + str4);

		// 6. 문자열.toUpperCase(): String => 문자열을 전부 대문자로 변경해서 리턴
		// 문자열.toLowerCase(): String => 문자열을 전부 소문자로 변경해서 리턴
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());

		// 7. 문자열.trim() : String
		// 문자열의 앞 뒤 공백을 제거시킨 새 문자열을 리턴
		String str5 = "     JA     va     ";
		System.out.println(str5.trim());

		// 8. 문자열.toCharArray() : char[]
		char[] arr = str1.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + " :" + arr[i] + " / ");
		}

		// 9. String -> valueOf
		System.out.println("\n" + String.valueOf(arr));

	}

	public void method03() {
		String str = "Java,Oracle,sql,html,css,spring";

		// 구분자를 기준으로 문자열을 분리시키는 방법
		// 방법1. 분리된 문자열들을 String[] 배열에 차곡차곡 담고자 할때
		// String클래스에서 제공하는 split() 메소드를 사용한다.
		// 문자열.split(구분자) : String[]
		String[] arr = str.split(",");
		for (String st : arr) {
			System.out.println(st);
		}
		
		//분리된 문자열 배열을 다시 String으로 변경하는 방법
		//String.join(구분자, 배열);
		
		String str2 = String.join(", ", arr);
		System.out.println(str2);
		
		//방법2. 분리된 문자열들을 각각 토큰으로써 관리가능
		//java.util.StringTokenizer클래스를 이용
        //StringTokenizer stn = new StringTokenizer(배열, 구분자);
//		StringTokenizer stn = new StringTokenizer(str, ",");
		
	}
}

package m.api.ex1;

public class C_Wrapper {
	/*
	 Wrapper클래스
	 => 기본자료형을 객체로 포장해줄 수 있는 클래스가 래퍼클래스이다.
	 
	 	boolean(Boolean)
	 	char(Character)
	 	byte(Byte)
	 	short(Short)
	 	int(Integer)
	 	long(Long)
	 	float(Float)
	 	double(Double)
	 
	 => 기본자료형을 객체로 표현해야할 경우
	 - 메소드 호출해야할 때
	   => 메소드의 매개변수가 기본자료형이 아닌 객체타입만 요구 될 때
	 - 다형성을 적용시키고 싶을 때
	 */
	public void method01() {
		//Boxing : 기본자료형 -> Wrapper클래스 자료형으로 변경
		int num1 = 10;
		int num2 = 20;
		
		//System.out.println(num1.equals(num2));
		
		//1. 객체생성구문을 통한 방법
		Integer i1 = new Integer(num1); // num1 => i1
		Integer i2 = new Integer(num2); // num2 => i2
		
		System.out.println(i1);
		System.out.println(i2);
		
		System.out.println(i1.equals(i2)); //오버라이딩이 되어서 실제 값 비교가 가능
		System.out.println(i1.compareTo(i2)); //두 값을 비교햐서 앞쪽이 크면 1반환, 뒤쪽이 크면 -1반환, 같으면 0반환
	
		//2. 객체생성 하지않고 곧바로 대입방법(AutoBoxing)
		Integer i3 = num1;
		System.out.println(i3);
		
		//객체생성을 통해서 반드시 변환해야하는 경우 -> 문자열을 Integer타입으로 변환하고 싶을 때
		Integer i4 = Integer.parseInt("123");
		Integer i5 = new Integer("123");
		
		//UnBoxing : Wrapper클래스 자료형 -> 기본자료형
		
		//1. 해당 그 Wrapper클래스에서 제공하는 xxxValue()메소드를 통해서 가능
		int num3 = i3.intValue();
		int num4 = i4.intValue();
		
		//2. 메소드사용하지않고 바로 대입하는 방법
		int num5 = i3;
		
		//기본자료형 <--> String
		String str1 = "10";
		String str2 = "15.5";
		
		System.out.println(str1 + str2);
		
		//String -> 기본자료형
		//"10" -> 10
		//"15.5" -> 15.5
		//해당 Wrapper클래스.parsewww()사용
		
		int i = Integer.parseInt(str1);
		double d = Double.parseDouble(str2);
		System.out.println(i + d);
		
		//기본자료형 -> String
		System.out.println(i + "");
		System.out.println(String.valueOf(i) + 10);
		System.out.println(String.valueOf(d));
		
	}
}

package m.api.ex1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class D_Date {
	public void method01() {
		Date date1 = new Date();
		System.out.println(date1);

		// 내가 원하는 날짜(2024년 12월 12일)로 세팅
		// 1) 생성자를 통해서 생성
		Date date2 = new Date(2024 - 1900, 12 - 1, 12);
		System.out.println(date2);
		
		// 2) 기본생성자로 생성한 후에 setter메소드로 값 변환
		date1.setYear(2024 - 1900);
		date1.setMonth(6-1);
		date1.setDate(28);
		date1.setHours(9);
		date1.setMinutes(0);
		date1.setSeconds(37);
		System.out.println(date1);
		
		System.out.println(date1.getTime());
		
		System.out.println(1900 + date1.getYear() + "년 ");
		
		//SimpleDateFormat
		//시간을 보여주기위한 형식을 지정하는 객체
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년, MM월, dd일, hh시 mm분 ss초");
		String date5 = sdf.format(date1);
		System.out.println(date5);
	}

}








