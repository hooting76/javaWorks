package jse_20250409;

public class JavaEx16 {

	public static void main(String[] args) {
		// 반복문(repeatation, loop)
//		System.out.println(1);
//		System.out.println(2);
//      ...		
//		System.out.println(10);
		
		// 규칙성 : 초기값(1), 마지막값(10), 증가값(1)
		// for (int i = 1; i <= 10; i = i + 1) {
		// for (int i = 1; i < 11; i += 1) {
		// for (int i = 1; i <= 10; i++) {
		// for (int i = 1; i <= 10; ++i) {
		// for (int i = 10; i >= 1; i = i - 1) { // 1)
		for (int i = 10; i >= 1; i -= 1) { 
			// System.out.println(i); 
			System.out.println(11 - i); 
			// 규칙성 추출
			// 1) 10 = 1, 11 - 10
			//     9 = 2, 11 - 9
			//     8 = 3, 11 - 8
			//     7 = 4, 11 - 7
			// ...
			}
		}
	}
