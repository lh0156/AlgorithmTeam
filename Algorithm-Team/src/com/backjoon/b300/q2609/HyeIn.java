package com.backjoon.b300.q2609;

import java.util.Scanner;

public class HyeIn {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println(num1);
		System.out.println(num2);
		
		double smallNum = num1 >= num2 ? num2 : num1;
		
		int commonDivisor = 1;
		int commonMultiple = 1;
		
		for(int i=2; i<=smallNum; i++) {
			
			if(num1 % i == 0 && num2 % i == 0) {
				commonDivisor = i;
			}
		}
		
		commonMultiple = num1 * num2 / commonDivisor;
		
		System.out.println(commonDivisor);
		System.out.println(commonMultiple);
		
	}
}
