package com.javateam.jse;

public class TimeTableWhile {

	public static void main(String[] args) {
		
		// ex) 2 * 1 = 2 ----- 9 * 9 = 81
		int num = 2; //단
		int time = 1; //획
		
		while(num <= 9) {
			time = 1; // time while문에 대한 초기화가 필요
			
			while(time <= 9) {
				System.out.printf("%d * %d = %d\n", num, time, num * time);
				time++;
			} //while time end
			
			System.out.println();
			num++;
			
		} //while num end
		
	}

}
