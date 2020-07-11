package com.callor.score.service;

import com.callor.score.model.ScoreVO;

/*
 * 가. ScoreEx_01 에서 생성한 scores 배열을 scoreList() 메서드에 매개변수로 전달하고 성적목록을
 * 출력
 * 나. 각 학생 점수의 총점과 평균을 계산하여 함께 출력하시오
 * 다. 과목별 평균은 출력하지 않습니다
 */
public class ScoreServiceV1 {

	//scores배열 매개변수로 전달!
	public void scoreList(ScoreVO[] scores) {
		
		System.out.println("=========================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------------");
		
		int sum = 0;
		for(int i = 0 ; i < scores.length ; i++) {
			
			// 학생별 총점 구하는 코드
			sum = scores[i].getKor();
			sum += scores[i].getEng();
			sum += scores[i].getMath();
			
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\n",
					scores[i].getName(),
					scores[i].getKor(),
					scores[i].getEng(),
					scores[i].getMath(),
					sum,sum/3);
		}
		
		System.out.println("=========================================");

	}
}
