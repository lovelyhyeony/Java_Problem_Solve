package com.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * 가. intList 이름으로 Integer 형 리스트 선언
 * 나. Random 클래스 이용하여 100개의 임의의 숫자 생성하여 리스트에 추가
 * 다. 리스트에 추가된 100개의 정수를 모두 덧셈하여 Console에 출력
 * 라. 리스트에 추가된 100개의 정수 중에서 짝수 리스트를 Console에 출력
 */
public class ListEx_01 {

	public static void main(String[] args) {
		
		// intList이름으로 Integer형 리스트 선언 및 초기화
		List<Integer> intList = new ArrayList<Integer>();
		
		// Random 클래스 사용해 rnd객체 생성 및 초기화
		Random rnd = new Random();
		
		// 1~ 100개 임의 숫자 생성하여 List에 추가
		for(int i = 0 ; i < 100 ; i++) {
			int num = rnd.nextInt(100)+1;
			intList.add(num);
		}
		
		// 리스트에 추가된 100개 정수를 모두 덧셈
		int sum = 0 ;
		for(int i = 0 ; i < 100 ; i++) {
			sum += intList.get(i);
		}
		System.out.println("덧셈 결과 : " + sum);
		// >> Java_List > list/exec/List_01.java
		// >> Java_List > list/exec/ListEx_02.java 
		
		// 리스트에 추가된
		for(int i = 0 ; i < 100 ; i ++) {
			int num = intList.get(i);
			if(num % 2 == 0 ) {
				System.out.println(num);
			}
		}
		
	}
}
