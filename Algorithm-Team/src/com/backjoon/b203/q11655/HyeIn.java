package com.backjoon.b203.q11655;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HyeIn {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		char[] text = reader.readLine().toCharArray();
		
		for(int i=0; i<text.length; i++) {
			
			char letter = text[i];
			
			if(letter >= 'a' && letter <= 'z') {
				
				letter += 13;
				
				if(letter > 'z') {
					letter -= 'z' - 'a' + 1;
				}
				
			} else if (letter >= 'A' && letter <= 'Z') {
				
				letter += 13;
				
				if(letter > 'Z') {
					letter -= 'Z' - 'A' + 1;
				}
								
			}
			
			System.out.print(letter);
		}
					
	}
}
