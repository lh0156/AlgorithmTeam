package com.backjoon.b201.q17413;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hyein {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 문자열 S가 주어졌을 때, 이 문자열에서 단어만 뒤집으려고 한다.
		 * 먼저, 문자열 S는 아래와과 같은 규칙을 지킨다.
		 * 알파벳 소문자('a'-'z'), 숫자('0'-'9'), 공백(' '), 특수 문자('<', '>')로만 이루어져 있다.
		 * 문자열의 시작과 끝은 공백이 아니다.
		 * '<'와 '>'가 문자열에 있는 경우 번갈아가면서 등장하며, '<'이 먼저 등장한다. 또, 두 문자의 개수는 같다.
		 * 태그는 '<'로 시작해서 '>'로 끝나는 길이가 3 이상인 부분 문자열이고, '<'와 '>' 사이에는 알파벳 소문자와 공백만 있다. 
		 * 단어는 알파벳 소문자와 숫자로 이루어진 부분 문자열이고, 연속하는 두 단어는 공백 하나로 구분한다. 태그는 단어가 아니며, 태그와 단어 사이에는 공백이 없다.
		 * 
		 */
		
		/*
		 * 1. BufferedReader 생성
		 * 2. input = 입력받은 문자열
		 * 3. result = 결과 출력용
		 * 4. index = 현재 인덱스, temp = 임시 인덱스
		 * 5. (index < 문자열 길이) 동안 반본
		 * 			> 5.1 index가 '<'를 가르킬 때 : 태그일 때(뒤집기 X)
		 * 				> temp = '>' 다음 인덱스
		 * 				> result에 그대로 붙이기
		 * 				> index = temp
		 * 			> 5.2 index가 '<'를 가르키지 않을 때 : 단어일 때(뒤집기 O)
		 * 				>  단어 다음에 태그가 있는지 확인
		 * 					> 없으면 temp = 문자열 길이
		 * 				> index ~ temp 사이 단어 split
		 * 				> 분리된 단어 수 만큼 for문
		 *	 				> reverse한 다음 result에 append
		 * 				> 마지막 공백 없애기
		 * 				> index = temp
		 * 6. 출력
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String input = reader.readLine();
		StringBuilder result = new StringBuilder();
		
		int index = 0;
		int temp = 0;
		
		while(index < input.length()) {
			
			if(input.charAt(index) == '<') {
				
				temp = input.indexOf('>', index) + 1;		
				result.append(input.substring(index, temp));				
				index = temp;
				
			} else {
				
				temp = input.indexOf('<', index);
				
				if (temp == -1) {
					temp = input.length();					
				}

				String[] txt = input.substring(index, temp).split(" ");
				
				for(String word : txt) {
					
					result.append(new StringBuilder(word).reverse().append(" "));
				}
				
				result.deleteCharAt(result.length() - 1);
				
				index = temp;
			}
			
		}
		
		System.out.print(result);
		
	}
	
}




