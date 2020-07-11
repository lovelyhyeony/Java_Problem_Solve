package com.callor.hello;

/*
 * 임의의 이름으로 정수형 변수 1개를 선언
 * 1 ~ 100중에서 임의의 정수 1개를 변수에 저장
 * 변수에 저장된 값이 3의 배수, 또는 5의 배수인지 판별하여 Console에 출력
 */

import java.util.Random;

public class Var_04 {

	public static void main(String[] args) {

		Random rnd = new Random();

		// 1~100까지 임의의 정수를 int형 num에 저장
		int num = rnd.nextInt(100) + 1;

		// 3의 배수인지 아닌지 판별하는 코드
		if (num % 3 == 0) {
			System.out.println(num + "3의 배수");
		} else {
			System.out.println(num + "3의 배수가 아님");
		}

		// 5의 배수인지 아닌지 판별하는 코드
		if (num % 5 == 0) {
			System.out.println(num + "5의 배수");
		} else {
			System.out.println(num + "5의 배수가 아님");
		}
	}
}
