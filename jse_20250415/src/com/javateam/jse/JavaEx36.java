package com.javateam.jse;

public class JavaEx36 {

	public static void main(String[] args) {

		// 국/영/수 총점/평균
		int kor = 86;
		int eng = 91;
		int math = 70;
		
		// 총점
		int sum = kor + eng + math;
		
		// 평균 => 실수
		float avg = sum / 3F; // 실수(소숫점이 표현)

		// 소숫점 2째자리에서 반올림 => 소숫점 1자리로 표현(실수) ex) 82.3
		// avg = (float)(Math.round(avg * Math.pow(10, 1)) / Math.pow(10, 1));
		avg = (float)(Math.round(avg * 10) / 10F);
		
		System.out.printf("총점 = %d%n", sum);
		// System.out.printf("평균 = %.2f%n", avg); 
		// System.out.printf("평균 = %.1f%n", avg);
		System.out.printf("평균 = %s%n", avg);
		
	} //

}