package com.backjoon.b203.q1935;

import java.util.Scanner;
import java.util.Stack;

public class HyeIn {

	public static void main(String[] args) {
		
		//1. 피연산자 개수 입력
		//2. 후위 표기식 입력
		//3. 피연산자에 대응하는 값 입력
		
		//1. Scanner 생성
		//2. 피연산자를 담을 stack 생성
		//3. N = 피연산자 개수, expr = 후위 표기식
		//4. nums = 각 알파벳에 해당하는 숫자 담을 배열
		//5. result = 연산 결과 담을 변수
		//6. N만큼 for문
		//		> nums[i]에 알파벳에 해당하는 정수 저장
		//7. expr.length() 만큼 for문
		//		> if expr.charAt(i)가 연산자인지? 피연산자인지?
		//			> 연산자 : stack에서 숫자 2개 pop해서 연산
		//			> 피연산자 : stack에 push
		//8. 출력
		
		
		
		Scanner scan = new Scanner(System.in);		
		
		Stack<Double> stack = new Stack<Double>();
		
		int N = scan.nextInt();
		String expr = scan.next();
		
		double[] nums = new double[26];
		double result = 0;
		
		for(int i=0; i<N; i++) {
			nums[i] = scan.nextDouble();
		}		

		for(int i=0; i<expr.length(); i++) {
			
			char c = expr.charAt(i);
			double front = 0;
			double back = 0;
			
			if(c < 'A' || c > 'Z') {
				
				back = stack.pop();
				front = stack.pop();
				
				switch (c) {
				case '+':
					result = front + back;
					break;
				case '-':
					result = front - back;
					break;
				case '*':
					result = front * back;
					break;
				case '/':
					result = front / back;
					break;
					
				default:
					break;
				}
				
				stack.push(result);
				
			} else {
				stack.push(nums[c - 'A']);
			}
		}
		
		System.out.printf("%.2f", stack.pop());
		
	}
}
