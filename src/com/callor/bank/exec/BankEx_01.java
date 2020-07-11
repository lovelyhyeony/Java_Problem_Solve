package com.callor.bank.exec;

import com.callor.bank.model.BankVO;

/*
 * 가. BankVO 클래스를 사용하여 인스턴스 배열 5개를 선언하고 초기화하시오.
 * 나. 배열 요소 순서대로 계좌번호에 “001” ~ “005”저장
 * 다. 날짜 : 오늘 날짜 저장
 * 라. 계좌번호 001, 003에는 각 입금 5,000원을
 * 002, 004, 005에는 각 출금 1,000원을 저장하시오
 */
public class BankEx_01 {
	
	public static void main (String[] args) {
		
		// BankVO 클래스를 사용해 인스턴스 배열 5개 선언 및 초기화
		BankVO[] bVO = new BankVO[5];
		
		bVO[0] = new BankVO();
		bVO[1] = new BankVO();
		bVO[2] = new BankVO();
		bVO[3] = new BankVO();
		bVO[4] = new BankVO();
		
		
		// 배열 요소 순서대로 계좌번호에 저장
		bVO[0].setNum("001");
		bVO[1].setNum("002");
		bVO[2].setNum("003");
		bVO[3].setNum("004");
		bVO[4].setNum("005");
		
		// 오늘 날짜 저장
		for(int i = 0 ; i < 5 ; i++) {
			
			bVO[i].setDate("20-07-11");
		}
		
		bVO[0].setInput(5000);
		bVO[2].setInput(5000);
		
		bVO[1].setOutput(1000);
		bVO[3].setOutput(1000);
		bVO[4].setOutput(1000);
		
		
	}

}
