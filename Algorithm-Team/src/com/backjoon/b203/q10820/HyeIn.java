package com.backjoon.b203.q10820;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HyeIn {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String input = "";
		
		while((input = reader.readLine()) != null) {
						
			int lower = 0;
			int upper = 0;
			int num = 0;
			int space = 0;
			
			for(int i=0; i<input.length(); i++) {
				
				char letter = input.charAt(i);
				
				if(letter >= 'a' && letter <= 'z') {
					lower++;
				} else if(letter >= 'A' && letter <= 'Z') {
					upper++;
				} else if(letter >= '0' && letter <= '9') {
					num++;
				} else {
					space++;
				}
			}
			
			System.out.printf("%d %d %d %d\n", lower, upper, num, space);
		}
	}
}
