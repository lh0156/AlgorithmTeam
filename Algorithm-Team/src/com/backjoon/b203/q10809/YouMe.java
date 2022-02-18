package com.backjoon.b203.q10809;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class YouMe {
	/*
		알파벳 위치를 리턴하는 프로그램
		- HashMap 사용
		
		설계
		1. BufferdReader 선언 후 입력값을 변수에 초기화함.
		2. 입력의 길이만큼 HashMap을 선언함.
		3. for문 입력의 길이 반복
			> if i번째 글자를 key로 하는 값이 value에 없는지? 
				> 없으면 i번째 글자를 key로 value를 i로 저장함.
				
		4. for문 a부터 z까지
			> if문 map의 key 중 i가 있는지?
				> 있으면 print로 value를 출력
				> 없으면 -1 출력
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>(input.length());
		
		for(int i=0; i<input.length(); i++) {
			if(!map.containsKey(input.charAt(i))) {
				map.put(input.charAt(i), i);
			}
		}
		
		for(char i='a'; i<='z'; i++) {
			if(map.containsKey(i)) {
				System.out.printf("%d ", map.get(i));
			} else {
				System.out.print("-1 ");
			}
		}
	}
}
