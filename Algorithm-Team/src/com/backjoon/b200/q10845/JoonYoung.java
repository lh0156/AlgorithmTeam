package bababab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


public class JoonYoung {

	public static void main(String[] args) throws Exception, IOException {

		//입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//길이 입력받기
		int max = Integer.parseInt(br.readLine());
		
		//리스트 만들기
		Queue<Integer> list = new LinkedList<>();
		
		//마지막에 넣은 값 받기
		int addlist = 0;
        
        //뺑뺑이
		for (int i=0; i<max; i++) {
			
			//명령어 입력받기
			String input = br.readLine();
			
			//queue에서 빼내기
			if (input.equals("pop")) {
				
				if (list.isEmpty()) {
					System.out.println(-1);
				} else {
					
					System.out.println(list.poll());
				}
				
			//list 사이즈
			} else if (input.equals("size")) {
				
				System.out.println(list.size());
			
			//비었니?
			} else if (input.equals("empty")) {
				
				if (list.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				
				
			//list 맨 앞의 값	
			} else if (input.equals("front")) {
				
				if (list.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(list.peek());
				}
			
			//마지막에 넣은 값
			} else if (input.equals("back")) {
				
				if (list.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(addlist);
				}
			
			//받은 값을 split으로 잘라서 queue에 넣기
			} else if (input.startsWith("push")) {
							
				String[] array = input.split("\\s");
				
				String addl = array[1];
				addlist = Integer.parseInt(addl);
				
				list.offer(addlist);
				
				
			}
			
		}
		br.close();
		
	}


	
}
