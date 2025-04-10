package jse_20250409;

public class JavaEx13 {

	public static void main(String[] args) {
		int score = 93;
		char credit = 'F';
		
		switch (score) {
		
		// case score >= 80 (X)
		// case 80 .. 90 : (X)
		// case 80 ~ 90 : (X)
		// if (score == 90) 에 해당 => case 90 => 1:1
		// if (score >= 90 && score <= 100)
		// => 다(多):1
		case 91 : case 92 : case 93 :
		case 94 : case 95 : case 96 :
		case 97 : case 98 : case 99 :
		case 100 :	
		case 90 : credit = 'A'; break;
		case 80 : credit = 'B'; break;
		case 70 : credit = 'C'; break;		
		case 60 : credit = 'D'; break;
		// default 60 : // (X)
		// 기본값 : if문의 else와 유사
		// default : credit = 'F'; break;
		default : credit = 'F'; break;
		// 작성 위치 : 문법적으로는 위치 무관하지만 대개(권장)
		// 첫번째/마지막 위치 작성 권장
		
		} // switch
		
		System.out.println(credit);
	}
	
}
