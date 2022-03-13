package com.backjoon.b303.q11653;

import java.util.Scanner;

public class HyeIn {
	
	private static final int MAX = 10000000;
	private static boolean[] isNotPrime = new boolean[MAX+1];

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		int N = scan.nextInt();
		
		setPrime();
		
		printPrimeFactor(N);
	}

	private static void printPrimeFactor(int N) {
		
		for(int i=2; i<=N; i++) {
			if(!isNotPrime[i]) {
				while(N % i == 0) {
					System.out.println(i);
					N /= i;					
				}
			}
		}
	}

	private static void setPrime() {
				
		for(int i=2; i<=Math.sqrt(MAX); i++) {
			if(!isNotPrime[i]) {
				for(int j=i*i; j<=MAX; j+=i) {
					isNotPrime[j] = true;
				}				
			}
		}
		
	}
}
