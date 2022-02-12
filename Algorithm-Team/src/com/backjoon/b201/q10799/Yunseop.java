import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Yunseop {
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = bf.readLine();
        Stack<Character> stack = new Stack<>();

        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') { // 열린 괄호면 스택에 추가.
                stack.push('(');
                continue;
            }
            if (input.charAt(i) == ')') { // 닫힌 괄호일 경우,
                stack.pop(); // 일단 stack에서 pop을 실행.

                if (input.charAt(i - 1) == '(') { // 그 전 괄호가 열린 괄호면 레이저를 의미.
                    result += stack.size(); // 현재 stack의 사이즈만큼 더해 줌.
                } else { // 그 전 괄호가 닫힌 괄호면 레이저가 아님.
                    result++; // 단순히 1을 더해 줌.
                }
            }
        }

        bw.write(result + "\n");
        bw.flush();
        bf.close();
        bw.close();
    }

}