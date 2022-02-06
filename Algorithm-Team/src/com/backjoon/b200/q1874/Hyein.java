package com.backjoon.b200.q1874;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Hyein {
	
    public static void main(String[] args) throws IOException {
        //1. 입력 받을 정수 개수 n 입력 받기
        //2. 입력 받은 수 중 가장 큰 수 start 변수 선언, 0으로 초기화
        //3. n번 동안 for문
        //  - 입력 받은 정수 num 저장
        //  - if(num > start) 
    	//		- start ~ 1에서 num 까지 for문
    	//			- start+1 ~ num push
    	//			- result에 "+" append
    	//		- start = num
        //  - else if(stack.peek() != num ) "NO" 출력. 프로그램 종료
        //  - stack.pop()
    	//	- result에 "-" append
    	//4. 출력
    	
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	
    	int n = Integer.parseInt(reader.readLine());
    	
    	Stack<Integer> stack = new Stack<Integer>();
    	StringBuilder result = new StringBuilder();
    	
    	int start = 0;

    	for(int i = 0; i < n; i++) {
    		
    		int num = Integer.parseInt(reader.readLine());
    		
    		if(num > start) {
    			
    			for(int j = start + 1; j <= num; j++) {
    				
    				stack.push(j);
    				result.append("+").append("\n");
    				
    			}
    			
    			start = num;
    			
    		} else if (stack.peek() != num) {
    			
    			System.out.print("NO");
    			return;
    			
    		}
    		
    		stack.pop();
			result.append("-").append("\n");		
    		
    	}
    	
    	System.out.print(result);
    }
    
}
