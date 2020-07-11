package com.callor.hello;

import java.util.Random;

/*
 * 정수형 변수 num1 선언하고 임의의 정수를 저장
 * num1에 저장된 값이 짝수인지 홀수인지 판별하여 Console에 출력하시오
 */

public class Var_03 {

	public static void main(String[] args) {

		Random rnd = new Random();
		
		// 임의의 정수를 int형 num1에 할당(저장,복사)
		int num1 = rnd.nextInt();

		// 임의의 정수가 짝수인지 아닌지 판별해주는 코드
		if (num1 % 2 == 0) {
			System.out.println(num1 + "는 짝수");
		} else {
			System.out.println(num1 + "는 짝수가 아니다.");
		}
	}
}
