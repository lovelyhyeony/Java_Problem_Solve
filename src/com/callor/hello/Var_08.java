package com.callor.hello;


/*
 * 2 ~ 100까지의 정수중에 소수(Prime)인 정수들을 Console에 출력
 * ※ 소수(Prime) : 1과 자기 자신 이외의 약수를 가지지 않는 정수.
 * 				   1과 자기 자신 이외의 숫자로 나누었을 때 나머지가 0이 아닌 정수
 */

public class Var_08 {

	public static void main(String[] args) {
		
		// 2~100까지 반복하는 코드
		for (int i = 2 ; i <= 100 ; i++) {
			
			// i를 나누기 위해 int형 j 변수 선언과 초기화
			int j = 0;
			
			// 2~i만큼 반복하는 코드
			for(j = 2 ; j < i ; j ++) {
				// i를 j로 나눴을 때 나머지가 0이면 멈추는 코드
				if (i % j == 0) {
					break;
				}
			}
			
			// i 값과 j값이 같으면 소수
			if (i == j) {
				System.out.println(i + "는 소수");
			}
		}
	}
}
