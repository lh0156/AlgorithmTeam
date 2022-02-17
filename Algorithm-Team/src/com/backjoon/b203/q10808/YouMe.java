package com.backjoon.b203.q10808;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class YouMe {
	/*
		알파벳 단어가 몇 개 있는지 구하는 프로그램
		
		설계>
		1. a부터 z까지 담을 크기가 26인 HashMap 선언
		2. BufferedReader 선언 후 입력 받은 값을 String 변수에 초기화함.
		3. for문 입력 값이 크기 반복
			> if i번째 글자가 key에 포함되는지?
				> 현재 value ++
				> 아닐 경우 value에 1 넣음.
		4. for문 char a부터 z까지 반복
			> key 중에 'a'가 있는지?
				> get을 print로 출력함.
				> 없으면 0을 출력함.  
	 */
	public static void main(String[] args) throws Exception {
		HashMap<Character, Integer> map = new HashMap<>(26);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String input = reader.readLine();
		for(int i=0; i<input.length(); i++) {
			char index = input.charAt(i);
			if(map.containsKey(index)) {
				map.put(index, map.get(index) + 1);
			} else {
				map.put(index, 1);
			}
		}
		
		for(char i='a'; i<='z'; i++) {
			if(map.containsKey(i)) {
				System.out.print(map.get(i) + " ");
			} else {
				System.out.print(0 + " ");
			}
		}
	}
}
