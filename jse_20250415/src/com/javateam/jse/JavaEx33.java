package com.javateam.jse;

public class JavaEx33 {

	public static void main(String[] args) {

		label_start:
		for (int i = 2; i <= 9; i++) {
			
			for (int j = 1; j <= 9; j++) {
				
				if (j == 5) {
					break label_start;
					// break;
				}
				
				System.out.printf("%d x %d = %d%n", i, j, i*j);
			}
			
			System.out.println();
		} // 
		
	} // main

}