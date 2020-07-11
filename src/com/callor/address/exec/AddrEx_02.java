package com.callor.address.exec;

import com.callor.address.model.AddressVO;
import com.callor.address.service.AddrServiceV1;

/*
 * 가. AddressVO를 사용하여 5개의 인스턴스 배열을 addrList 이름으로 선언하고 초기화
 * 나. 친구 5명의 이름, 주소, 전화번호, 나이를 배열에 각각 저장
 */
//Java_Class2/src/com/biz/service/AddrServiceV1
public class AddrEx_02 {

	public static void main(String[] args) {

		// AddressVO클래스를 사용해 인스턴스 배열 addrList선언
		AddressVO[] addrList = new AddressVO[5];

		// 초기화 해주는 코드
		for (int i = 0; i < addrList.length; i++) {
			addrList[i] = new AddressVO();
		}

		// 이름
		addrList[0].setName("홍길동");
		addrList[1].setName("이몽룡");
		addrList[2].setName("성춘향");
		addrList[3].setName("이효리");
		addrList[4].setName("유재석");
		
		// 주소
		addrList[0].setAddr("광주광역시");
		addrList[1].setAddr("인천광역시");
		addrList[2].setAddr("부산광역시");
		addrList[3].setAddr("제주특별자치도");
		addrList[4].setAddr("서울특별시");
		
		//전화번호
		addrList[0].setTel("010-111");
		addrList[1].setTel("010-222");
		addrList[2].setTel("010-333");
		addrList[3].setTel("010-444");
		addrList[4].setTel("010-555");
		
		//나이
		addrList[0].setAge(35);
		addrList[1].setAge(27);
		addrList[2].setAge(25);
		addrList[3].setAge(22);
		addrList[4].setAge(46);
		
		AddrServiceV1 aService = new AddrServiceV1();
		aService.addrList(addrList);
	}
}
