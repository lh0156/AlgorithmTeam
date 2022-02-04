package com.backjoon.b200.q9093;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HyunWoo {

//	문자열 " " split 각각 loop 돌리며 뒤집기
// 문자열을 뒤집어 String 에 저장 후 \n 추가


	public static void main(String[] args) {
		
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		String[] words;
		StringBuilder result= new StringBuilder();
		int count = 0;
		
		try {
			count = Integer.parseInt(scan.readLine());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}

		for(int i =0;i<count ;i++) {
			try {
				words = scan.readLine().split(" ");
				result.append(wordTurnOver(words));
			} catch (IOException e) {
				e.printStackTrace();
			}
			result.append("\n");
		}
		System.out.println(result);
	}

	private static StringBuilder wordTurnOver(String[] words) {
		StringBuilder result= new StringBuilder();
		for(int i=0 ; i< words.length;i++) {
			String word = words[i];
			for(int j = word.length()-1; j>=0;j--) {
				result.append(word.charAt(j));
			}
			result.append(" ");
		}
		return result;
	}

}
