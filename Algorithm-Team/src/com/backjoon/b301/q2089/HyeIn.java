package com.backjoon.b301.q2089;

import java.util.Scanner;

public class HyeIn {

	public static void main(String[] args) {
		
		/*
		 * 자바는 음수 나눗셈에서 음수 나머지를 허용함.
		 *   3  /   2  =  1... 1
		 *   3  / (-2) = -1... 1
		 * (-3) /   2  = -1...-1
		 * (-3) / (-2) =  1...-1
		 * 
		 * 나눗셈 나머지가 양수가 되도록 나눗셈을 해야 한다.
		 * 	-> 나누어 떨어지지 않으면 몫을 올림으로 계산
		 */
		
		Scanner scan = new Scanner(System.in);
		
		StringBuilder result = new StringBuilder();
		int N = scan.nextInt();
		
		if(N == 0) {
			result.append(0);
		}
		
		//else로 묶는 게 나은 지 아닌지 고민...
		while(N != 0) {
			result.append(Math.abs(N % (-2)));
			N = (int) Math.ceil((double)N / -2);
		}

		System.out.println(result.reverse());
		
	}
}
