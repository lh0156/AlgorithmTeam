package com.backjoon.b200.q1158;

import java.util.ArrayList;
import java.util.Scanner;

public class Hyein {

	public static void main(String[] args) {
		
		/*
		 * 1. Scanner 생성
		 * 2. N = 입력 받을 정수 개수, K = 공차..?
		 * 3. ArrayList list에 1~N 차례대로 저장
		 * 4. 요세푸스 수열 저장할 ArrayList 생성
		 * 5. list에서 삭제할 위치를 가르키는 index -1으로 초기화
		 * 6. N번 동안 for문
		 * 		> index를 K만큼 더한다.
		 * 		> index가 list 크기 넘어가지 않도록 모듈 연산
		 * 		> list에서 remove하고 josep에 add
		 * 		> 숫자 하나 줄었으니까 index--
		 * 7. 출력
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int K = scan.nextInt();

		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> Josep = new ArrayList<Integer>();
		
		int index = -1;
		
		for(int i = 1; i <= N; i++) {
			list.add(i);
		}
		
		while(N-- > 0) {
			
			index += K;
			index %= list.size();
			
			Josep.add(list.remove(index));
			
			index--;
			
		}
		
		System.out.print(Josep.toString().replace('[', '<').replace(']', '>'));
		
	}
}
