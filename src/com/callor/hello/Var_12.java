package com.callor.hello;
/*
 * 1 ~ 100까지의 정수 중 짝수는 몇개 ? > console에 출력
 * 2 ~ 100까지의 정수중 3의 배수는 몇 개 ? > console에 출력
 */
public class Var_12 {

	public static void main(String[] args) {
		
		int intCnt = 0;
		
		for(int i = 1 ; i <= 100 ; i++) {
			if ( i % 2 == 0 ) {
				intCnt++;
			}
		}
		
		System.out.println("짝수의 개수 : " + intCnt);
		
		for(int i = 2 ; i <= 100 ; i++) {
			if(i % 3 == 0) {
				intCnt++;
			}
		}
		
		System.out.println("3의 배수의 개수 : " + intCnt);
	}
}
