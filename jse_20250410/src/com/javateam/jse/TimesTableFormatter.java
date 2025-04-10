package com.javateam.jse;

import java.util.Formatter;

public class TimesTableFormatter {

	public static void main(String[] args) {

		// 구구단 : 2 ~ 9단 for문 활용
		// 출력) 2 * 1 = 2
		//      ...(중략)...
		//      9 * 9 = 81
		
		// 요구사항)
		// 1) 2~9 단의 변수
		// 2) 단 계산(연산:곱셈) 반복문 : for
		// 3) 반복문 내에서 횟수(time) 중간 결과 출력
		//    ex) 2 * 1 = 2
		// 4) 단 계산 간의 간격(줄 띄워쓰기)
		
		// ex) 카운터 변수 i,j,k ... 
		
		// int num = 2; // 2단 부터 시작
		
		// "단"만 열거(출력)
		// step-1) 2 3 4 5 6 7 8 9
		// step-2) 2 * 1 = 2, 
		// 3 * 1 = 3 
		// ...(중략)...
		// 9 * 1 = 9
		for (int num = 2; num <= 9; num++) {
			
			// step-1)
			// System.out.print(num + " ");
			
			// step-2)
			// System.out.println(num + " * 1 = " + num * 1);
			// System.out.printf("%d * 1 = %d%n", 
			//					num, num * 1);
			
			// step-3) 
			// 2 * 1 = 2, 
			// 2 * 2 = 4, 
			// ... (중략) ...
			// 9 * 9 = 81
			
			for (int time = 1; time <= 9; time++) {
				
				// System.out.println(num + " * 1 = " + num * 1);
				// System.out.printf("%d * %d = %d%n", 
				// 				  num, time, num * time);
				
				// Formatter 활용-1)
//				Formatter fmt = new Formatter();
//				Formatter fmtStr = fmt.format("%d * %d = %d", num, time, num * time);
//				System.out.println(fmtStr);
//				fmt.close();
				
				// Formatter 활용-2)
				Formatter fmtStr 
					= new Formatter().format("%d * %d = %2d", num, time, num * time);
				System.out.println(fmtStr);
				
			} // for time (n단의 계산)
			
			// System.out.println("-----------"); // 단간의 구분
			System.out.println(); // 단간의 구분
			
		} // for num
		
	} // main

}