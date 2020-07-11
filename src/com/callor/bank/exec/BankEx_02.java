package com.callor.bank.exec;

import com.callor.bank.model.BankVO;
import com.callor.bank.service.BankServiceV1;

/*
 * 가. BankVO 클래스를 사용하여 인스턴스 배열 5개를 생성하고 초기화
 * 나. 계좌번호는 “001”로 하고 날짜는 순서대로 2020-05-01 ~ 2020-05-05 저장
 * 다. 2020-05-01과, 2020-05-03에 입금 5,000원,
 * 2020-05-02, 05-04, 05-05에 출금 1,000원을 저장
 */
public class BankEx_02 {

	public static void main(String[] args) {
		
		BankVO[] bVO = new BankVO[5];
		
		bVO[0] = new BankVO();
		bVO[1] = new BankVO();
		bVO[2] = new BankVO();
		bVO[3] = new BankVO();
		bVO[4] = new BankVO();
		
		for(int i = 0 ; i < 5 ; i++) {
			bVO[i].setNum("001");
			bVO[i].setDate("2020-05-0" + (i+1));
		}
		
		bVO[0].setInput(5000);
		bVO[2].setInput(5000);
		
		bVO[1].setOutput(1000);
		bVO[3].setOutput(1000);
		bVO[4].setOutput(1000);
		
		BankServiceV1 bService = new BankServiceV1();
		bService.bankList(bVO);
		
	}
}
