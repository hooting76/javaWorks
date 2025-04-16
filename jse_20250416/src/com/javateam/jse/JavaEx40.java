package com.javateam.jse;

public class JavaEx40 {

	public static void main(String[] args) {
		
		// 다차원(multi-demension) 배열
		// 2차원 배열
		// 선언
		int arr2[][];
		// int [][]arr2;
		// int []arr2[];
		// int [3]arr2[2]; // x

		// 할당
		// arr2 = new int[][]; //xx
		// arr2 = new int[3][2]; // 2차원 배열 : 행렬(matrix)  // o 
		arr2 = new int[][] {
			{ 1, 2 },
			{ 3, 4 },
			{ 5, 6 }
		}; // o
			
//		arr2 = {
//			{ 1, 2 },
//			{ 3, 4 },
//			{ 5, 6 }
//		};		// x
		
		// 배열선언 + 할당
		int arr3[][] = {
			{ 1, 2 },
			{ 3, 4 },
			{ 5, 6 }
		}; // o
			
		// 개별요소 접근
		System.out.println(arr3[0][0]); // 1
		System.out.println(arr3[2][1]); // 6
	}

}
