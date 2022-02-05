package com.backjoon.b200.q1874;

import java.util.Scanner;
import java.util.Stack;

public class Yunseop {

    public static void main(String[] args) {

        /*스택 (stack)은 기본적인 자료구조 중 하나로, 컴퓨터 프로그램을 작성할 때 자주 이용되는 개념이다.
        스택은 자료를 넣는 (push) 입구와 자료를 뽑는 (pop) 입구가 같아 제일 나중에 들어간 자료가 제일 먼저 나오는 (LIFO, Last in First out) 특성을 가지고 있다.
        1부터 n까지의 수를 스택에 넣었다가 뽑아 늘어놓음으로써, 하나의 수열을 만들 수 있다. 이때, 스택에 push하는 순서는 반드시 오름차순을 지키도록 한다고 하자.
         임의의 수열이 주어졌을 때 스택을 이용해 그 수열을 만들 수 있는지 없는지, 있다면 어떤 순서로 push와 pop 연산을 수행해야 하는지를 알아낼 수 있다. 이를 계산하는 프로그램을 작성하라.*/

        //수열을 이루는 구성원을 수열의 항(term) 또는 원소(element)라고 한다. 수열은 항의 유형에 따라 자연수열, 실수열, 점렬, 함수열, 집합열 등으로 나뉜다.
        //처음으로 오는 항을 첫째항(first term) 또는 첫항, 초항이라고 부르며, 둘째, 셋째, 넷째, ...로 오는 항을 둘째항, 셋째항, 넷째항, ..., 다르게는 제2항, 제3항, 제4항, ...이라고 부른다.

        //일반적이 수열이 아닌거같음.

        //1. 최초 입력값 만큼 연산을 한다(값을 입력받는다)
        //2. 최초 입력받은 수 만큼 1씩 차이나는 등차수열을 발생시킨 후 맨 마지막 항을 지운다
        // - 4를 입력받았으면 1, 2, 3, 4를 발생 시킨후 4를 지움 즉 4를 입력했을 때 내부적으로 일어나는 것은
        // stack.push(1)~(4), stack.pop(4)

        //3. 6을 입력 받았는데 +가 4개가 아니라 2개이다. 즉 이 수열은 역대 발생했었던 최댓값을 따로 관리함(1~2번까지는 4가 최댓값)
        //4. 최댓값보다 크면 push, 최대수와 같으면서 스택내에 해당값이 존재하면 pop 그렇지 않으면 No를 반환한다.

        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int spin = scan.nextInt();

        int max = 0;
        Stack<Integer> stack = new Stack<>();


        for(int i=0; i<spin; ++i){
            int nowInput = scan.nextInt();

            if(nowInput > max){
                for(int j=max+1; j<=nowInput; ++j){
                    stack.push(j);
                    sb.append("+\n");
                }
                max = nowInput;
            } else if (stack.peek() != max){
                System.out.println("No");
            }
            stack.pop();
            sb.append("-\n");
        }

        System.out.println(sb);
    }

}
