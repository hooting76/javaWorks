package com.javateam.jse;

public class JavaEx41 {

	public static void main(String[] args) {
		// 다차원(multi-demension) 배열
		// 2차원 배열
		// 선언
		int arr2[][] = {
			{ 1, 2 },
			{ 3, 4 },
			{ 5, 6 }
		};
		
		// 전체 요소 접근
		//System.out.println("배열의 길이 : " + arr2.length);
		// 다차원 배열의 길이: 하위 차원의 갯수
		// 낱개의 전체 요소 수 x
		// ex) 2차원 배열의 길이 => 1차원 배열의 갯수
		
		// 2차원 배열의 전체 요소 갯수
		// 행(row) * 열(column)
		// arr2.length * arr2[0].length
		
		//System.out.println("2차원 배열의 전체 요소 갯수 : " + arr2.length * arr2[0].length); // row * column
		
	/*	for(int i=0; i < arr2.length; i++) { // 행
			
			for(int j=0; j < arr2[i].length; j++) { // 열 
				
				System.out.print(arr2[i][j] + " ");
				
			}
			
			System.out.println();// 줄바꿈
			
		}// 행 for
		*/
		
		//foreach // 이터레이터
		for (int arr1[] : arr2) {
			
			for(int n : arr1) {
				System.out.print(n + "");
			}
			
			System.out.println();
			
		}//
		
	}
	
}
