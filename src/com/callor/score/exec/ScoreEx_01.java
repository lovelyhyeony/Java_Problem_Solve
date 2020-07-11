package com.callor.score.exec;

import java.util.Random;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreServiceV1;

/*
 * 가. ScoreVO를 사용하여 성적을 저장할 인스턴스 배열 20개를 scores 이름으로 생성하고 초기화.
 * 나. 국어, 영어, 수학 점수를 Random 클래스를 사용하여 51 ~ 100까지 중 임의의 정수를 생성하여 저
장
 * 다. 이름은 배열의 위치 번호(0~19)를 문자열로 변환하여 저장하시오.
 */
public class ScoreEx_01 {

	public static void main(String[] args) {
		
		// ScoreVO클래스 사용하여 scores객체 배열생성
		ScoreVO[] scores = new ScoreVO[20];
		
		// 초기화
		for(int i = 0 ; i < scores.length ; i++) {
			scores[i] = new ScoreVO();
		}
		
		// Random클래스를 사용하여 rnd객체 생성과 초기화
		Random rnd = new Random();
		
		// 51 ~ 100까지 임의의 정수와 이름 생성 저장
		for(int i = 0; i < scores.length ; i++) {
			scores[i].setName(""+(i+1));
			scores[i].setKor(rnd.nextInt(50)+51);
			scores[i].setEng(rnd.nextInt(50)+51);
			scores[i].setMath(rnd.nextInt(50)+51);
		}
		
		ScoreServiceV1 sService = new ScoreServiceV1();
		sService.scoreList(scores);
		
	}
}
