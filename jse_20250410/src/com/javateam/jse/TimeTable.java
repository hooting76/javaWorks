package com.javateam.jse;

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
		
		//구구단 반복문 시작
		for(FirstNum=1; FirstNum <=19; FirstNum++) { 
		// 앞 단수 for문 / 2단부터 시작
			for(LastNum=1; LastNum<=19; LastNum++) { 
			// 뒷 단수 for문
				int comp = FirstNum * LastNum;
				System.out.println(FirstNum+" * "+ LastNum + " = " + comp);
			}
			
			// 앞 단 변경될 때 구분을 위함. // 마지막 19단은 해당x
			if(FirstNum != 19){
				System.out.println("");
				System.out.println("=================");
				System.out.println("");
			}else {
				break;
			}
			
		}// for end

	}// main end

}// class end
