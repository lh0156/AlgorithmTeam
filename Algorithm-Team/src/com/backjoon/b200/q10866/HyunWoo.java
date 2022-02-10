package com.backjoon.b200.q10866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class HyunWoo {
	
	private static List<Integer> list = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
		
//		push_front X: 정수 X를 덱의 앞에 넣는다.
//		push_back X: 정수 X를 덱의 뒤에 넣는다.
//		pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//		pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//		size: 덱에 들어있는 정수의 개수를 출력한다.
//		empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
//		front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//		back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder result = new StringBuilder();
		int num = 0;
		try {
			num = Integer.parseInt(scan.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for(int i=0 ; i < num ; i++) {
			String input = "";
			try {
				input = scan.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			String[] arr = input.split(" ");
			
			switch (arr[0]) {
				case "push_front":
					list.add(0,Integer.parseInt(arr[1]));
					break;
				case "push_back":
					list.add(Integer.parseInt(arr[1]));
					break;
				case "pop_front":
					result.append(pop_front()).append("\n");
					break;
				case "pop_back":
					result.append(pop_back()).append("\n");
					break;
				case "size":
					result.append(list.size()).append("\n");
					break;
				case "empty":
					result.append(list.size()==0?1:0).append("\n");
					break;
				case "front":
					result.append(list.size()==0?-1:list.get(0)).append("\n");
					break;
				case "back":
					result.append(list.size()==0?-1:list.get(list.size()-1)).append("\n");
					break;
			}
		}
		System.out.println(result.toString());
	}

	
	private static Integer pop_back() {
		if(list.size() == 0) {
			return -1;
		}else {
			int num = list.get(list.size()-1);
			list.remove(list.size()-1);
			return num;
		}
	}

	private static Integer pop_front() {
		if(list.size() == 0) {
			return -1;
		}else {
			int num = list.get(0);
			list.remove(0);
			return num;
		}
	}
}
