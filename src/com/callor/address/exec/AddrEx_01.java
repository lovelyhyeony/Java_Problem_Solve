package com.callor.address.exec;

import com.callor.address.model.AddressVO;

/*
 * 가. AddressVO를 사용하여 address1, address2, address3 를인스턴스 생성하시오.
 * 나. address1, address2, address2, 3개의 인스턴스에 이름, 주소, 전화번호, 나이 저장하시오.
 */
public class AddrEx_01 {

	public static void main(String[] args) {
		
		// AddressVO 클래스를 이용해여 address1,2,3 객체를 생성한 후 
		// 초기화 해준다!
		AddressVO address1 = new AddressVO();
		AddressVO address2 = new AddressVO();
		AddressVO address3 = new AddressVO();
		
		// address1,2,3 에 이름값 세팅
		address1.setName("홍길동");
		address2.setName("이몽룡");
		address3.setName("성춘향");
		
		// address1,2,3에 주소값 세팅
		address1.setAddr("광주광역시");
		address2.setAddr("서울특별시");
		address3.setAddr("인천광역시");
		
		// 전화번호 세팅
		address1.setTel("010-111");
		address2.setTel("010-222");
		address3.setTel("010-333");
		
		// 나이 세팅
		address1.setAge(33);
		address2.setAge(23);
		address3.setAge(35);
		
	}
}
