package com.javateam.jse;
import java.util.Scanner;

public class JavaEx15 {

	public static void main(String[] args) {
		// 점수 입력부
		System.out.print("점수 입력 : ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		sc.close();
		// int score = 47;
		char credit = 'F';
		
		// score = score / 10;
		score /= 10;
		
		switch (score) { // 나눈 몫
		
			case 10 : 
			case  9 : credit = 'A'; break;
			case  8 : credit = 'B'; break;
			case  7 : credit = 'C'; break;		
			case  6 : credit = 'D'; break;
			default : credit = 'F'; break;
		
		} // switch
		
		// System.out.println(credit);
		// System.out.println("학점 : " + credit);
		System.out.printf("학점 : %c%n", credit);
	}

}
