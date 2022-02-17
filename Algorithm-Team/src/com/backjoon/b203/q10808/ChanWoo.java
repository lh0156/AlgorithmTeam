package com.backjoon.b203.q10808;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChanWoo {
	public static void main(String[] args) throws IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		String input = rd.readLine();
		
		int[] ch = new int[123];
		
		for(int i = 0; i <ch.length; i++) {
			ch[i] = 0;
		}
		
		for(int i = 0; i < input.length(); i++) {
			int num = input.charAt(i);
			
			ch[num] = ch[num] + 1;
			
		}
		
		for(int i = 97; i<123; i++) {
			System.out.print(ch[i] + " ");
		}
		
	}
}
