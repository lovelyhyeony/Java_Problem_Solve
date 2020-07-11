package com.callor.array;

import java.util.Random;

// java_06 > var_04 ,05, 06
/*
 * 100개의 정수형 배열 선언
 * Random 클래스를 사용하여 1~100까지 임의의 수를 각각 생성하여 100개의 배열 요소에 저장
 * 배열에 저장된 값 중에서 소수들을 모두 Console에 출력하시오.
 * 배열에 저장된 값 중에서 소수들의 개수가 몇 개인지 Console에 출력하시오.
 * 배열에 저장된 값 중에서 소수들을 모두 더하면 얼마인지 Console에 출력하시오.
 * 배열에 저장된 값 중에서 소수들이 몇 번 index에 저장되어 있는지 Console에 출력하시오.
 * 배열에 저장된 값 중에서 소수가 최초로 나타나는 index가 몇 번인지 Console에 출력하시오
 */
public class Array_05 {

	public static void main(String[] args) {

		int[] intNum = new int[100];
		Random rnd = new Random();

		// 1~100까지 임의의 수 배열에 저장
		for (int i = 0; i < 100; i++) {
			intNum[i] = rnd.nextInt(100) + 1;
		}

		for (int i = 0; i < 100; i++) {
			for(int j = 2 ; j < i ; j++) {
				if(intNum[i] % j == 0) {
					break;
				}
				if(intNum[i] == j) {
					System.out.println("소수 : " + intNum[i]);
				}
			}
		}

	}
}
