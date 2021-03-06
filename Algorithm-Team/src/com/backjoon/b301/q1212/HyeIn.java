package com.backjoon.b301.q1212;

import java.util.Scanner;

public class HyeIn {

	private static String[] binary= {"000", "001", "010", "011", "100", "101", "110", "111"};
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String num = scan.next();
		StringBuilder result = new StringBuilder();
		
		for(int i=0; i<num.length(); i++) {
			result.append(binary[num.charAt(i) - '0']);
		}
				
		System.out.println(result.substring(cutZero(result)));
	}

	private static int cutZero(StringBuilder result) {
		
		int index = 0;
		while(index < result.length() && result.charAt(index) == '0') {
			index++;
		}

		if(index >= result.length()) {
			index--;
		}
		
		return index;
	}
}
