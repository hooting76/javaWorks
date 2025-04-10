package com.javateam.jse;

public class JavaEx27 {

	public static void main(String[] args) {
		// 반복 조건식(한계식)에서는 여러개의 항은 사용못함
		for(int i=1, j=1; i<= 10; i++, j++){ // O
			//for(int i=1, j=1; i<= 10, j<=10; i++, j++){
			System.out.println(i + "," + j);
		}

	}

}
