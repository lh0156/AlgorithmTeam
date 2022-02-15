package com.backjoon.b203.q1935;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ChanWoo {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int n = Integer.parseInt(br.readLine());
	        String prefix = br.readLine();

	        int[] arr = new int[n];
	        for(int i = 0; i < n; i++) {
	            arr[i] = Integer.parseInt(br.readLine());
	        }

	        Stack<Double> operand = new Stack<>();
	        
	        
	        int len = prefix.length();
	        
	        for(int i = 0; i < len; i++) {
	            if('A' <= prefix.charAt(i) && prefix.charAt(i) <= 'Z') {  // operand
	                double d = arr[prefix.charAt(i) - 'A'];
	                operand.push(d);
	            }else {  // operator
	            	//스택에 집어넣은 수를 2개씩 빼면서 연산
	            	//연산이 끝난수는 다시 스택에 집어넣고 다음수와 같이 연산
	                double d1 = operand.pop();
	                double d2 = operand.pop();
	                double d3 = 0.0;
	                switch(prefix.charAt(i)) {
	                    case '+' :
	                        d3 = d2 + d1;
	                        break;
	                    case '-' :
	                        d3 = d2 - d1;
	                        break;
	                    case '*' :
	                        d3 = d2 * d1;
	                        break;
	                    case '/' :
	                        d3 = d2 / d1;
	                        break;
	                }
	                operand.push(d3);
	            }
	        }
	        System.out.printf("%.2f", operand.pop());
	}
}

//https://codeung.tistory.com/271 출처
