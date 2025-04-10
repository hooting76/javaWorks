package com.javateam.jse;

public class JavaEx17 {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 1;
		
		// 1)
		// num1++;
		// ++num2;
		
		// System.out.println("num1 : " + num1); // 2
		// System.out.println("num2 : " + num2); // 2
		
		// 2) 주의 !
		System.out.println("num1 : " + num1++); // 1 (주의)
		System.out.println("num2 : " + ++num2); // 2
		
		System.out.println("num1 : " + num1); // 2
		System.out.println("num2 : " + num2); // 2
	}

}
