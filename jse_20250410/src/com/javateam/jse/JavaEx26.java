package com.javateam.jse;

public class JavaEx26 {

	public static void main(String[] args) {
		
		// 1 ~ 10까지의 순열(수열)
		// for (int i = 1; ; i++) {
		
		// 정석적인 for문의 형식은 아님.
		// 코드의 성격이 비슷하거나 연관 된 코드들은 모아놓음으로 코드 가독성을 높이는 요령도 필요
		// 소통함으로 코드 스타일 통일성 필요 + 정확성 유지도 포함
		
		// for (int i = 1; ; ) {
		// i : counter(계수 변수) // 주로 반복문에 사용
		// i : integer, index 라는 의미를 정서적으로 사용 // 국룰의 느낌
		
		int i = 1;
		for(;;) {
			if (i <= 10) {
				
				//i++; // x
				//System.out.print(i + " ");		
				//i++;
				
				System.out.print(i++ + " ");	// 1 - 10 후위증가
				//System.out.print(++i + " ");	// 전위증가 먼저 더하고 시작함으로 원하는 값이 아님	// 2 - 11
				
			} else {
				break;
			}
			//i++; // 이것도 되긴 하지만, 코드 가독성이 떨어짐.
		} // for end
		
		System.out.println("");
		System.out.print(i);
		
	} // main end

} // class end
