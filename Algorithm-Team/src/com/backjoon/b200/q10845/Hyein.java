package com.backjoon.b200.q10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hyein {

	private static int[] queue;
	private static int frontIndex = 0;
	private static int backIndex = -1;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*
		 * 1. BufferedReader 생성 
		 * 2. 결과값 저장할 StringBuilder result 생성
		 * 2. N = 입력 받을 명령어 수
		 * 3. N길이의 int[] queue 생성
		 * 4. int frontIndex = 0, backIndex = -1
		 * 5. N번 동안 for문
		 * 		> command 배열에 명령어를 공백으로 split한 후 저장
		 * 		> command[0]으로 switch문 분기
		 * 			> push : backIndex++; queue[backIndex] = command[1];
		 * 			> pop : return queue[frontIndex++] 
		 * 			> size : return backIndex - frontIndex + 1
		 * 			> empty : if(frontIndex > backIndex) 1 else 0
		 * 			> front : 비어있지 않으면 return queue[frontIndex];
		 * 			> back : 비어있지 않으면 return queue[backIndex];
		 * 		> result에 반환값 append
		 * 6. result 출력
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder result = new StringBuilder();
		
		int N = Integer.parseInt(reader.readLine());
		
		queue = new int[N];

		for(int i=0; i < N; i++) {
			
			String[] command = reader.readLine().split(" ");
			
			switch (command[0]) {
			case "push":
				push(command[1]);
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
			default:
				break;
			}
			
		}

		System.out.print(result);
	}

	private static int back() {
		
		if(empty() != 1) {
			return queue[backIndex];
		} else {
			return -1;			
		}
	}

	private static int front() {
		
		if(empty() != 1) {
			return queue[frontIndex];
		} else {
			return -1;			
		}
	}

	private static int size() {
		
		return backIndex - frontIndex + 1;
	}

	private static int pop() {
		
		if(empty() != 1) {
			return queue[frontIndex++];
		} else {
			return -1;
		}
	}

	private static int empty() {
		
		if(frontIndex > backIndex) {
			return 1;
		} else {
			return 0;			
		}
	}

	private static void push(String num) {
		
		backIndex++;
		queue[backIndex] = Integer.parseInt(num);
	}
}

