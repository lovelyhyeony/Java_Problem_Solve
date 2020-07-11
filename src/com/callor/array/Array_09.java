package com.callor.array;

import java.util.Random;

/*
 * 100개의 정수형 배열 선언
 * Random 클래스를 사용하여 1 ~ 100까지 임의의 수를 각각 생성하여 100개의 배열 요소에 저장
 * 한 줄에 배열 요소 5개씩 Console에 출력
 * 각 줄의 끝에 5개 요소의 합계를 계산하여 Console에 출력
 * 세로 방형으로 합계를 구하여 Console에 출력
 */
public class Array_09 {
	public static void main(String[] args) {
		
		int[] intNum = new int[100];
		Random rnd = new Random();
		
		for(int i = 0 ; i < 100 ; i++) {
			intNum[i] = rnd.nextInt(100)+1;
		}
		
		System.out.println("======================================");
		int rowSum = 0;
		int columnSum = 0;
		for(int i = 0 ; i < 100 ; i++) {
			System.out.printf("%d\t",intNum[i]);
			rowSum += intNum[i];
			if((i+1) % 5 == 0) {
				System.out.println(rowSum);
				rowSum = 0;
			}
		}
		System.out.println("---------------------------------------");
	}
}
