package com.callor.grade;

import java.util.Random;

/*
 * 10명의 학생의 국어 점수를 저장할 정수형 변수 10개를 선언하고
 * (kor1, kor2, ...kor10)
 * Random 클래스를 사용하여 51~100까지 중의 임의 정수를 생성하여 각각의 변수에 저장
 * 10명 학생의 국어 점수 리스트와 총점과 평균을 계산하여 Console에 출력
 */
public class Grade_01 {

	public static void main(String[] args) {
		
		// 10명 학생 점수 저장할 int형 변수 10개 선언
		int kor1;
		int kor2;
		int kor3;
		int kor4;
		int kor5;
		int kor6;
		int kor7;
		int kor8;
		int kor9;
		int kor10;
		
		// Random 클래스 객체 생성
		Random rnd = new Random();
		
		// 임의의 정수 51 ~ 100까지 각각 변수에 저장
		kor1 = rnd.nextInt(50)+51;
		kor2 = rnd.nextInt(50)+51;
		kor3 = rnd.nextInt(50)+51;
		kor4 = rnd.nextInt(50)+51;
		kor5 = rnd.nextInt(50)+51;
		kor6 = rnd.nextInt(50)+51;
		kor7 = rnd.nextInt(50)+51;
		kor8 = rnd.nextInt(50)+51;
		kor9 = rnd.nextInt(50)+51;
		kor10 = rnd.nextInt(50)+51;
		
		// 국어점수 출력
		System.out.println("=======================");
		System.out.println("국어 점수 리스트");
		System.out.println("=======================");
		System.out.println("1번 : " + kor1);
		System.out.println("2번 : " + kor2);
		System.out.println("3번 : " + kor3);
		System.out.println("4번 : " + kor4);
		System.out.println("5번 : " + kor5);
		System.out.println("6번 : " + kor6);
		System.out.println("7번 : " + kor7);
		System.out.println("8번 : " + kor8);
		System.out.println("9번 : " + kor9);
		System.out.println("10번 : " + kor10);
		
		// 국어점수 총점
		int sumKor = kor1;
		sumKor += kor2;
		sumKor += kor3;
		sumKor += kor4;
		sumKor += kor5;
		sumKor += kor6;
		sumKor += kor7;
		sumKor += kor8;
		sumKor += kor9;
		sumKor += kor10;

		System.out.println("=======================");
		System.out.println("총점 : " + sumKor);
		System.out.println("평균 : " + sumKor / 10);
		
		
	}
}
