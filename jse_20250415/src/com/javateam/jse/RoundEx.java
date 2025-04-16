package com.javateam.jse;

public class RoundEx {

	public static void main(String[] args) {

		// float num = 82.33333f;
		float num = 82.55555f;
		// System.out.println(Math.round(num)); 
		// System.out.printf("%.1f%n", (float)Math.round(num));
		// 기본) 소숫점 1째자리에서 반올림 => 정수 성분만 값이 존재. 소숫점은 손실
		
		// 소숫점 2째자리에서 반올림 => 정수/소숫점 1자리 표현
		// System.out.println(Math.round(num * 10) / 10f);
		// System.out.println(Math.round(num * 1E1) / 1E1f);
		System.out.println(Math.round(num * Math.pow(10, 1)) / Math.pow(10, 1));
		
		// 소숫점 3째자리에서 반올림 => 정수/소숫점 2자리 표현
		// System.out.println(Math.round(num * 100) / 100f);
		// System.out.println(Math.round(num * 1E2) / 1E2f);
		System.out.println(Math.round(num * Math.pow(10, 2)) / Math.pow(10, 2));
		
		// 소숫점 4째자리에서 반올림 => 정수/소숫점 3자리 표현
		// System.out.println(Math.round(num * 1000) / 1000f);
		// System.out.println(Math.round(num * 1E3) / 1E3f);
		System.out.println(Math.round(num * Math.pow(10, 3)) / Math.pow(10, 3));
		
		// 승수(square) 표현 Math.pow() 메소드(함수) 활용
		System.out.println(Math.pow(10, 1));
		System.out.println(Math.pow(10, 2));
		System.out.println(Math.pow(10, 3));
		
	}

}