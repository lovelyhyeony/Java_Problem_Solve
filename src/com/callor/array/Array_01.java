package com.callor.array;

import java.util.Random;

/*
 * 10개의 정수형 배열 선언
 * Random 클래스를 사용하여 1~100까지 임의의 정수를 생성하여 각각 배열 요소에 저장
 * 배열에 저장된 값을 모두 더하여 결과값을 Console에 출력
 */

public class Array_01 {

	public static void main(String[] args) {
		
		// 10개의 정수형 배열 선언
		int[] intNum = new int[10];
		
		Random rnd = new Random();
		
		// Random 클래스를 사용하여 1~100 임의의 정수 저장
		intNum[0] = rnd.nextInt(100)+1;
		intNum[1] = rnd.nextInt(100)+1;
		intNum[2] = rnd.nextInt(100)+1;
		intNum[3] = rnd.nextInt(100)+1;
		intNum[4] = rnd.nextInt(100)+1;
		intNum[5] = rnd.nextInt(100)+1;
		intNum[6] = rnd.nextInt(100)+1;
		intNum[7] = rnd.nextInt(100)+1;
		intNum[8] = rnd.nextInt(100)+1;
		intNum[9] = rnd.nextInt(100)+1;
		
		// 배열에 저장된 값 총합
		System.out.println("총합 : " + (intNum[0]+intNum[1]+intNum[2]+intNum[3]+
				intNum[4]+intNum[5]+intNum[6]+intNum[7]+intNum[8]+intNum[9]));
	}
}
