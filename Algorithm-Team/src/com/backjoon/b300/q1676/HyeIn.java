package com.backjoon.b300.q1676;

import java.util.Scanner;

public class HyeIn {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int count = 0;
		 
		while (N >= 5) {
			N /= 5;
			count += N;
		}
		
		System.out.println(count);
	}

}
