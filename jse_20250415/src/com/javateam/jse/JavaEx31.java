package com.javateam.jse;

public class JavaEx31 {

	public static void main(String[] args) {
		
		int cnt = 1;
		int sum = 0; 
		
		//기간에 대한 / -동안
		// for (; cnt <= 10;)
		while (cnt <= 10) {
			
			//System.out.print(cnt + " ");
			// sum = sum + cnt;
			//sum += cnt;
			//cnt++;
			
			//case-2)
			//sum += cnt++;
			//sum += ++cnt;
			
			sum += cnt;
			
			System.out.printf("1~%d 까지의 중간 합계 = %d\n", cnt, sum);
			
			cnt++;
		}
		
		System.out.println("\n1 - 10 까지의 합계 : "+ sum);
		
	}

}
