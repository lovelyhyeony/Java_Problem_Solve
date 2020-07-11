package com.callor.hello;

import java.util.Random;

/*
 * 정수형 변수 num을 선언하고 초기화
 * 임의의 정수를 변수에 저장
 * 변수에 저장된 값에 55를 곱하여 또 다른 변수 result를 선언하여 저장
 * 최종 결과값을 Console에 출력
 */

public class Var_02 {
	
	public static void main(String[] args) {
		// 정수형 변수 num을 선언 하고 초기화
		int num = 0;
		
		Random rnd = new Random();
		
		// 임의의 정수를 변수에 저장
		num = rnd.nextInt();
		
		// num변수에 저장된 값에 55를 곱한 값을
		// int형 result변수에 값을 할당
		int result = num * 55;
		
		// 최종 결과값을 보여주는 출력코드
		System.out.println("최종결과값 : " + result);
	}

}
