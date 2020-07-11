package com.callor.hello;

import java.util.Random;

/*
 * 정수형 변수 num1, num2 선언
 * Random 클래스를 이용하여 1~100까지 중의 임의의 정수를 생성하여 num1과 num2에 저장
 * num1과 num2를 사칙 연산 수행 후 각 결과가 짝수인지 판별하여 Console에 출력하시오.
 */

public class Var_05 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		// + 1 해준 이유는 괄호안에 숫자는 0 ~ 99까지이기때문에 +1 해줌으로써 1 ~ 100이 됌
		int num1 = rnd.nextInt(100) + 1; // 임의의 정수 int형 num1에 할당
		int num2 = rnd.nextInt(100) + 1; // 임의의 정수 int형 num2에 할당
		
		int intPlus = num1 + num2; // 덧셈 연산
		int intMinus = num1 - num2; // 뺄셈 연산
		int intTime = num1 * num2; // 곱셈 연산
		int intDevied = num1 / num2; // 나눗셈 연산
		
		// 덧셈 결과가 짝수인지 아닌지 판별해주는 코드
		if (intPlus % 2 == 0 ) {
			System.out.println("덧셈 결과는 짝수 : " + intPlus);
		}
		// 뺄셈 결과가 짝수인지 아닌지 판별해주는 코드
		if (intMinus % 2 == 0 ) {
			System.out.println("뺄셈 결과는 짝수 : " + intMinus);
		}
		// 곱셈 결과가 짝수인지 아닌지 판별해주는 코드
		if (intTime % 2 == 0 ) {
			System.out.println("곱셈 결과는 짝수 : " + intTime);
		}
		// 나눗셈 결과가 짝수인지 아닌지 판별해주는 코드
		if (intDevied % 2 == 0 ) {
			System.out.println("나눗셈 결과는 짝수 : " + intDevied);
		}
	}
}
