package com.callor.hello;

/*
 * 1 부터 100까지의 정수를 한 줄에 5개씩 끊어서 Console에 출력하기
 */

public class Var_13 {
	
	public static void main(String[] args) {
		
		for(int i = 1 ; i <= 100; i++) {
			System.out.printf("%d\t",i);
			if ( i % 5 == 0) {
				System.out.println();
			}
		}
	}

}
