package com.callor.array;

import java.util.Random;

/*
 * 20개의 정수형 배열 선언하고
 * Random 클래스를 사용하여 51~100까지 임의의 정수를 생성하여 각각 배열 요소에 저장
 * 배열에 저장된 값 중에서 3 또는 5의 배수를 Console에 모두 출력
 * 배열에 저장된 값 중에서 3 또는 5의 배수가 몇 개인지 Console에 출력
 * 배열에 저장된 값 중에서 3 또는 5의 배수들을 모두 더하면 얼마인지 Console에 출력
 */
public class Array_04 {
	
	public static void main(String[] args) {
		
		int[] intNum = new int[20];
		Random rnd = new Random();
		
		// Random클래스로 51~100임의의 정수 배열에 저장
		for(int i = 0 ; i < 20 ; i++) {
			intNum[i] = rnd.nextInt(50) + 51 ;
		}
		
		// 배열에 저장된 값이 3또는 5의 배수인지 판별해서 출력하는 코드
		for(int i = 0; i < 20 ; i ++) {
			if(intNum[i] % 3 == 0 || intNum[i] % 5 == 0) {
				System.out.println("3 또는 5의 배수 : " + intNum[i]);
			}
		}

		System.out.println("================================");
		
		// 배열에 저장된 값이 3 또는 5의 배수인지 판별한 후
		// 개수를 세는 코드
		int cnt = 0;
		for(int i = 0 ; i < 20 ; i++) {
			if(intNum[i] % 3 == 0 || intNum[i] % 5 == 0) {
				cnt++;
			}			
		}
		System.out.println("3 또는 5의 배수 개수 : " + cnt);
		System.out.println("================================");
		
		// 배열에 저장된 값이 3 또는 5의 배수인지 판별한 후
		// 총 합을 구하는 코드
		int sum = 0;
		for(int i = 0; i < 20 ; i++) {
			if(intNum[i] % 3 == 0 || intNum[i] % 5 == 0) {
				sum += intNum[i];
			}
		}
		System.out.println("3 또는 5의 배수 총합 : " + sum);	
	}
}