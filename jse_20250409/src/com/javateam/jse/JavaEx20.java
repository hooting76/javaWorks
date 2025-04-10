package com.javateam.jse;

public class JavaEx20 {

	public static void main(String[] args) {
		// 1 ~ 10까지의 순열(수열)
		for (int i = 1; ; i++) { 
		// 한계 조건문 없으면 => 무한 반복문(infinite loop)
			
			System.out.print(i + " ");
			
			if (i == 10) { // 10일때 분기
				break;
			}
		} 
	}
	
}
