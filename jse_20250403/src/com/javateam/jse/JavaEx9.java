package com.javateam.jse;

import java.util.Scanner; // ex) 원산지 표기

public class JavaEx9 {

	public static void main(String[] args) {

		// System.in : 표준(std) 입력 : 키보드 입력
		
		System.out.print("입력 : ");
		// java.util.Scanner sc 
		//	= new java.util.Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();		
		System.out.println("출력 : " + str);
		
		sc.close(); // 자원(키보드 입력) 반납(close)
	}

}
