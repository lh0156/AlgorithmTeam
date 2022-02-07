package com.backjoon.b200.q1406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class YouMe {
	/*
		커서를 사용한 에디터 구현
		- L; 커서를 왼 쪽으로 한 칸 옮김.
		- D; 커서를 오른 쪽으로 한 칸 옮김.
		- B; 커서 왼 쪽에 있는 문자를 삭제함. 
		- P; 커서 왼 쪽에 문자를 추가함.
		- 커서는 문장의 맨 뒤에 위치함.
		
		설계>
		1. BufferedReader, ArrayList, index, content 필드에 선언함.
		2. 문자열과 갯수를 입력 받아 변수에 초기화함.
		4. 갯수 + 1을 index에 초기화함.
		5. 문자열을 매개로 setList 호출
		6. setList 메소드
			> for문 문자열의 길이
				> i번째 문자열을 ArrayList에 add함.
		7. for문 num 반복
			> String으로 명령어 배열 선언 후 입력 받은 문자열을 공백 기준으로 쪼개 넣음.
			> 배열을 매개로 edit 메소드 호출
		8. edit 메소드
			> 배열의 0번째 요소를 조건으로 switch문 생성
				> case L?
					> if문 index가 0보다 큰지?
						> index --;
				> case D? 
					> if문 index가 content+1의 길이보다 작거나 같은지?
						> index ++;
				> case B?
					> if문 index가 0보다 큰지?
						> list의 0번째 요소 제거함.
				> case P
					> list의 0번째에 배열의 1번째 요소를 추가함.
		9. getResult 호출함.
			> for문 list 반복
				> printf로 i번째 요소 출력함.
		
	 */
	
	private static BufferedReader reader;
	private static ArrayList<String> list;
	private static String content;
	private static int index;
	
	static {	
		reader = new BufferedReader(new InputStreamReader(System.in));
		list = new ArrayList<String>(600000);
	}
	
	public static void main(String[] args) throws Exception {
		content = reader.readLine();
		index = content.length();
		setList();
		
		int num = Integer.parseInt(reader.readLine());
		for(int i=0; i<num; i++) {
			String[] command = reader.readLine().split(" ");
			edit(command);
			getResult();
			System.out.println("," + index);
		}
		
	}

	private static void getResult() {
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
		}
	}

	private static void edit(String[] command) {
		switch(command[0]) {
			case "L":
				if(index > 0) {
					index --;
				}
				break;
			case "D":
				if(index <= content.length() + 1) {
					index ++;
				}
				break;
			case "B":
				if(index > 0) {
					list.remove(index);
				}
				break;
			case "P":
				list.add(index, command[1]);
				index++;
		}
	}

	private static void setList() {
		for(int i=0; i<content.length(); i++) {
			list.add(i, content.charAt(i) + "");
		}
	}

}
