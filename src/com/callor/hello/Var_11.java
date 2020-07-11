package com.callor.hello;

import java.util.Random;

/*
 * 3과목의 점수를 저장할 floatKor, floatEng, floatMath 실수형 변수 선언
 * Random 클래스를 이용하여 51~100 범위 중의 임의의 정수를 각각 생성하여 과목 변수에 저장
 * 3과목의 총점과 평균을 계산하여 console에 출력
 */
public class Var_11 {

	public static void main(String[] args) {
		
		// 실수형변수선언
		float floatKor = 0;
		float floatEng = 0;
		float floatMath = 0;
		
		// Random 클래스를 이용 51~100범위 중의 임의의 정수를 변수에 저장
		Random rnd = new Random();
		
		floatKor = rnd.nextInt(50)+51;
		floatEng = rnd.nextInt(50)+51;
		floatMath = rnd.nextInt(50)+51;
		
		// 3과목 총점, 평균 Console에 출력
		System.out.println("총점 : " + (floatKor + floatEng + floatMath));
		System.out.println("평균 : " + (floatKor + floatEng + floatMath)/3);
	}
	
}
