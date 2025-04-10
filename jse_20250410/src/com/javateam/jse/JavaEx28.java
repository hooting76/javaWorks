package com.javateam.jse;

public class JavaEx28 {

	public static void main(String[] args) {
		
		// 1-10 까지 합계
		// 필요 조건 : 요구사항 파악 및 문서화(제일 중요)
		// 1) 1-10 계수 변수(counter) : cnt(count), i => cnt
		// 2) 합계 : sum, total => sum
		// 3) 계수 변수 활용 => 반복문 => 합계 // flow chart
		
		int cnt; // 계수변수 : 1-10
		int sum = 0; // 합계변수 : 1-10
		// 별도로 for문의 한계치 변수를 지정할 수 있음.
		
		// 1부터 10까지 계수하는 for문
		// 이걸 활용해설 펙토리얼 계산 가능할 듯.
		for(cnt=1; cnt <= 10; cnt++) {
			// System.out.println(cnt + " "); //계수 변수 점검
			sum = sum + cnt;
			System.out.printf("1 ~ %d 까지 합계: %d%n", cnt, sum);
		}// for end
		
	} // main end

}// class end
