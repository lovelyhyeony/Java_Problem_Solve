package com.callor.score.exec;

import java.util.Random;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreServiceV2;

/*
 * 가. ScoreVO를 사용하여 성적을 보관할 scores 배열 10개 생성하고 초기화하시오.
 * 나. 학번은 1번부터 순서대로 저장하고
 * 다. 학생의 각 과목점수를 Random 클래스를 사용하여
 * 	51 ~ 100까지 중 임의의 점수로 생성하여 저장
 */
public class ScoreEx_02 {

	public static void main(String[] args) {
		
		// 성적을 보관할 scores배열 10개 생성
		ScoreVO[] scores = new ScoreVO[10];

		// Random 클래스이용하여 rnd 객체 생성 및 초기화
		Random rnd = new Random();
		
		// 배열 초기화
		for(int i = 0 ; i < scores.length ; i++) {
			scores[i] = new ScoreVO();
 		}
		
		// 이름에는 학번 1번부터 저장
		// rnd의 nextInt() method를 호출하여 51~100 임의수 뽑아서 저장
		for(int i = 0 ; i < scores.length ; i++) {
			scores[i].setName("" + (i+1)); // 문자열로 쉽게 만드는 방법 : "" + 
			scores[i].setKor(rnd.nextInt(50)+51);
			scores[i].setEng(rnd.nextInt(50)+51);
			scores[i].setMath(rnd.nextInt(50)+51);
			scores[i].setMusic(rnd.nextInt(50)+51);
		}
		
		ScoreServiceV2 sS = new ScoreServiceV2();
		
		sS.setScoreList(scores);
		sS.scoreSum();
		sS.socreAvg();
		sS.scoreList();
	}
}
