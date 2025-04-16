package com.javateam.jse;

public class JavaEx38 {

	public static void main(String[] args) {
		
		int arr[] = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		// 전체 요소 나열
		/*for(int i=0; i < arr.length; i++) {
			
			System.out.println(arr[i] + " ");
			
		}// for end
		*/
		
		
		//foreach 문 (foreach loop) : enhanced for loop
		// 문법 형식) for(배열의 요소 : 배열 변수) {. . . }
		// 개별 요소 접근 : 다음 요소(next element) 접근 방식
		// 다량의(1000~) 요소 접근할때는 idx방식 보다 속도가 빠름
		// ex) 이마트의 푸드코트(일반 for문 ) <-> 구내식당(식판)(foreach)
		for(int n : arr) {
			System.out.print(n + " ");
		}
		
	}// main end

}
