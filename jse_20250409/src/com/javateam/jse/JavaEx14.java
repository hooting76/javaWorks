package com.javateam.jse;

public class JavaEx14 {

	public static void main(String[] args) {
		int score = 47;
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
		
		System.out.println(credit);
	}

}
