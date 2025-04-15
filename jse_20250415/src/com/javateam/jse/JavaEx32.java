package com.javateam.jse;

public class JavaEx32 {

	public static void main(String[] args) {
		
		// 짝수 순열
		for (int i = 1; i <= 10; i++) {
			
			// 짝/홀수 구분 : 2로 나눈 나머지 1/0 => 홀수/짝수
			int num = i % 2;
			
			// if (num == 1) { // 홀수일 때 일시 분기 => 2 4 6 8 10 짝수 
			if (num == 0) { // 짝수일 때 일시 분기 => 1 3 5 7 9  홀수
				continue; // 일시적인 분기 // 해당 값에 대한 statement 를 임시 skip
			}
			
			System.out.print(i + " ");
			
		} // for

	} //

}