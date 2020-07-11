package com.callor.score.service;

import com.callor.score.model.ScoreVO;

/*
가. ScoreVO 클래스의 scores 인스턴스 배열을 필드변수로 선언.
나. ScoreEx_02에서 만든 학생 성적을 setScoreList() 메서드를 통해 scores 인스턴스 배열에 setting
다. scoreSum() method를 만들고 총점을 계산하는 코드를 작성하시오.
라. scoreAvg() method를 만들고 평균을 계산하는 코드를 작성하시오.
 */

/*
 * 가. scoreList() method를 만들고 성적 리스트를 출력하는 코드를 작성하시오.
 * 나. 학생별 총점, 평균과 과목별 총점, 평균을 Table(표 형식)로 출력하시오
 * 다. 리스트 하단의 총점과 평균 항목에 학생별 총점의 총점과, 평균의 평균을 계산하여 출력하시오
 */
public class ScoreServiceV2 {

	// scores인스턴스 배열 필드변수로 선언 
	ScoreVO[] scores;

	// setScoreList() 메서드를 통해 인스턴스배열에 setting 
	public void setScoreList(ScoreVO[] scores) {

		this.scores = scores;
	}

	// 총점 계산하는 method
	public void scoreSum() {

		for (int i = 0; i < scores.length; i++) {
			scores[i].setSum(scores[i].getKor() + scores[i].getEng() + scores[i].getMath() + scores[i].getMusic());
		}
	}

	// 평균 계산하는 method
	public void socreAvg() {

		for(int i = 0 ; i < scores.length ; i++) {
			
			scores[i].setAvg(scores[i].getSum() / 4);
		}
		
	}
	
	public void scoreList() {
		
		System.out.println("=====================================================");
		System.out.println("성적 리스트");
		System.out.println("=====================================================");
		System.out.println("학번\t국어\t영어\t수학\t음악\t총점\t평균");
		System.out.println("-----------------------------------------------------");
		
		// 학생 점수, 학생별 총점, 평균
		for(int i = 0 ; i < scores.length ; i++) {
			
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%d\n",scores[i].getName(),
					scores[i].getKor(),
					scores[i].getEng(),
					scores[i].getMath(),
					scores[i].getMusic(),
					scores[i].getSum(),
					scores[i].getAvg());
		}
		System.out.println("-----------------------------------------------------");

		// 각 과목의 총점 int형으로 선언 및 초기화
		int korSum = 0;
		int engSum = 0;
		int mathSum = 0;
		int musicSum = 0;
		
		// 각 과목의 평균 int형으로 선언 및 초기화
		int korAvg = 0;
		int engAvg = 0;
		int mathAvg = 0;
		int musicAvg = 0;
		
		// 각 과목의 총점과 평균 구하는 코드
		for(int i = 0 ; i < scores.length ; i++) {
			
			korSum += scores[i].getKor();
			engSum += scores[i].getEng();
			mathSum += scores[i].getMath();
			musicSum += scores[i].getMusic();
			
			korAvg = korSum / scores.length;
			engAvg = engSum / scores.length;
			mathAvg = mathSum / scores.length;
			musicAvg = musicSum / scores.length;
			
		}
		
		// 맨 끝에는 각 총점의 총점과
		// 평균의 평균을 구해줌!
		System.out.printf("%s\t%d\t%d\t%d\t%d\t\t%d\n","총점",korSum,engSum,mathSum,musicSum,
				(korSum + engSum + mathSum + musicSum));
		System.out.printf("%s\t%d\t%d\t%d\t%d\t\t%d\n","평균",korAvg,
				engAvg,mathAvg,musicAvg,(korAvg + engAvg + mathAvg + musicAvg) / scores.length);
		
		System.out.println("=====================================================");

	}

}
