package com.callor.grade;

import java.util.Random;

/*
 * 가. 학생 20명, 국어 영어 수학 음악 미술 과목을 저장할 배열을 선언하시오.
 * 나. 각 과목에 임의의 점수를 저장
 * 다. 학생별 총점, 평균을 계산
 * 라. 과목별 총점, 평균 계산
 * 마. 성적 일람표를 Table 형식을 갖추어 Console에 출력하시오.
 */
public class Grade_03 {
	
	public static void main(String[] args) {
		
		// 각 과목 점수 저장할 int형 배열 선언
		int[] intKor = new int[20];
		int[] intEng= new int[20];
		int[] intMath= new int[20];
		int[] intMusic= new int[20];
		int[] intArt= new int[20];
		
		// Random클래스로 객체 생성
		Random rnd = new Random();
		
		// 각 과목의 임의의 점수를 저장
		for(int i = 0 ; i < 20 ; i++) {
			intKor[i] = rnd.nextInt(50)+51;
			intEng[i] = rnd.nextInt(50)+51;
			intMath[i] = rnd.nextInt(50)+51;
			intMusic[i] = rnd.nextInt(50)+51;
			intArt[i] = rnd.nextInt(50)+51;
		}
		
		// 학생별 점수 총점, 평균
		int stdSum[] = new int[20];
		int stdAvg[] = new int[20];
		for(int i = 0 ; i < 20 ; i++) {
			
			stdSum[i] = intKor[i];
			stdSum[i] += intEng[i];
			stdSum[i] += intMath[i];
			stdSum[i] += intMusic[i];
			stdSum[i] += intArt[i];
			
			stdAvg[i] = stdSum[i] / 5;
		}
		
		// 과목별 점수 총점, 평균
		int subKorSum = 0;
		int subEngSum = 0;
		int subMathSum = 0;
		int subMusicSum = 0;
		int subArtSum = 0;
		
		for(int i = 0 ; i < 20 ; i++) {
			subKorSum += intKor[i];
			subEngSum += intEng[i];
			subMathSum += intMath[i];
			subMusicSum += intMusic[i];
			subArtSum += intArt[i];
		}
		
		System.out.println("============================================================");
		System.out.println("성적 일람표");
		System.out.println("============================================================");
		System.out.println("학번\t국어\t영어\t수학\t음악\t미술\t총점\t평균");
		System.out.println("------------------------------------------------------------");
		
		for(int i = 0 ; i < 20 ; i++) {
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\n",(i+1),intKor[i],
					intEng[i],intMath[i],intMusic[i],intArt[i],stdSum[i],stdAvg[i]);
		}
		System.out.println("------------------------------------------------------------");

		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\n","과목 총점",subKorSum,subEngSum,
				subMathSum,subMusicSum,subArtSum);
		
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\n","과목 평균",subKorSum / 5,subEngSum / 5,
				subMathSum / 5,subMusicSum / 5,subArtSum / 5);
		
		System.out.println("============================================================");

	}

}