package com.backjoon.b200.q10845;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class YouMe {
	/*
	 * 큐 구현해서 명령 처리하는 프로그램
	 * - push; 정수 X를 넣음
	 * - pop; 가장 앞 정수를 빼고 그 수를 출력함
	 * - size; 큐에 들어 있는 정수의 개수 출력
	 * - empty; 큐가 비어있으면 1, 아니면 0을 출력함.
	 * - front; 가장 앞의 정수 출력
	 * - back; 가장 뒤의 정수 출력
	 * - pop/front/back에서 queue가 비어있을 경우 -1 출력
	 * 
	 * 설계>
	 * 1. ArrayList 크기 10000, BufferedReader, command 필드 생성
	 * 2. testCase 변수 선언 후 입력 값을 형변환해 초기화함.
	 * 3. for문 testCase 반복
	 * 	> command 배열에 입력 값을 공백 기준으로 쪼개서 초기화함.
	 * 	> command를 인자로 getQueue 메소드 호출
	 * 4. String getQueue 메소드
	 * 	> switch문 command의 0번째 요소를 조건
	 * 		> push; list에 command의 1번째 요소 추가
	 * 		> pop; if !isEmpty ?
	 * 				> list의 0번째 요소 출력 후 제거,
	 * 		> size; list size
	 * 		> empty; if list 비었는지?
	 * 				> 맞으면 1, 아니면 0 출력
	 * 		> front; if !isEmpty ?
	 * 				> list 0번째 출력
	 * 		> back; if !isEmpty ?
	 * 				> 마지막 요소 출력
	 * 5. isEmpty 메소드
	 * 		> if list size가 0인지?
	 * 			> -1 출력함.
	 */
	
	private static ArrayList<String> list;
	private static BufferedReader reader;
	private static String[] command;
	
	static {
		list = new ArrayList<String>();
		reader = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public static void main(String[] args) throws Exception {
		int testCase = Integer.parseInt(reader.readLine());
		
		for(int i=0; i<testCase; i++) {
			command = reader.readLine().split(" ");
			getQueue();
		}
	}

	private static void getQueue() {
		switch(command[0]) {
			case "size" : 
				System.out.println(list.size());
				break;
				
			case "empty" :
				if(list.isEmpty()) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
				break;
				
			case "push" :
				list.add(command[1]);
				break;
				
			case "pop" :
				if(!isEmpty()) {
					System.out.println(list.get(0));
					list.remove(0);
				}
				break;
				
			case "front" :
				if(!isEmpty()) {
					System.out.println(list.get(0));
				}
				break;
			
			case "back" :
				if(!isEmpty()) {
					System.out.println(list.get(list.size()-1));
				}
		}
	}

	private static boolean isEmpty() {
		if(list.isEmpty()) {
			System.out.println("-1");
			return true;
		}
		return false;
	}
}
