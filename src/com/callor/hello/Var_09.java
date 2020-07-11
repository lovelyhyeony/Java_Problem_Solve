package com.callor.hello;

/*
 * 2 ~ 100까지의 정수 중에 소수(Prime)인 정수들을 모두 더하여
 * 합계를 Console에 표시 
 */

public class Var_09 {

	public static void main(String[] args) {
		
		// int형 sum변수 선언 및 초기화
		int sum = 0;
		
		// 2 ~ 100까지 반복문
		for( int i = 2 ; i <= 100 ; i++ ) {
			
			// int형 j 변수 선언 및 초기화
			int j = 0; 
			
			// j 가 i 만큼 도는 반복문
			for( j = 2 ; j < i ; j++) {
				
				// i를 j로 나눴을 때 나머지가 0이면 멈추라는 명령문
				if(i % j == 0) {
					break;
				}
			}
			
			// i와 j의 값이 같으면
			// sum에 i를 누적해서 합하는 코드
			if ( i == j) {
				sum += i;
			} 
		}
		
		// for문이 끝났을 때 전체 합을 보여주는 코드
		System.out.println("소수들의 합 : " + sum);
	}
	
}
