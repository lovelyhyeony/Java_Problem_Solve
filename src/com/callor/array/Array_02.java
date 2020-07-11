package com.callor.array;

import java.util.Random;

/*
 * 10개의 정수형 배열 선언
 * Random 클래스를 사용하여 1~100까지 임의의 정수를 생성하여 각각 배열 요소에 저장
 * 배열에 저장된 값 중에서 짝수들만 Console에 모두 출력
 * 배열에 저장된 값 중에서 짝수가 모두 몇 개인지 Console에 출력
 * 배열에 저장된 값 중에서 짝수들을 모두 더하면 얼마인지 Console에 출력
 * 배열에 저장된 값 중에서 짝수들이 몇 번 index에 저장되어 있는지 Console에 출력
 * 배열에 저장된 값 중에서 짝수가 최초로 나타나는 index가 몇 번인지 Console에 출력
 */

public class Array_02 {

	public static void main(String[] args) {

		// 10개의 정수형 배열 선언
		int[] intNum = new int[10];

		Random rnd = new Random();

		// 임의의 정수 배열요소에 저장
		for (int i = 0; i < 10; i++) {
			intNum[i] = rnd.nextInt(100)+1;
		}
		
		// 짝수들만 Console에 출력
		// 짝수 개수 출력
		int cnt = 0;
		for(int i = 0 ; i < 10; i++) {
			if(intNum[i] % 2 == 0) {
				System.out.println(intNum[i] + "는 짝수");
				cnt++; // 짝수 개수 세는 코드
			}
		}
		
		System.out.println("짝수 개수 : " + cnt);
		System.out.println("==================================");
		
		// 짝수들의 합
		int sum = 0;
		for(int i = 0 ; i < 10; i++) {
			if(intNum[i] % 2 == 0) {
				sum += intNum[i];
			}
		}
		
		System.out.println("짝수들의 합 : " + sum);
		System.out.println("==================================");
		
		// 짝수들의 인덱스 번호
		for(int i = 0 ; i < 10; i++) {
			if(intNum[i] % 2 == 0) {
				System.out.println("짝수들의 인덱스 번호 : " + i);
			}
		}
		
		System.out.println("==================================");
		
		// 짝수가 최초로 나타나는 인덱스
		for(int i = 0 ; i < 10; i++) {
			if(intNum[i] % 2 == 0) {
				System.out.println("짝수들의 인덱스 번호 : " + i);
				break;
			}
		}
	}
}
