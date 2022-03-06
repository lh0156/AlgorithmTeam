package com.backjoon.b301.q1373;

import java.util.Scanner;

public class HyeIn {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String num = scan.next();
		int length = num.length();
		StringBuilder result = new StringBuilder();
		
		for(int i=0; i<length; i++) {
			int n = 0;
			while(true) {
				n += Math.pow(2, (length - i - 1) % 3) * (num.charAt(i) - '0');
				if(((length - i - 1) % 3) == 0){
					result.append(n);
					break;
				}
				i++;
			}
		}
		
		System.out.println(result);
		
	}
}
