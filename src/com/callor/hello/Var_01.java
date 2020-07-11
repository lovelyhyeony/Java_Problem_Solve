package com.callor.hello;

/*
 * 1. 2개의 정수형 변수 num1, num2를 선언하고 각각 30과 40을 저장
 * 두 변수에 저장된 값으로 사칙연산을 수행하고 결과를 Console에 출력
 */

public class Var_01 {
	
	public static void main(String[] args) {
		// int형 num1, num2 변수 각각 선언 후 30,40 할당
		int num1 = 30;
		int num2 = 40;
		
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)); // 덧셈연산
		System.out.println(num2 + " - " + num1 + " = " + (num2 - num1)); // 뺄셈 연산
		System.out.println(num1 + " x " + num2 + " = " + (num1 * num2)); // 곱셈 연산
		System.out.println(num2 + " / " + num1 + " = " + (num2 / num1)); // 나눗셈 연산
	}

}
