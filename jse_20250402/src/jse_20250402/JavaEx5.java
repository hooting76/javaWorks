package jse_20250402;

public class JavaEx5 {

	public static void main(String[] args) {
		// byte num2; // -128 ~ 127
		// byte num2 = 1;
		
		// byte num2 = 128; // 128(short ? x) 128을 int로 간주함
		// 정수 자료형의 값(value, literal(값, 상수, 리터럴))
		// = 기본적으로 별 언급이 없다면 int 자료형으로 간주
		
		// -128 ~ 127 : 순환 체계
		// byte num2 = (byte)128; // -128
		// byte num2 = (byte)129; // -127
		// byte num2 = (byte)-129; // 127
		// byte num2 = (byte)-130; // 126
		
		// int의 최대값, 최솟값
		// int num3 = Integer.MAX_VALUE; // 2147483647 <- int 최대값
		// int num3 = Integer.MIN_VALUE; // -2147483648 <- int 최솟값
		// 상수(constant) <- 변하지 않는 수
		
		// DOUBLE의 최대값
		// double num3 = Double.MAX_VALUE; // 1.7976931348623157E308
		double num3 = Double.MIN_VALUE; // 4.9E-324
		
		System.out.println(num3);
	}

}
