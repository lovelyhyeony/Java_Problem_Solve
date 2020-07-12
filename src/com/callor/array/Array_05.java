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
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = rnd.nextInt(100) + 1;
		}

		int cnt = 0;
		int sum = 0;
		int first = 0;
		for (int i = 0; i < intNum.length; i++) {
			sum = 0;
			cnt = 0;
			first = 0;
			for (int j = 2; j <= intNum[i]; j++) {
				for (int k = 2; k <= j; k++) {
					if (j % k == 0) {
						break;
					}
					
					if (j == (k + 1)) {
						first++;
						if(first == 1 ) {
							System.out.println("최초 : " + k);
						}
						
						cnt++;
						sum += intNum[i];
						
						System.out.println("소수 : " + j);
						System.out.println("소수의 인덱스 번호 : " + i);
					}

				}
			}
            System.out.println("소수 개수 : " + cnt);
            System.out.println("소수들의 합 : " + sum);
		}

	}
}
