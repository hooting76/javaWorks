package com.javateam.jse;

public class JavaEx35 {

	public static void main(String[] args) {

		// 국/영/수 총점/평균
		int kor = 86;
		int eng = 91;
		int math = 70;
		
		// 총점
		int sum = kor + eng + math;
		
		// 평균
		// 소숫점 1자리로 표현(실수) ex) 82.3
		// int avg = sum / 3;
		// float avg = sum / 3;
		float avg = sum / 3F; // 실수(소숫점이 표현)
		// float avg = (float)sum / 3; // 실수(소숫점이 표현)
		// float avg = (float)(sum / 3); // 실수(소숫점 절사(손실))
		
		System.out.printf("총점 = %d%n", sum);
		// System.out.printf("평균 = %d%n", avg); // 정수
		// System.out.printf("평균 = %f%n", avg); // 실수
		System.out.printf("평균 = %.2f%n", avg); // 실수(소숫점 2자리만 표현)
		
	} //

}