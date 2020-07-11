package com.callor.grade;

import java.util.Random;

/*
 * 10명 학생의 국어, 영어, 수학 점수를 저장할 정수형 배열 변수를 선언
 * Random 클래스를 사용하여 51~100까지 임의 정수를 생성하여 각 과목에 저장
 * 10명 학생의 국어, 영어, 수학 점수 리스트와 총점과 평균을 계산하여 Console에 출력
 */
public class Grade_02 {

	public static void main(String[] args) {
		
		// 10명 학생의 국어, 영어 수학 점수를 저장할 int형 배열 변수 선언
		int[] intKor = new int[10];
		int[] intEng= new int[10];
		int[] intMath= new int[10];
		
		// Random클래스를 이용해 rnd객체 생성
		Random rnd = new Random();
		
		// for반복문을 사용하여 51~100까지 임의 정수 각 과목에 저장
		for(int i = 0 ; i < 10 ; i++) {
			intKor[i] = rnd.nextInt(50)+51;
			intEng[i] = rnd.nextInt(50)+51;
			intMath[i] = rnd.nextInt(50)+51;
		}
		
		System.out.println("=======================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("=======================================");
		
		int[] sum = new int[10];
		int[] avg = new int[10];
		for(int i = 0 ; i < 10 ; i++) {
			sum[i] = intKor[i] + intEng[i] + intMath[i];
			avg[i] = sum[i] / 3;
		}
		
		// 국어, 영어 수학 점수 리스트 출력
		for(int i = 0 ; i < 10 ; i++) {
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\n",(i+1),intKor[i],intEng[i],intMath[i],sum[i],avg[i]);
		}
		System.out.println("=======================================");

		
	}
}
