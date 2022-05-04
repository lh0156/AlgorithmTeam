package Polymorphism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
스텍을 구하는 문제
    1. 어레이 리스트로 스텍을 만든다
    2. 버퍼드 리더 선언한다
    3. 루프 카운트를 받아준다
    4. for문을 돌며 입력값을 받아준다(어떤 메소드를 실행할지
    5. push, pop, size, empty, top을 각각 상황에 맞게 구현해준다
      5.1. push = Stack에 넣어줌.
      5.2. pop = 숫자중 가장 위에있는 수를 넣고 반환한다 없으면 -1
      5.3. size = 배열의 갯수+1를 출력한다
      5.4. empty 사이즈를 확인
      5.5. top 스택의 가장 위에 있는 정수 반환(pop이랑 같음) 없으면 -1
*/

public class YunSeop_Second {
    static ArrayList <Integer> Stack = new ArrayList<Integer>();


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int loopCount = Integer.parseInt(reader.readLine());

        while(loopCount!=0){

            String temp[] = reader.readLine().split(" ");

            String function = temp[0];


            if (function.equals("push")) {
                Stack.add(Integer.parseInt(temp[1]));
            } else if (function.equals("pop")) {
                sb.append(pop() + "\n");
            } else if (function.equals("size")) {
                sb.append(size() + "\n");
            } else if (function.equals("empty")) {
                sb.append(empty() + "\n");
            } else if (function.equals("top")) {
                sb.append(top() + "\n");
            }
            --loopCount;
        }

        System.out.println(sb.toString());
    }

    public static int pop() {
        if (Stack.size()!=0) {
            return Stack.get(Stack.size()-1);
        } else {
            return -1;
        }
    }

    public static int size() {
        return Stack.size();
    }

    public static int empty() {
        if (Stack.size() != 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int top() {
        if (Stack.size() != 0) {
            return Stack.get(Stack.size()-1);
        } else {
            return -1;
        }
    }
}
