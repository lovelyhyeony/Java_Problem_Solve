package com.callor.hello;

/*
 * 1 ~ 100까지 범위의 숫자 중 3의 배수를 찾고 3의 배수들의 합을 구하여 Console에 출력
 */
public class Var_06 {

	public static void main(String[] args) {

		// 3의 배수들의 덧셈을 저장할 int형 sum변수 선언 및 초기화
		int sum = 0;
		
		// 1 ~ 100 범위의 반복문
		for (int i = 0 ; i < 100 ; i++) {
			// i 가 3의 배수인지 아닌지 판별하는 if문
			if(i % 3 == 0 ) {
				// i 가 3의 배수이면 덧셈 후 sum에 저장,할당
				// sum = sum + i;
				sum += i;
			}
		}
		
		// 출력하는 부분
		System.out.println("3의 배수들의 합 : " + sum);
		
	}
}
