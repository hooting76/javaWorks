package com.javateam.jse;

public class JavaEx7 {

	public static void main(String[] args) {
		
		// Java에서의 float, double 에서의 부동소수점 연산에서의 차이점
		// double num1 = 1 + 5.6 + 5.8;
		// float num2 = 1f + 5.6f + 5.8f;
		
		// System.out.println(num1);
		// System.out.println(num2);
		
		// boolean flag = num1 == num2 ? true : false;
		// System.out.println("flag : " + flag);		
		// 실행결과
		// 12.399999999999999
		// 12.4
		// flag : false

				
		
		// 한글 : 조합형, 완성형
		// 강 : ㄱ(초성) + ㅏ(중성) + ㅇ(종성) = 강(조합형)
		// 강 : 완성된 개별 코드 (완성형)
		// 인코딩(encoding) 방식 
		// : ISO-8859-1(서유럽어)/KSC5601/EUC-KR/MS949/unicode(UTF-8/16)
		// char ch1 = 'abcd'; // (X)
		// char ch1 = 'A'; // (O)
		// char ch1 = 65; // A
		// char ch1 = 0101; // A
		// char ch1 = 0x41; // A

		// 64 32 16 8 4 2 1
		// 64 + 1 = 65 : 1000001
		// char ch1 = 0b1000001; 
		// char ch1 = '\u0041'; // A : UTF-8
		// char ch1 = '강';
		// char ch1 = '\uac15'; // 강
		// char ch1 = '\uAC15'; // 강
		// char ch1 = '\UAC15'; // (X)
		
		// bit : binary digit(2진 소자)
		// 16진수(hexa-decimal)
		// 0 ~ 15 : 0 ~ 9 a(A:10) ~ f(F:15)
		// char ch1 = '\'; // (X)
		// char ch1 = '\\'; // \ (O)
		
		// escape sequence (특수 문자)
		// 정규표현식(regex) 
		// : https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/regex/Pattern.html
		
		// & 특수문자 : &nbsp; &lt; &copy; &reg;
		// https://html.spec.whatwg.org/multipage/named-characters.html
		// System.out.println(ch1);	
		
	}
}
