package com.javateam.jse;

public class JavaEx39 {

	public static void main(String[] args) {
		
		// 배열의 초기화
		// int arr[] = new int[3];
		// int arr[] = {0, 0, 0};
		// int arr[] = {1, 2, 3};
		// int arr[] = new int[3] {1, 2, 3}; // x
		// int arr[] = new int[] {1, 2, 3}; // o
		
		int arr[];
		arr = new int[]{ 1, 2, 3};  
		// arr = { 1, 2, 3}; // x 
		// arr = new float[] { 1, 2, 3 }; // x // 나중가서 배열의 datatype 변경은 곤란함.
		// arr = (int[])new short[] { 1, 2, 3 }; // x

		System.out.println();
	}

}
