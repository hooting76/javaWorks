package com.javateam.jse;

public class JavaEx42 {

	public static void main(String[] args) {
		
		
		// 가변배열 => c 언어 에서는 pointer
		// 행:고정(필수) / 열: 가변(optional)
		int arr2[][] = new int[3][]; //o
		//int arr2[][] = new int[][2]; //x
		
		//arr2[0] = new int[5];
		arr2[0] = new int[] {1, 2, 3, 4, 5 };
		arr2[1] = new int[] {6, 7, 8 };
		arr2[2] = new int[] {9, 10 };
		
		
		//foreach // 이터레이터
		for (int arr1[] : arr2) {
			
			for(int n : arr1) {
				System.out.print(n + "");
			}
			
			System.out.println();
			
		}//arr2 for end
		
	}

}
