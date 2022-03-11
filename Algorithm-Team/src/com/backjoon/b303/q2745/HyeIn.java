package com.backjoon.b303.q2745;

import java.util.Scanner;

public class HyeIn {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String N = scan.next();
		int B = scan.nextInt();
		int result = 0;
		
		for(int i=0; i<N.length(); i++) {

			int num = N.charAt(i);
			
			if(num < 'A' || num > 'Z') {
				num -= '0';
			} else {
				num -= 'A' - 10;				
			}
		
			result += Math.pow(B, N.length() - i - 1) * num;
		}
		
		System.out.println(result);
		
	}
}
