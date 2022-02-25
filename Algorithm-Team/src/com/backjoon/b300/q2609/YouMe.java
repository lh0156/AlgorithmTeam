package com.backjoon.b300.q2609;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class YouMe {
	/*
		최대 공약수와 최소 공배수 출력하는 프로그램
		- 최소 공약수(gcd): a, 두 수를 a로 나눈 나머지; b, c
		- 최대 공배수(lcm); a*b*c
		
		설계>
		1. BufferedReader 생성
		2. 입력 받은 값을 쪼개서 input 배열에 초기화
		3. num 배열로 형변환 후 sort() 메소드로 정렬
		4. gcd와 lcm 선언
		5. for문 num[0] 반복
			> if문 두 수를 i로 나눠 0이 되는지?
				> gcd에 초기화함.
		6. lcm = gcd * num[0]/gcd * num[0]/gcd
		7. gcd와 lcm 출력 
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] input = reader.readLine().split(" ");
		int[] num = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(num);
		
		int gcd = 0;
		int lcm = 0;
		
		for(int i=1; i<=num[0]; i++) {
			if(num[0] % i == 0 
					&& num[1] % i == 0) {
				gcd = i;
			}
		}
		lcm = gcd * (num[0]/gcd) * (num[1]/gcd);
		
		System.out.printf("%d%n%d", gcd, lcm);
	}
}
