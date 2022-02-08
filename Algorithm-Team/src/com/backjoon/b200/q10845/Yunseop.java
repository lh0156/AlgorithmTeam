package com.backjoon.b200.q10845;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Yunseop {
    public static void main(String[] args) {
        //정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
        //
        //명령은 총 여섯 가지이다.
        //
        //push X: 정수 X를 큐에 넣는 연산이다.
        //pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        //size: 큐에 들어있는 정수의 개수를 출력한다.
        //empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
        //front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        //back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        //입력
        //첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다.
        // 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.

        //1. 리더 선언
        //2. 몇 번 돌릴것인지 spin 변수를 선언하여 입력 받는다
        //3. 입력 받은 후 유효성 검사를 해준다 1이상 100000이하

        //4. queue 객체의 기능을 할 ArayListd를 선언한다.

        //5. 연산 결과를 담아줄 스트링 빌더를 선언해준다

        //6. for 문을 spin만큼 돌면서 입력값 input을 받는다

        //7. input 을 swtich문으로 나누어 메소드를 각각 push, pop, size, empty, front, back으로 빼주어 연산하며 연산의 결과를 빌더에 담아준다.
        //  push X: 정수 X를 큐에 넣는 연산이다.
        //  pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        //  size: 큐에 들어있는 정수의 개수를 출력한다.
        //  empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
        //  front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        //  back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.

        //8. 연산의 결과를 프린트해준다.

        //1.
        try {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            //2.
            int spin = Integer.parseInt(reader.readLine());

            //3.
            if (spin < 1 && spin > 100000) {
                return;
            }

            //4.
            ArrayList<String> queue = new ArrayList<String>();

            //5.
            StringBuilder sb = new StringBuilder();

            //6.
            for (int i = 0; i < spin; ++i) {
                String input = reader.readLine();


                //7.
                if (input.startsWith("push")) {
                    queue.add(input.substring(5));
                } else if (input.equals("pop")) {
                    if (queue.isEmpty()){
                        sb.append("-1" + "\n");
                    } else {
                        sb.append(queue.get(0)+"\n");
                        queue.remove(0);
                    }

                } else if (input.equals("pop")) {
                    sb.append(queue.size()+"\n");
                } else if (input.equals("empty")) {
                    if (queue.isEmpty()) {
                        sb.append("1"+"\n");
                    } else {
                        sb.append("0"+"\n");
                    }
                } else if (input.equals("front")) {
                    if (queue.isEmpty()) {
                        sb.append("-1"+"\n");
                    } else {
                        sb.append(queue.get(0)+"\n");
                    }
                } else if (input.equals("back")) {
                    if (queue.isEmpty()) {
                        sb.append("-1"+"\n");
                    } else {
                        sb.append(queue.size()+"\n");
                    }
                } else if (input.equals("size")) {
                    sb.append(queue.size()+"\n");
                }
            }

            //8.
            System.out.println(sb);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
