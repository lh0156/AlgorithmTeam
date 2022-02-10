package com.backjoon.b200.q10866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Hyein {

	private static ArrayList<String> deque = new ArrayList<String>();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*
		 * 1. BufferedReader 생성
		 * 2. ArrayList deque 생성
		 * 3. 결과값 출력할 StringBuilder result 생성
		 * 4. int N = 입력 받을 명령어 수
		 * 5. N번 동안 반복
		 * 		> String[] command에 입력받은 명령어를 공백으로 split한 후 저장
		 * 		> command[0]으로 switch문 분기
		 * 			> push_front : 쓰기 귀찮아........
		 * 
		 * 6. 출력
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder output = new StringBuilder();
		
		int N = Integer.parseInt(reader.readLine());
		
		while(N-- > 0) {
			
			String[] command = reader.readLine().split(" ");
			String result = "";
			
			switch (command[0]) {
			case "push_front":
				pushFront(command[1]);
				break;
				
			case "push_back":
				pushBack(command[1]);
				break;
				
			case "pop_front":
				result = popFront();
				break;
				
			case "pop_back":
				result = popBack();
				break;
				
			case "size":
				result = size() + "";
				break;
				
			case "empty":
				result = empty() + "";
				break;
				
			case "front":
				result = front();
				break;
				
			case "back":
				result = back();
				break;

			default:
				break;
			}
			
			if(!command[0].equals("push_front") && !command[0].equals("push_back")) {
				output.append(result).append("\n");				
			}
			
		}
		
		System.out.print(output.toString());

	}
	
	private static String back() {

		if(empty() != 1) {
			return deque.get(deque.size() - 1);
		} else {
			return "-1";
		}
	}

	private static String front() {
		
		if(empty() != 1) {
			return deque.get(0);
		} else {
			return "-1";
		}
	}

	private static int size() {
		
		return deque.size();
	}

	private static String popBack() {

		if(empty() != 1) {
			return deque.remove(deque.size() - 1);
		} else {
			return "-1";
		}
	}

	private static String popFront() {

		if(empty() != 1) {
			return deque.remove(0);
		} else {
			return "-1";
		}
	}

	private static int empty() {
		
		if(deque.isEmpty()) {
			return 1;
		} else {
			return 0;
		}
	}

	private static void pushBack(String num) {
		
		deque.add(num);
	}

	private static void pushFront(String num) {

		deque.add(0, num);
	}
	

}
