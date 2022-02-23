package com.backjoon.b203.q11656;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class YouMe {
	/*
		문자열의 모든 접미사를 사전순으로 정렬한 다음 출력하는 프로그램
		- ArrayList, 재귀함수 사용
		
		설계>
		1. ArrayList, index 필드에 변수로 선언함.
		2. BufferedReader, suffix 배열 생성함. 
		3. 입력 값을 input 변수에 초기화함.
		4. for문 input의 길이 반복
			> substring으로 문자를 i번째 글자까지 잘라 i번째 배열에 초기화함.
			> i번째 suffix를 매개로 setSeq메소드 호출함.
		5. setSeq 메소드
			> for문 list의 사이즈 반복
				> if문 suffix의 첫번째 글자가 list의 i번째의 첫번째 글자보다 작은지?
					> if문 list의 i-1번째의 첫번째 글자보다 큰지? 
						> list의 i번째 요소에 suffix를 추가함. 
							> index를 0으로 선언하고, 리턴함.
						> 작지 않을 경우 index++ setSeq호출함.
		6. for문 ArrayList 반복 출력
	 */
	private static ArrayList<String> list;
	private static int index;
	
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		
		String[] suffix = new String[input.length()];
		list = new ArrayList<>(input.length());
		
		for(int i=0; i<input.length(); i++) {
			suffix[i] = input.substring(i);
			setSeq(suffix[i]);
		}
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	private static void setSeq(String suffix) {
		if(list.size() == 0) {
			list.add(suffix);
			return;
		}
		
		for(int i=0; i<list.size(); i++) {
			if(suffix.charAt(index) < list.get(i).charAt(index)) {
				if(suffix.charAt(index) > list.get(i-1).charAt(index)
						&& list.size() == 1) {
					list.add(0, suffix);
					index = 0;
					return;
					
				} else {
					index++;
					setSeq(suffix);
				}
			}
		}
	}
}
