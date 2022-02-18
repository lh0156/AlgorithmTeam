package com.backjoon.b203.q10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HyunWoo {

	public static void main(String[] args) {
		
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] arr = null;
		try {
			arr = scan.readLine().toCharArray();
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		
		for(char i = 'a' ; i <= 'z' ; i++) {
			int count = 0;
			for(int j=0; j<arr.length ;j++) {
				if(i == arr[j]) {
					sb.append(count).append(" ");
					break;
				}else if(j == arr.length-1) {
					sb.append(-1).append(" ");
					break;
				}else {
					count++;					
				}
			}
		}
		
		System.out.println(sb.toString().substring(0,sb.length()-1));

	}

}
