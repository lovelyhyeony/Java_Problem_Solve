package com.callor.hello;

import java.util.Random;

/*
 * 3과목의 점수를 저장할 intKor, intEng, intMath 정수형 변수 선언
 * Random 클래스를 이용하여 51~100 범위 중의 임의의 정수를 각각 생성하여 과목 변수에 저장
 * 3과목의 총점과 평균을 계산하여 console에 출력
 */
public class Var_10 {

	public static void main(String[] args) {
		
		// 3과목의 점수를 저장할 intKor, intEng, intMath 정수형 변수 선언
		int intKor = 0;
		int intEng = 0;
		int intMath = 0;
		
		// Random클래스 이용하여 51~100 범위 중의 임의의 정수를 각각 생성하여 과목변수에 저장
		Random rnd = new Random();
		
		intKor = rnd.nextInt(50)+51;
		intEng = rnd.nextInt(50)+51;
		intMath = rnd.nextInt(50)+51;
		
		// 3과목 총점과 평균 console에 출력
		System.out.println("총점 : " + (intKor + intEng + intMath));
		System.out.println("총점 : " + (intKor + intEng + intMath)/3);
		
	}
}
