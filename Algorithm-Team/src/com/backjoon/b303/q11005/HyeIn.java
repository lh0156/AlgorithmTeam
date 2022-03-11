package com.backjoon.b303.q11005;

import java.util.Scanner;

public class HyeIn {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		StringBuilder result = new StringBuilder();
		
		int N = scan.nextInt();
		int B = scan.nextInt();
		
		while(N != 0) {
			
			int remainder = N % B;
			
			if(remainder < 10) {
				result.append(remainder);
			} else {
				result.append((char)('A' + remainder - 10));
			}
			
			N /= B;
		}
		
		System.out.println(result.reverse());
	}
}
