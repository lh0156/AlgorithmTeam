package com.backjoon.b200.q10828;

import java.io.InputStreamReader;
import java.util.Scanner;

public class YunSeop {

	// 구현하고자 하는 스택(세인 st로 my 붙임 ㅋ)
	public static int[] myStack;
	// 요소 갯수
	public static int size = 0;

	public static void main(String[] args) {

		// 전제 1: 스텍 구현하려면 배열 써야할듯(어레이 리스트 크니까 그냥 일반 배열 쓰자)
		// 전제 2: 메소드 간 배열과 사이즈 값을 공유하려면 좀 무겁더라도 static 써야할듯
		// 전제 3: 왠지 모르겠는데 버퍼드 리더 임포트가 안됨; 무겁더라도 스캐너 쓰자

		Scanner scan = new Scanner(System.in);
		StringBuilder SB = new StringBuilder();

		int input = scan.nextInt();

		myStack = new int[input];

		for (int i = 0; i < input; ++i) {
			String type = scan.next();

			if (type.equalsIgnoreCase("push")) {
				push(scan.nextInt());
			} else if (type.equalsIgnoreCase("pop")) {
				SB.append(pop()).append("\n");
			} else if (type.equalsIgnoreCase("size")) {
				SB.append(size()).append("\n");
			} else if (type.equalsIgnoreCase("empty")) {
				SB.append(empty()).append("\n");
			} else if (type.equalsIgnoreCase("top")) {
				SB.append(top()).append("\n");
			}

		}

		System.out.println(SB);

	}

	private static int top() {
		if (size == 0) {
			return -1;
		} else {
			return myStack[size - 1];
		}
	}

	private static int empty() {
		if (size == 0) {
			return 1;
		} else {
			return 0;
		}
	}

	private static int size() {
		return size;
	}

	private static int pop() {

		if (size == 0) {
			return -1;
		} else {
			int popReturnPrice = myStack[size - 1];
			myStack[size - 1] = 0;
			size--;
			return popReturnPrice;
		}

	}

	private static void push(int nowStackInputPrice) {
		myStack[size] = nowStackInputPrice;
		size++;
	}
}
