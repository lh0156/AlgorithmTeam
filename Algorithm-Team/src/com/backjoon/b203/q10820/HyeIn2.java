package com.backjoon.b203.q10820;

import java.util.Scanner;

public class HyeIn2 {

	public static void main(String[] args) {
		
		//Scanner nextLine()으로 받으면 NoSuchElement(java.util.NoSuchElementException) 에러 뜸
		//nextLine() 함수는 더 이상 입력받을 줄이 없을 경우 에러를 발생시킵니다.
		//while((input = scan.nextLine()) != null) 구문을
		//while(scan.hasNextLine()) input = scan.nextLine(); 로 바꿔야함
		
		Scanner scan = new Scanner(System.in);
		
		String input = "";
		
		while(scan.hasNextLine()) {
			
			input = scan.nextLine();
			
			int lower = 0;
			int upper = 0;
			int num = 0;
			int space = 0;
			
			for(int i=0; i<input.length(); i++) {
				
				char letter = input.charAt(i);
				
				if(letter >= 'a' && letter <= 'z') {
					lower++;
				} else if(letter >= 'A' && letter <= 'Z') {
					upper++;
				} else if(letter >= '0' && letter <= '9') {
					num++;
				} else {
					space++;
				}
			}
			
			System.out.printf("%d %d %d %d\n", lower, upper, num, space);
		}
	}
}
