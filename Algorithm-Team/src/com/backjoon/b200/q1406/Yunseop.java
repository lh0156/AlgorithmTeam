package com.backjoon.b200.q1406;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Yunseop {
    public static void main(String[] args) throws Exception{

        //한 줄로 된 간단한 에디터를 구현하려고 한다. 이 편집기는 영어 소문자만을 기록할 수 있는 편집기로, 최대 600,000글자까지 입력할 수 있다.
        //
        //이 편집기에는 '커서'라는 것이 있는데, 커서는 문장의 맨 앞(첫 번째 문자의 왼쪽), 문장의 맨 뒤(마지막 문자의 오른쪽), 또는 문장 중간 임의의 곳(모든 연속된 두 문자 사이)에 위치할 수 있다.
        //즉 길이가 L인 문자열이 현재 편집기에 입력되어 있으면, 커서가 위치할 수 있는 곳은 L+1가지 경우가 있다.

        //이 편집기가 지원하는 명령어는 다음과 같다.
        //
        //L	커서를 왼쪽으로 한 칸 옮김 (커서가 문장의 맨 앞이면 무시됨)
        //D	커서를 오른쪽으로 한 칸 옮김 (커서가 문장의 맨 뒤이면 무시됨)
        //B	커서 왼쪽에 있는 문자를 삭제함 (커서가 문장의 맨 앞이면 무시됨)
        //삭제로 인해 커서는 한 칸 왼쪽으로 이동한 것처럼 나타나지만, 실제로 커서의 오른쪽에 있던 문자는 그대로임
        //P $	$라는 문자를 커서 왼쪽에 추가함
        //초기에 편집기에 입력되어 있는 문자열이 주어지고, 그 이후 입력한 명령어가 차례로 주어졌을 때, 모든 명령어를 수행하고 난 후 편집기에 입력되어 있는 문자열을 구하는 프로그램을 작성하시오.
        // 단, 명령어가 수행되기 전에 커서는 문장의 맨 뒤에 위치하고 있다고 한다.

        //문제 풀이(커서의 최초 생성 위치는 제일 오른쪽인듯)
        //1. 커서 생성
        //1. 조건문으로 L일 때
        //  1.1 커서가 1이면 continue 아니면 -1
        //2. D일때
        //  2.1. 커서가 문자.length()랑 같으면 continue 아니면 +1
        //3. B일때
        //  3.1. 서브스트링으로 0~커서-1 + 커서~랭스 까지 자른 후 커서 값 -1
        //  3.1. 커서가 1이면 continue
        //4. P $ 일때(startWith)
        //  4.1. 서브스트링으로 0~커서+ + $ + 커서~랭스 해준 후 커서 값 +1

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String temp = reader.readLine();

        int cursor = temp.length();

        int spin = Integer.parseInt(reader.readLine());

        for (int i=0; i<spin; ++i){
            String input = reader.readLine();

            if(input.equals("L")){
                if(cursor==1){
                    continue;
                }else{
                    cursor--;
                }
            }else if(input.equals("D")){
                if(cursor==temp.length()){
                    continue;
                }else{
                    cursor++;
                }
            }else if(input.equals("B")){
                if(cursor==1){
                    continue;
                }else {
                    temp = temp.substring(0, cursor - 1) + temp.substring(cursor);
                    cursor--;
                }
            }else if(input.startsWith("P")){
                temp = temp.substring(0, cursor) + input.substring(2) + temp.substring(cursor);
                cursor++;
            }

        }

        System.out.print(temp);
    }
}
