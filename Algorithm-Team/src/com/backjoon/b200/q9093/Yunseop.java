package com.backjoon.b200.q9093;

import java.util.Scanner;

public class Yunseop {

    public static void main(String[] args) {

        //수업 예제 떄 풀었던 것 같은데 그냥 배열에 담으면 되는거 아닌가?
        //어제와 오늘로써 유추할 수 있는 스텍의 속성?
        //"순서"를 구현하기 위해서는 "배열"이 필요하다.
        //어쩌면 코딩에서 순서라는건 1차원 배열이 아닐까?
        // -> 아니고 걍 쌓는거에 규칙(순서)이 있는가의 차이인듯?
        //그럼 LinkedHashMap과 HashMap의 차이는 HashMap가 담기는 기전이 배열인건가?
        // -> 맞는듯 즉, 배열 = (순서가 있고) 쌓는 것

        //1. 스캔 ㄱ
        //2. 순서 입력받기
        //3. 배열 만들기(2에서 입력받은 만큼)
        //4. 배열 수만큼 돌리기
        //5. 단어입력받아
        //6. 스플릿으로 자르셈
        //7. 갓트링빌더 ㄱ
        //8. 향상된 포문으로 돌려주자
        //9. 삼중포문;;
        //10. charAt 쓰면 될듯?

        Scanner scan = new Scanner(System.in);
        int count = Integer.parseInt(scan.nextLine());
        String[] results = new String[count];

        for (int i = 0; i < count; i++) {
            String word = scan.nextLine();
            String[] wordArr = word.split(" ");
            StringBuilder result = new StringBuilder();
            for (String words : wordArr) {
                for (int j = words.length(); j > 0; j--) {
                    result.append(words.charAt(j-1));
                }
                result.append(" ");
            }
            results[i] = result.toString();
        }

        for (String result : results) {
            System.out.println(result);
        }
    }
}
