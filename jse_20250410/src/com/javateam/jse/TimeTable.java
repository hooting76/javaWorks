package com.javateam.jse;
import java.util.Scanner;

public class TimeTable {

	public static void main(String[] args) {
		
		// for문 활용
		// 구구단 구현 : 1-19 단
		// 출력: 1 * 1 = 1
		// 		...
		//      19 * 19 = 361
		
		// 요구사항
		// 1) 1-19 단의 변수
		// 2) 단 계산 반복문
		// 3) 반복문 내에서 획수 중간 결과 출력 ex) 2 * 1 = 2
		// 4) 단 계산 간의 구분감 필요
		
		int FirstNum ; // 구구단 앞 번호에 대한 초기화
		int LastNum; // 구구단 뒷 번호에 대한 초기화
		
		System.out.print("몇단 까지 출력할지를 입력하세요 : ");
		Scanner inputNum = new Scanner(System.in);
		int NumLayer = inputNum.nextInt();		
		inputNum.close();		
		
		//구구단 반복문 시작
		for(FirstNum=1; FirstNum <= NumLayer; FirstNum++) { 
			// 앞 단수 for문
			for(LastNum=1; LastNum <= NumLayer; LastNum++) { 
				// 뒷 단수 for문
				System.out.println(FirstNum+" * "+ LastNum + " = " + (FirstNum * LastNum));
			}
			
			// 앞 단 변경될 때 구분을 위함. // 마지막 단은 출력 끝 출력
//			if(FirstNum != NumLayer){
//				System.out.println("");
//				System.out.println("=================");
//				System.out.println("");
//			}else {
//				System.out.println("====출력 끝====");
//				break;
//			}
			// 9999단 입력시 시간: 
			// 1) 8분 52초 724 / 2) 8분 48초 029 / 3)8분 42초 30
			
		}// for end

	}// main end

}// class end
