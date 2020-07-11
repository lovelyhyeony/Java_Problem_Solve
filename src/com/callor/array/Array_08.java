package com.callor.array;

import java.util.Random;
// Java_08 > Array_06
/*
 * 100개의 정수형 배열 선언
 * Random 클래스를 사용하여 1~100까지 임의의 수를 각각 생성하여 100개의 배열 요소에 저장
 * 한 줄에 배열 요소 5개씩 Console에 출력
 * 각 줄의 끝에 5개 요소의 합계를 계산하여 Console에 출력
 */
public class Array_08 {
	
	public static void main(String[] args) {
		
		int[] intNum = new int[100];
		Random rnd = new Random();
		
		for(int i = 0 ; i < 100 ; i++) {
			intNum[i] = rnd.nextInt(100)+1;
		}
		
		// 각 줄의 끝에 합계 계산하는 코드
		int sum = 0;
		for(int i = 0; i < 100 ; i++) {
			System.out.printf("%d\t",intNum[i]);			
			sum += intNum[i];
			if((i+1) % 5 == 0) {
				System.out.println(sum);
				sum = 0; // 계속 누적이 되지 않게 0으로 변수 초기화
			}
		}
	}
}