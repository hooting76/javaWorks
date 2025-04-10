package com.javateam.jse;

public class JavaEx18 {

	public static void main(String[] args) {
		/*
		// 2씩 증가 => 홀수(odd) : 1,3,5,7,9
		// for (int i = 1; i <= 10; i = i + 2) {
		// for (int i = 1; i <= 10; i += 2) {
		// 2씩 증가 => 짝수(even) : 2,4,6,8,10
		// for (int i = 2; i <= 10; i += 2) {
		// for (int i = 9; i >= 1; i -= 2) { // 홀수 역순 나열 
		 */
		for (int i = 10; i >= 2; i -= 2) { // 짝수 역순 나열
			
			System.out.print(i + " ");
			
		}
	}
}
