package com.javateam.jse;

public class JavaEx34 {

	public static void main(String[] args) {

		// 국/영/수 총점/평균
		int kor = 80;
		int eng = 90;
		int math = 70;
		
		// 총점
		int sum = kor + eng + math;
		
		// 평균
		int avg = sum / 3;
		
		System.out.printf("총점 = %d%n", sum);
		System.out.printf("평균 = %d%n", avg);
		
	} //

}