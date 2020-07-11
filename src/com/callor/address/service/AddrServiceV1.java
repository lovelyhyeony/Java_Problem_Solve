package com.callor.address.service;

import com.callor.address.model.AddressVO;

/*
 * 가. AddressVO 배열을 매개변수로 전달받아 주소록을 출력하는 addrList() 메서드를 작성
 */
public class AddrServiceV1 {

	public void addrList(AddressVO[] addrList) {
		
		System.out.println("=========================================");
		System.out.println("이름\t전화\t\t주소\t나이");
		System.out.println("-----------------------------------------");
		
		for(int i = 0 ; i < addrList.length; i++) {
			System.out.printf("%s\t%s\t\t%s\t%d\n",addrList[i].getName(),
					addrList[i].getTel(),addrList[i].getAddr(),
					addrList[i].getAge());
		}
		
		System.out.println("=========================================");

	}
}
