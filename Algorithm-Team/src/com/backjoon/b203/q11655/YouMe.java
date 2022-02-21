package com.backjoon.b203.q11655;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class YouMe {
	/*
		ROT13을 적용하는 프로그램
		-알파벳만 13글자씩 밀어서 출력함,
		
		설계
		1. BufferedReader
		2. input 변수에 입력 값을 초기화함.
		3. for문 입력 값 길이 반복
			> i번째 글자를 letter에 초기화함.
			> if letter이 알파벳인지?
				> letter + 13을 출력함.
				> 아니면 그냥 출력
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		
		for(int i=0; i<input.length(); i++) {
			char code = encrypt(input.charAt(i));
			System.out.print(code);
		}
	}

	private static char encrypt(char letter) {
		String pattern = "^[a-zA-Z]*$";
		
		if(Pattern.matches(pattern, letter + "")) {
			char code = (char)(letter + 16);
			
			if(!Pattern.matches(pattern, code + "")) {
				return code -= 26;
			} else {
				return (char)(letter + 13);
			}
		} else {
			return letter;
		}
	}
}
