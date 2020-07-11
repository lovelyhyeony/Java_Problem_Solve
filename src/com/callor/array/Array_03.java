package com.callor.array;

import java.util.Random;

/*
 * 20개의 정수형 배열 선언하고
 * Random 클래스를 사용하여 51~100까지 임의의 정수를 생성하여 각각 배열 요소에 저장
 * 배열에 저장된 값 중에서 3의 배수만 Console에 모두 출력하시오.
 * 배열에 저장된 값 중에서 3의 배수가 몇 개인지 Console에 출력하시오.
 * 배열에 저장된 값 중에서 3의 배수들을 모두 더하면 얼마인지 Console에 출력하시오.
 * 배열에 저장된 값 중에서 3의 배수가 몇 번 index에 저장되어 있는지 Console에 출력하시오.
 * 배열에 저장된 값 중에서 3의 배수가 최초로 나타나는 index가 몇 번인지 Console에 출력하시오
 */
public class Array_03 {

	public static void main(String[] args) {
		
		int[] intNum = new int[20];
		Random rnd = new Random();
		
		// Random클래스를 사용하여 20개 배열에 저장하는 반복문
		for(int i = 0 ; i < 20 ; i++) {
			intNum[i] = rnd.nextInt(50)+51;
		}
		
		// 3의 배수만 Console에 출력하는 코드
		for(int i = 0 ; i < 20 ; i++) {
			if(intNum[i] % 3 == 0)
				System.out.println("3의 배수 : " + intNum[i]);
		}
		
		System.out.println("==============================");
		
		// 3의 배수가 몇개인지 출력하는 코드
		int cnt = 0;
		for(int i = 0 ; i < 20 ; i++) {
			if(intNum[i] % 3 == 0) {
				cnt++;
			}
		}
		System.out.println("3의 배수 개수 : " + cnt);
		
		System.out.println("==============================");
		
		// 3의 배수들의 합
		int sum = 0;
		for(int i = 0 ; i < 20 ; i++) {
			if(intNum[i] % 3 == 0) {
				sum += intNum[i];
			}
		}
		System.out.println("3의 배수들의 합 : " + sum);
		
		System.out.println("==============================");
		
		// 3의 배수들의 인덱스 번호
		for(int i = 0 ; i < 20 ; i++) {
			if(intNum[i] % 3 == 0) {
				System.out.println("3의 배수 인덱스 번호 : " + i);
			}
		}
		
		System.out.println("==============================");
		
		// 3의 배수 최초의 인덱스 번호
		for(int i = 0 ; i < 20 ; i++) {
			if(intNum[i] % 3 == 0) {
				System.out.println("3의 배수가 최초로 나타난 인덱스 번호 : " + i);
				break;
			}
		}
	}
}
