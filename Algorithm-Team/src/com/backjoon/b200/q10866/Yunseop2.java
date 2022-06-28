import java.util.ArrayList;
import java.util.Scanner;

public class Yunseop2 {

    /*
        설계

        [사전 작업]
        1. ArrayList<Integer> 선언
        2. Scanner 선언
        3. StringBuilder 선언

        [로직]
        1. 스캐너로 몇 번 돌릴것인지 받는다.
        2. 그 돌리는 횟수만큼 for문 돌려준다.
        3. for문 시작지점에 String 값을 받아준다.
        4. String값을 Split으로 쪼개어서 String 배열에 넣어준다.
        5. String배열의 첫번째 인덱스로 분기를 나눈다.
            5.1. push_front = 리스트의 맨 앞에 넣음
            5.2. push_back = 리스트의 맨 뒤에 넣음
            5.3. pop_front  = 리스트의 맨 앞에 수가 있는지 확인
                5.3.1. 없으면 빌더에 -1 추가
                5.3.2. 있으면 맨 앞 수를 빌더에 추가하고 맨 앞 수를 remove
            5.4. pop_back   = 리스트의 맨 뒤에 수가 있는지 확인
                5.4.1. 없으면 빌더에 -1 추가
                5.3.2. 있으면 맨 뒤 수를 빌더에 추가하고 맨 뒤 수를 remove
            5.5. size       = 사이즈를 빌더에 추가
            5.6. empty      = size가 0이면 빌더에 1추가 1이면 0추가
            5.7. front      = 리스트의 맨 앞에 수가 있는지 확인
                5.7.1. 없으면 빌더에 -1 추가
                5.7.2. 있으면 맨 앞 수를 빌더에 추가
            5.8. back       = 리스트의 맨 뒤에 수가 있는지 확인
                5.8.1. 없으면 빌더에 -1 추가
                5.8.2. 있으면 맨 뒤 수를 빌더에 추가
    */

    public static ArrayList<Integer> list = new ArrayList<>();
    public static Scanner scan = new Scanner(System.in);
    public static StringBuilder sb = new StringBuilder();
    public static String[] DequeSelectType = {"push_front", "push_back", "pop_front", "pop_back", "size", "empty", "front", "back"};

    public static void main(String[] args) {


        int loopCount = scan.nextInt();

        for(int i=0; i<loopCount; ++i) {

            String inputType = scan.nextLine();

            String[] temp = inputType.split(" ");

            String type = temp[0];

            if (type.equals(DequeSelectType[0])) {
                push_Front(Integer.parseInt(temp[1]));
            } else if (type.equals(DequeSelectType[1])) {
                push_Back(Integer.parseInt(temp[1]));
            } else if (type.equals(DequeSelectType[2])) {
                pop_front();
            } else if (type.equals(DequeSelectType[3])) {
                pop_back();
            } else if (type.equals(DequeSelectType[4])) {
                size();
            } else if (type.equals(DequeSelectType[5])) {
                empty();
            }else if (type.equals(DequeSelectType[6])) {
                front();
            }else if (type.equals(DequeSelectType[7])) {
                back();
            }
        }

        System.out.println(sb);

    }//main

    public static void push_Front(int value) {
        list.add(0, value);
    }

    public static void push_Back(int value) {
        list.add(list.size(), value);
    }

    public static void pop_front() {
        if (list.size() == 0) {
            sb.append("-1\r\n");
        } else {
            sb.append(list.get(0) + "\r\n");
            list.remove(0);
        }
    }

    public static void pop_back() {
        if (list.size() == 0) {
            sb.append("-1\r\n");
        } else {
            int index = list.size()-1;
            sb.append(list.get(index) + "\r\n");
            list.remove(index);
        }
    }

    public static void size() {
        sb.append(list.size() + "\r\n");
    }

    public static void empty() {
        if (list.size()==0) {
            sb.append(1 + "\r\n");
        }
    }

    public static void front() {
        if (list.size() == 0) {
            sb.append("-1\r\n");
        } else {
            sb.append(list.get(0) + "\r\n");
        }
    }

    public static void back() {
        if (list.size() == 0) {
            sb.append("-1\r\n");
        } else {
            int index = list.size()-1;
            sb.append(list.get(index) + "\r\n");
        }
    }



}//class
