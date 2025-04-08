package com.javateam.jse;
import java.util.Scanner;

public class JavaEx12 {

	public static void main(String[] args) {
		// 문장(statement)
		// 순차문, 조건문, 반복문, (조건/반복)분기문
		
		// 순차 실행 : 위의 문장 -> 아래 문장 (위에서 부터 아래 방향으로 순차 진행)
		// System.out.println(1+2);
		// System.out.println(3+4);
		
		// 조건문
		System.out.print("점수 입력 : ");
		Scanner inputNum = new Scanner(System.in);
		int score = inputNum.nextInt();		
		inputNum.close();
		
		char 	credit 	= 'F';
		
		score /= 10;
		
		// 합격, 불합격 분류
		//	if(score >= 60) {
		//		System.out.println("합격");
		//	}else {
		//		// 불합격 중에서도 점수에 따라 과락, 재시험 여부 분류
		//		if(score < 40) {
		//			System.out.println("불합격(과락)");
		//		}else {
		//			System.out.println("불합격(재시험)");
		//		}
		//	}
		
		// 점수에 따른 학점(credit) 부여하기
		// A : 90 ~ 100, B : 80 ~ 89
		// C : 70 ~ 79 , D: 60 ~ 69
		// F : 0 ~ 59
		
		// 삼항연산자
		// credit = score == 9 || score == 10 ? 'A' : 'F';
		credit = score == 9 || score == 10 ? 'A' :
				 score == 8 ? 'B' :
				 score == 7 ? 'C' :				 
				 score == 6 ? 'D' :	'F';		 
		
//		if(score >= 6) {
//			// 특정 점수 이상으로 D 이상의 학점 부여
//			if( score >= 9 || score == 10 ) {
//				credit = 'A';
//			}else if( score >= 8) {
//				credit = 'B';
//			}else if( score >= 7) {
//				credit = 'C';
//			}else if( score >= 6 ) {
//				credit = 'D';
//			}
//		}
		
		System.out.println("학점 : " + credit);		
	}
}
