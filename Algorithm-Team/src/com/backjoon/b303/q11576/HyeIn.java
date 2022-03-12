package com.backjoon.b303.q11576;

import java.util.Scanner;
import java.util.Stack;

public class HyeIn {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		int m = scan.nextInt();
		
		int aNum = 0;
		Stack<Integer> bDigits = new Stack<>();
		
		for(int i=0; i<m; i++) {
			aNum += Math.pow(A, m - i -1) * scan.nextInt();
		}
		
		while(aNum != 0) {
			bDigits.push(aNum % B);
			aNum /= B;
		}
		
		while(!bDigits.empty()) {
			System.out.print(bDigits.pop() + " ");
		}
		
	}
}
