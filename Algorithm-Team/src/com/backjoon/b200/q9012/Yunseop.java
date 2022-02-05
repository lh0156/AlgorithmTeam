package com.backjoon.b200.q9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Yunseop {

    public static void main(String[] args) {


        //괄호 문자열(Parenthesis String, PS)은 두 개의 괄호 기호인 ‘(’ 와 ‘)’ 만으로 구성되어 있는 문자열이다.
        //그 중에서 괄호의 모양이 바르게 구성된 문자열을 올바른 괄호 문자열(Valid PS, VPS)이라고 부른다. 한 쌍의 괄호 기호로 된 “( )” 문자열은 기본 VPS 이라고 부른다.
        // 만일 x 가 VPS 라면 이것을 하나의 괄호에 넣은 새로운 문자열 “(x)”도 VPS 가 된다. 그리고 두 VPS x 와 y를 접합(concatenation)시킨
        // 새로운 문자열 xy도 VPS 가 된다. 예를 들어 “(())()”와 “((()))” 는 VPS 이지만 “(()(”, “(())()))” , 그리고 “(()” 는 모두 VPS 가 아닌 문자열이다.
        //여러분은 입력으로 주어진 괄호 문자열이 VPS 인지 아닌지를 판단해서 그 결과를 YES 와 NO 로 나타내어야 한다.


        //문제 핵심
        //괄호의 핵심은 여는 괄호와 닫는 괄호가 서로 맞대응하여 갯수가 맞아야 하는 것
        //즉 스텍에서 여는 괄호(여는 괄호가 먼저 오기때문)이면 push로 push해주고 닫는 괄호가 오면 pop으로 뺴준다.



        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        try {
            int spinCount = Integer.parseInt(reader.readLine());

            for(int i=0; i<spinCount; ++i){
                Stack stack = new Stack();
                String input = reader.readLine();

                for(int j=0; j<input.length(); ++j){
                    if(input.charAt(j)=='('){
                        stack.push('(');
                    }else if(input.charAt(j)==')'){
                        try {
                            stack.pop();
                        } catch (Exception e) {
                            stack.push("실패");
                        }
                    }
                }

                if(stack.isEmpty()){
                    System.out.println("Yes");
                }else if(!stack.isEmpty()){
                    System.out.println("No");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
