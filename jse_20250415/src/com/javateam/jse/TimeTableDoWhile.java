package com.javateam.jse;

public class TimeTableDoWhile {

	public static void main(String[] args) {

		// 결과 형식) 2 x 1 = 2 ...(중략)... 9 x 9 = 81
		int num = 2; // 단
		int time = 1; // ~ 번째
		
		do { // just do it!!!
			// time = 1; // 초기화 (주의)
			do {
				
				System.out.printf("%d x %d = %d%n", 
						           num, time, num * time);
				time++;
				
			} while (time <= 9);
			
			System.out.println();
			num++;
			time = 1; // 초기화 (주의)
		
		} while (num <= 9); 
		
	} // main

}