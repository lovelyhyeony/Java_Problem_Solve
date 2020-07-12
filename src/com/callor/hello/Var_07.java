package com.callor.hello;
/*
 * 임의의 이름으로 정수형 변수 선언
 * Random클래스를 사용하여 100~1000 사이에 있는 임의의 정수를 생성하여 저장
 * 변수에 저장된 정수값에서 10%를 제외한 값을 구하여 Console에 출력
 */
import java.util.Random;

public class Var_07 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		// 100 ~ 1000
		int intTax = (rnd.nextInt(10)+1) * 100;
		
		// 세금 포함된 가격
		System.out.println("부가가치세 포함된 가격 : " + intTax);
		// 세금 뺀 가격
		System.out.println("세금제외 가격 : " + (int)(intTax / 1.1));
		// 세금 가격
		System.out.println("세금 : " + (int)(intTax - (intTax / 1.1)));
		
	}

}
