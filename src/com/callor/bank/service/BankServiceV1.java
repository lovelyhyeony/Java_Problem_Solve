package com.callor.bank.service;

import com.callor.bank.model.BankVO;

/*
 * 가. bankList()를 만들어 BankEx_02에서 만든 배열을 매개변수로 전달받아 리스트를 Console에 출력
 * 나. 리스트를 출력할 때 잔액을 다음과 같이 계산하여 출력
 */
// >>>Java_class > service > BankSerivceV2
public class BankServiceV1 {

	public void bankList(BankVO[] bVO) {
		
		System.out.println("계좌번호\t날짜\t입금\t출금\t잔액");
		
		int valance = 0 ;
		for(int i = 0 ; i < 5 ; i ++) {
			
			// 잔액 계산 (이해 안되면 진위표 그리기)
			valance += bVO[i].getInput();
			valance -= bVO[i].getOutput();
			
			System.out.printf("%s\t%s\t%d\t%d\t%d\n",bVO[i].getNum()
					,bVO[i].getDate()
					,bVO[i].getInput()
					,bVO[i].getOutput()
					,valance);
		}
	}
}
