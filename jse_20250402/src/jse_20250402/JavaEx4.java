package jse_20250402;

public class JavaEx4 {

	public static void main(String[] args) {
		// 20250402 
		
		// 참조
		
		// 변수 <- 자료
		// 컵 <- 음료(데이터, 자료) 1:1
		
		// 1:다의 경우
		// ex) 물류업체 운영
		// - 사무실 = 불뮤창고(가본 자료형 변수)
		// - 사무실 : 물류창고(임대)
		
		// 사무실(기본 자료형에서 수용가능량 : 최대 8byte = 64bit)
		
		// 수용 데이터가 다량으로 필요함으로 참조혀 자료가 탄생
		// 이중 메모리 구조
		// 사무실(분당:물류창고 주소) -- (참조/가리킴) -- 물류창고(주소분리)
		// ASCII 코드(모든 코드체계(ex : utf-8,16, euc-kr 등등) 
		// int num1 = 0141; 8진수 접두어 "0" octal number
		// int num1 = 0x61; 16진수 접두어 "0x" hexa-decimal
		// int num1 = 'a'; //문자형 char 결과 : 97;
		// int num1 = 0b1100001; // 2진수 입력을 위해 "0b" 필요
		// 참조 자료형)배열, 클래스, 인터페이스, 열거형, 에너테이션, 레코드 
		// 97 = 1100001(2)		
		
		// 1 : one, uno, uni, mono
		// 2 : dual(duo), dos, bi, twice
		// 3 : three, tri, tres
		// 4 : four, quart
		// 5 : five, pent
		// 6 : six, sex(tant), hex
		// 7 : seven, sept
		// 8 : eight, oct
		// 9 : nine, nov
		// 10: ten, dec
		// int(32비트) <- double(64bit)
		
		// int num1 = (int)1.2; // 값의 결손이 일어나지만 변환 가능(소수점 아래는 삭제)
		// 형변환(type-conversion, casting)
		// () : 형변환 연산자
		
		// int num1 = (int)1.2D; // "d"ouble
		// int num1 = (int)1.2d; // "d"ouble
		// int num1 = (int)1d; // "d"ouble
		// int num1 = (int)1D; // "d"ouble
		
		// int num1 = 1.2f; // (X) float(4바이트=32비트) 실수형
		// int num1 = (int)1.2f; // float(4바이트=32비트) 실수형
		// int num1 = (int)1.2F; // float(4바이트=32비트) 실수형
		// int num1 = (int)1f; // float(4바이트=32비트) 실수형
		int num1 = (int)1F; // float(4바이트=32비트) 실수형
		
		// double : 소숫점(.)이 들어간 숫자, -d/-D(접미사)
		
		System.out.println(num1);
	}

}
