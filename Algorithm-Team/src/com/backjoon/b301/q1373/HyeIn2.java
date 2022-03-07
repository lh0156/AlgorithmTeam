package com.backjoon.b301.q1373;

import java.util.Scanner;

public class HyeIn2 {

	public static void main(String[] args) {
		
		//커밋메시지 바꾸고 싶다.
		Scanner scan = new Scanner(System.in);
		
		String num = scan.next();
		StringBuilder result = new StringBuilder();
		
		if(num.length() % 3 == 1) {
			result.append(num.charAt(0));
		}
		
		if(num.length() % 3 == 2) {
			result.append((num.charAt(0) - '0') * 2 + (num.charAt(1) - '0'));
		}
		
		for(int i=num.length() % 3; i<num.length(); i+=3) {
			result.append((num.charAt(i) - '0') * 4 + (num.charAt(i+1) - '0') * 2 + (num.charAt(i+2) - '0'));
		}
		
		System.out.println(result);
	}
}
