// 3월27일 학습 내용

// 줄 단위 주석
// 단축키 ctrl + 7 또는 ctrl + / (토글키)

// package : 묶음(class, 열거형(enum), 인터페이스(interface), etc)
// 자주색/오렌지 글자 => 키워드, 예약어
// token : 일정한 구분자(delimeter, separator)에 의해 토막난 코드 일부분.
// 검정색/흰색 => 사용자어(custom word)
// 패키지 : "." 상위/하위 패키지(폴더) 구분자  
// ex: 경기도.성남시.분당구.금곡동

package com.javateam.jse; // 페키지명 ";" => 문장 종결(끝)  

// public : 접근 제한자(지시자/제어자/변경자 : access modifier)
// 보안 관련한 예약어 / 접근 권한 조절
// public 은 가장 개방적 접근
// private 은 패쇄적 
// class : 참조 자료형(reference data-type)의 한 종류.
// JavaEx2 : 클래스명
// ex: 학원이름(클래스명) 학원(클래스 단위)

// { }: 중괄호 / brace 
// => 프로그램 구성단위 (클래스/메소드/etc...)의 시작/끝(범위) 

public class JavaEx2 { // 클래스 시작

	// main 메소드(method) => 이것으로 인해 실행(run)이 가능함
	// ㄴ 자동 완성 : main + ctrl + space 
	// static : 메모리(영역) 주소가 (고)정적 => 불변의 중요 코드
	// void : 메소드(함수)의 return 값의 자료형 없음

	// main : 메소드(함수)명 => 반드시 main 이라는 명칭만 사용
	// ㄴ 실행을 위한 특수 목적 메소드
	
	// () : 소괄호(parenthesis)
	// ㄴ 메소드의 인자부(매개변수부)
	
	// string : 문자열 클래스(참조자료형)
	// [] : 대괄호(bracket) => 배열(array)
	// args : 변수(variable) => arguments(인자)의 약자

	public static void main(String[] args) { // main 메소드 시작
		System.out.println("자바");
	} // main 메소드 끝
	// 코드 블럭(block: 한 메소드 / 클래스 / etc...) 
	// 양파 껍질 구조(onion skin structure) looks like html?

} // 클래스 끝
