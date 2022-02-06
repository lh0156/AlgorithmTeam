package com.backjoon.b200.q1874;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class HyunWoo {

	public static void main(String[] args) {

//		스택 (stack)은 기본적인 자료구조 중 하나로, 컴퓨터 프로그램을 작성할 때 자주 이용되는 개념이다. 
//		스택은 자료를 넣는 (push) 입구와 자료를 뽑는 (pop) 입구가 같아 제일 나중에 들어간 자료가 제일 먼저 나오는 (LIFO, Last in First out) 특성을 가지고 있다.
//
//		1부터 n까지의 수를 스택에 넣었다가 뽑아 늘어놓음으로써, 하나의 수열을 만들 수 있다. 이때, 
//		스택에 push하는 순서는 반드시 오름차순을 지키도록 한다고 하자. 임의의 수열이 주어졌을 때 스택을 이용해 그 수열을 만들 수 있는지 없는지, 
//		있다면 어떤 순서로 push와 pop 연산을 수행해야 하는지를 알아낼 수 있다. 이를 계산하는 프로그램을 작성하라.

//		최대 수 를 확인한다 > 입력받은 숫자
//		1부터 증가하면서 push 입력받은 숫자가 push되면 pop > 2번째 입력받은 숫자가 내부에 있다면 pop  없다면 push하다가 두번째 값이 push 되면 pop ...

		Stack<Integer> stack = new Stack<Integer>();
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder result = new StringBuilder();
		int count = 0;
		int num = 0;
		int preNum = 0;

		try {
			count = Integer.parseInt(scan.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (int i = 0; i < count; i++) {

			try {
				num = Integer.parseInt(scan.readLine());
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (num <= i) {
				if (stack.peek() == num) { // stack 최 상단과 동일하다면 문자열 입력
					stack.pop();
					result.append("-").append("\n");
				} else {
					System.out.println("NO");// 조건 불만족시 return
					return;
				}
			} else {
				for (int j = i+1; j <= count; j++) {
					try {
						if(!stack.contains(j) && preNum<j) {// 입력받았던 숫자들 중 최대값보다 크고 , stack에 없어야 됨.
							stack.push(j);
							result.append("+").append("\n");
						}
					}catch(java.util.EmptyStackException e) {// 처음 stack이 비어있을 경우
						stack.push(1);
						result.append("+").append("\n");
					}
					if (stack.peek() == num) { // stack 최 상단과 동일하다면 문자열 입력 이후 break;
						stack.pop();
						result.append("-").append("\n");
						break;
					} else {
						continue;
					}
				}
				preNum = preNum>num?preNum : num;// 입력받은 숫자 최대값 누적
			}
		}
		System.out.println(result.toString());
	}
}