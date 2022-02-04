package com.backjoon.b200.q9093;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hyein {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//1. 입력받을 문장 수 T 입력받기
		//2. T만큼 for문
		//		- 문장 공백으로 자르기
		//		- 단어 뒤집어서 문자열에 붙이기
		//		- 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(reader.readLine());
		
		for(int n=0; n<T; n++) {
			
			String[] txt = reader.readLine().split(" ");
			
			StringBuilder temp = new StringBuilder();
			
			for(String word : txt) {
				
				temp.append(new StringBuilder(word).reverse().append(" "));

			}
			
			System.out.println(temp.toString().trim());
		}
	}

}
