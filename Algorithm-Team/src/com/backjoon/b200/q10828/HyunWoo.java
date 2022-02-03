package com.backjoon.b200.q10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class HyunWoo {

	private static ArrayList<Integer> stack = new ArrayList<Integer>();
	private static int index = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(bf.readLine());
		
		for(int i =0 ; i< count ; i++) {
			
			String order = bf.readLine();
			int num =0;
			if(order.indexOf(" ")!=-1) {
				num = Integer.parseInt(order.substring(order.indexOf(" ")+1,order.length()));
				order = order.substring(0,order.indexOf(" "));
			}
			if(order.equals("push")) {
				push(num);
			}else if(order.equals("pop")) {
				System.out.println(pop());
			}else if(order.equals("size")) {
				System.out.println(size());
			}else if(order.equals("empty")) {
				System.out.println(empty());
			}else if(order.equals("top")) {
				System.out.println(top());
			}
			
		}

	}

	private static void push(int num) {// push X: 정수 X를 스택에 넣는 연산이다.

		stack.add(index, num);
		index++;

	}

	private static int pop() {// pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.

		if (index == 0) {
			return -1;
		} else {
			int num = stack.get(index - 1);

			stack.remove(index - 1);
			index--;
			return num;
		}

	}

	private static int size() {// size: 스택에 들어있는 정수의 개수를 출력한다.

		return index;

	}

	private static int empty() {// empty: 스택이 비어있으면 1, 아니면 0을 출력한다.

		if (index == 0) {
			return 1;
		} else {
			return 0;
		}

	}

	private static int top() {// top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.

		if (index == 0) {
			return -1;
		} else {
			return stack.get(index - 1);
		}

	}

}
