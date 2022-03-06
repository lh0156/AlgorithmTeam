package com.backjoon.b301.q17087;

import java.util.Scanner;

public class HyeIn2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] distances = new int[N];
		int S = scan.nextInt();
		
		for(int i=0; i<N; i++) {
			distances[i] = Math.abs(S - scan.nextInt());
		}
		
		int answer = distances[0];

		for(int i=1; i<N; i++) {
			answer = getGcd(answer, distances[i]);
		}
		
		System.out.println(answer);
	}
	
	private static int getGcd(int a, int b) {
		if(b==0) return a;
		return getGcd(b, a%b);
	}
}
