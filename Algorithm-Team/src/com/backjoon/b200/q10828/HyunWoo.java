package com.backjoon.b200.q10828;

import java.util.ArrayList;

public class HyunWoo {
	
	private static ArrayList<Integer> stack = new ArrayList<Integer>();
	private static int i=0;

	public static void main(String[] args) {
		
		HyunWoo.push(3);
		
		
		
		
	}
	
	private static void push(int num) {//push X: 정수 X를 스택에 넣는 연산이다.
		
		stack.add(i,num);
		i++;
		
	}
	private static void pop() {//pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		
	}
	private static void size() {//size: 스택에 들어있는 정수의 개수를 출력한다.
		
	}
	private static void empty() {//empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
		
	}
	private static void top() {//top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		
	}

}




