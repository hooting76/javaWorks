package jse_20250402;

public class JavaEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int num5 = 1E1; // duoble 형
		// int num5 = (int)1E1; // 10 10의 1승
		// int num5 = (int)1E2; // 100 10의 2승
		// int num5 = (int)1E3; // 1000 10의 3승
		
		// 부동(floating) 소숫점 실수
		// E : EXPONENTIAL(지수)
		// 가수 : mantissa
		// int num5 = (int)1e3; // 1000
		
		// double num5 = 1.2E3; // 1.2 * 10의 3승 // 1200.0
		double num5 = 1.2E-3; // 1.2 * 10의 -3승 // 0.0012
		System.out.println(num5);
		
		// 원주율
		final double num6 = 3.141592; // final 은 constant 느낌 // 상수화
		// const : 사어화(dead) 안씀 // not used <- final로 대체
		// num6 = 3.14; // 대입(assign-ment) 불가
		System.out.println(num6);
		
		// 실제 자바 원주율 상수
		System.out.println(Math.PI);
		
		long num7 = 1L; // LONG(8바이트) = L 접미사 = LONG
	}

}
