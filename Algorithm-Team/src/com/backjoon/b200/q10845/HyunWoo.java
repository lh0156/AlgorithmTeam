package com.backjoon.b200.q10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HyunWoo {

	private static int index;
	private static int[] que;

	static {
		index = 0;
		que = new int[1];
	}

	public static void main(String[] args) {

//		push X: 정수 X를 큐에 넣는 연산이다. => 인자 index 조작
//		pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다. return => index 조작
//		size: 큐에 들어있는 정수의 개수를 출력한다. return
//		empty: 큐가 비어있으면 1, 아니면 0을 출력한다. return
//		front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다. return
//		back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다. return

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder result = new StringBuilder();
		int count = 0;

		try {
			count = Integer.parseInt(scan.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < count; i++) {
			StringBuilder content = new StringBuilder();
			try {
				content.append(scan.readLine());
			}catch (IOException e) {
				e.printStackTrace();
			}
			String[] arr = content.toString().split(" ");

			switch (arr[0]) {
			case "push":
				push(Integer.parseInt(arr[1]));
				break;
			case "pop":
				result.append(pop()).append("\n");
				break;
			case "size":
				result.append(size()).append("\n");
				break;
			case "empty":
				result.append(empty()).append("\n");
				break;
			case "front":
				result.append(front()).append("\n");
				break;
			case "back":
				result.append(back()).append("\n");
				break;
			}

		}

		System.out.println(result.toString());

	}

	private static void push(int num) {
		try {
			que[index] = num;
			index++;
		}catch(ArrayIndexOutOfBoundsException indexOut){
			int[] temp = new int[que.length*2];
			for(int i=0 ; i<que.length;i++) {
				temp[i] = que[i];
			}
			que = new int[temp.length];
			que = temp;
			push(num);
		}
	}

	private static int back() {
		try {
			return que[index-1];
		}catch(NullPointerException e) {
			return -1;
		}catch(ArrayIndexOutOfBoundsException e2) {
			return -1;
		}
	}

	private static int front() {
		if(index==0) {
			return -1;
		}else {
			return que[0];
		}
	}

	private static int empty() {
		if(index==0) {
			return 1;
		}else {
			return 0;
		}
	}

	private static int size() {
		return index;
	}

	private static int pop() {
		
		if(index == 0) {
			return -1;
		}else {
			int num = que[0];
			for(int i=0; i<que.length-1;i++) {
				que[i] = que[i+1];
				que[i+1]=0;
			}
			index--;
			return num;
		}
		
	}
}
