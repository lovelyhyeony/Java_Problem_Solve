package com.callor.hello;
/*
 * 2개의 정수형 변수 num1, num2를 선언하여 각각 7과 1을 저장
 * 저장된 변수를 사용하여 구구단 7단을 Console에 출력
 */
public class VarGuGu_02 {

	public static void main(String[] args) {
		
		int num1 = 7;
		int num2 = 1;
		
		System.out.println(num1 + "x" + num2 + "=" + (num1 * num2++));
		System.out.println(num1 + "x" + num2 + "=" + (num1 * num2++));
		System.out.println(num1 + "x" + num2 + "=" + (num1 * num2++));
		System.out.println(num1 + "x" + num2 + "=" + (num1 * num2++));
		System.out.println(num1 + "x" + num2 + "=" + (num1 * num2++));
		System.out.println(num1 + "x" + num2 + "=" + (num1 * num2++));
		System.out.println(num1 + "x" + num2 + "=" + (num1 * num2++));
		System.out.println(num1 + "x" + num2 + "=" + (num1 * num2++));
		System.out.println(num1 + "x" + num2 + "=" + (num1 * num2++));
	}
	
}
