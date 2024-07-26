# API 
## Math

이 클래스는 기본적인 수학 연산을 수행하는 `java.lang.Math` 클래스의 사용법을 보여줍니다.

### 메소드: `method01`

- **Math.PI**: π 값을 출력합니다.
- **Math.random()**: 0.0과 0.99 사이의 난수를 생성하여 출력합니다.
- **Math.abs(int a)**: 정수의 절대값을 출력합니다.
- **Math.ceil(double a)**: 숫자를 올림하여 가장 가까운 정수로 만듭니다.
- **Math.round(double a)**: 숫자를 반올림합니다.
- **Math.floor(double a)**: 숫자를 내림하여 가장 가까운 정수로 만듭니다.
- **Math.pow(double a, double b)**: 특정 숫자를 다른 숫자만큼 제곱합니다.

## B_String

이 클래스는 `java.lang.String` 클래스와 그 메소드의 사용법을 보여줍니다.


- **문자열 생성자**: `new` 키워드를 사용하여 문자열을 생성합니다.
- **문자열 리터럴**: 리터럴 값을 사용하여 문자열을 생성합니다.
- **문자열 비교**: `==`와 `equals()`를 사용하여 문자열을 비교합니다.
- **해시코드**: 문자열의 해시코드를 생성하는 방법을 설명합니다.
- **String Pool**: 문자열 풀의 개념을 설명합니다.

### 메소드: `method02`

- **charAt(int index)**: 특정 인덱스의 문자를 가져옵니다.
- **concat(String str)**: 지정된 문자열을 현재 문자열의 끝에 연결합니다.
- **contains(CharSequence s)**: 문자열에 지정된 문자열이 포함되어 있는지 확인합니다.
- **substring(int beginIndex, int endIndex)**: 문자열의 일부분을 추출합니다.
- **replace(char oldChar, char newChar)**: 문자열의 특정 문자를 다른 문자로 대체합니다.
- **toUpperCase()**: 문자열을 대문자로 변환합니다.
- **toLowerCase()**: 문자열을 소문자로 변환합니다.
- **trim()**: 문자열의 앞뒤 공백을 제거합니다.
- **toCharArray()**: 문자열을 char 배열로 변환합니다.
- **valueOf()**: 다른 데이터 타입을 문자열로 변환합니다.

### 메소드: `method03`

- **split(String regex)**: 문자열을 구분자를 기준으로 분리하여 배열에 저장합니다.
- **join(CharSequence delimiter, CharSequence... elements)**: 배열을 구분자를 사용하여 문자열로 결합합니다.
- **StringTokenizer**: 구분자를 사용하여 문자열을 토큰으로 분리합니다.

## C_Wrapper

이 클래스는 기본 자료형을 객체로 포장하는 래퍼 클래스의 사용법을 보여줍니다.

### 메소드: `method01`

- **Boxing**: 기본 자료형을 래퍼 클래스로 변환합니다.
- **AutoBoxing**: 객체 생성 없이 기본 자료형을 자동으로 래퍼 클래스로 변환합니다.
- **UnBoxing**: 래퍼 클래스를 기본 자료형으로 변환합니다.
- **기본 자료형과 문자열 간의 변환**: 기본 자료형을 문자열로, 문자열을 기본 자료형으로 변환합니다.

## D_Date

이 클래스는 날짜와 시간을 다루는 `java.util.Date` 클래스의 사용법을 보여줍니다.

### 메소드: `method01`

- **현재 날짜 및 시간 출력**: `Date` 객체를 사용하여 현재 날짜와 시간을 출력합니다.
- **특정 날짜 설정**: 생성자와 setter 메소드를 사용하여 특정 날짜를 설정합니다.
- **시간 형식 지정**: `SimpleDateFormat` 클래스를 사용하여 시간을 원하는 형식으로 출력합니다.
