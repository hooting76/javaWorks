package com.javateam.jse;

public class JavaEx8 {

	public static void main(String[] args) {
		
		// char ch1 = ''; // (X)

		// 문자열 = 문자(들)의 배열
		// String str1 = "'html' \"CSS\" java\tteam\ngreen\rit";
		// System.out.println(str1);
		
		String str2 = 1 + '0' + "3" + 4 + 5;
		// 연산 순서)
		// 1 + '0'(48) = 49 : 덧셈(가산)
		// 49 + "3" = "493" : 문자열 연결
		// "493" + 4 = "4934" : 문자열 연결
		// "4934" + 5 = "49345" : 문자열 연결
		System.out.println(str2); // "49345"
		
		// 형식자(formatter)
		// Format string syntax(형식 문자열 문법)
		// : https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Formatter.html#syntax
		// System.out.printf("%c", 'a');
		System.out.printf("%.3f", 3.141592); // 소숫점 3자리만 표현
	}

}