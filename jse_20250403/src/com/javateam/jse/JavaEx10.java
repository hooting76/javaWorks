package com.javateam.jse;

import java.util.Scanner; // ex) 원산지 표기

public class JavaEx10 {

	public static void main(String[] args) {

		System.out.print("점수 입력 : ");
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();		
		
		// 정수 <- 입력(문자열) : 형변환(casting) 
		// str 값이 "정수"가 아니면 에러 유발
		int score = Integer.parseInt(str);
		
		System.out.println("점수 출력 : " + score);
		
		sc.close(); 
	}

}
