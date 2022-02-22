package com.backjoon.b203.q10824;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChanWoo {
	public static void main(String[] args) throws IOException {
		
		//네 자연수 A, B, C, D가 주어진다. 이때, A와 B를 붙인 수와 C와 D를 붙인 수의 합을 구하는 프로그램을 작성하시오.
		//두 수 A와 B를 합치는 것은 A의 뒤에 B를 붙이는 것을 의미한다. 즉, 20과 30을 붙이면 2030이 된다.
		
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		String input = rd.readLine();
		
		String[] str = input.split(" ");
		
		int result = Integer.parseInt(str[0] + str[1]) + Integer.parseInt(str[2] + str[3]);
		
		System.out.println(result);
		
		
	}
}
