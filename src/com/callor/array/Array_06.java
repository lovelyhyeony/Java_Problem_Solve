package com.callor.array;

import java.util.Random;

/*
 * 20명 학생의 국어, 영어, 수학, 음악 점수를 저장하기 위해 배열 선언
 * 51 ~ 100점의 점수를 생성하여 각 과목의 점수로 저장
 * 학생의 점수 총점, 평균 과목별 점수 총점, 평균을 구하여 Console에 출력
 */
public class Array_06 {

	public static void main(String[] args) {
		
		int[] intKor = new int[20];
		int[] intEng = new int[20];
		int[] intMath = new int[20];
		int[] intMusic = new int[20];
		
		Random rnd = new Random();
		
		for(int i = 0 ; i < 20 ; i++) {
			intKor[i] = rnd.nextInt(50)+51;
			intEng[i] = rnd.nextInt(50)+51;
			intMath[i] = rnd.nextInt(50)+51;
			intMusic[i] = rnd.nextInt(50)+51;
		}
		
		System.out.println("======================================================");
		System.out.println("학번\t국어\t영어\t수학\t음악\t총점\t평균");
		System.out.println("------------------------------------------------------");
		// 학생의 점수 총점, 평균 구하기
		int intStuSum = 0;
		int intStuAvg = 0;
		for(int i = 0 ; i < 20 ; i++) {
			intStuSum = intKor[i] + intEng[i] + intMath[i] + intMusic[i];
			intStuAvg = intStuSum / 4;
			
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t%d\n"
					,(i+1),intKor[i],intEng[i],intMath[i],intMusic[i]
							,intStuSum,intStuAvg);
		}
		System.out.println("------------------------------------------------------");
		
		// 과목별 총점, 평균 구하기
		int intKorSum = 0;
		int intEngSum = 0;
		int intMathSum = 0;
		int intMusicSum = 0;
		for(int i = 0 ; i < 20 ; i++) {
			intKorSum += intKor[i];
			intEngSum += intEng[i];
			intMathSum += intMath[i];
			intMusicSum += intMusic[i];		
		}
		System.out.printf("%s\t%d\t%d\t%d\t%d\n"
				,"총점",intKorSum,intEngSum,intMathSum,intMusicSum);
		System.out.printf("%s\t%d\t%d\t%d\t%d\n"
				,"평균",intKorSum/20,intEngSum/20,intMathSum/20,intMusicSum/20);
		System.out.println("======================================================");
	}
}
