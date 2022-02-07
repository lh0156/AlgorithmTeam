package bababab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class joonyoung1046new2 {

	public static void main(String[] args) throws Exception {

		//일단 입력받아
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//리스트로 만들어야 중간에 넣을수 있겠지?
		ArrayList<Character> list = new ArrayList<Character>();
		
		//입력받아보자
		String input = br.readLine();
		
		//index로 커서를 조절해볼까 생각해서 만들어보았다
		int index = input.length();
		
		//index가 자꾸 바뀌니까 새로 변수를 파서 맨 오른쪽 끝을 설정해줘봤다
		int right = input.length();
		
		//리스트에 문자를 담아보자
        for (int i = 0; i < index; i++) {
            list.add(input.charAt(i));
        }
        
        //뺑뺑이 돌려서 찾아보자
        for (int i=0; i<index; i++) {
        	
        	//명령을 입력받아보자
        	String com = br.readLine();
        	
        	//L이면 index가 하나 왼쪽으로 가야한다. 이게 커서인데 이름도 커서로 할걸
        	if (com.equals("L")) {
        		if (index > 0) {
        			index --;
        		}
        	//D면 index가 오른쪽으로
        	} else if (com.equals("D")) {
        		if (index < right) {
        			index ++;
        		}
        	//B면 index-1의 위치에 있는 리스트를 지우고 커서도 줄여준다
        	} else if (com.equals("B")) {
        		if (index > 0) {
        			list.remove(index-1);
        			
        			index --;
        		}
        	//P로 시작하면 문자를 index위치에 문자를 추가해야 한다.
        	} else if (com.startsWith("P")) {

        		list.add(index, com.substring(2, com.length()).charAt(index)); //어떻게해얗자ㅣㅁㄴ아럼ㅈ디ㅑ렅ㅋㄴ이ㅏㄻ처ㅣ
        		index ++;
        		
        	}
        	
        }
        
        
		
		
	}


	
}
