package com.backjoon.b200.q10866;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Yunseop {

    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new ArrayDeque<>();

       int orderCount = Integer.parseInt(st.nextToken());

        for(int i=0; i<orderCount; i++) {
            st = new StringTokenizer(br.readLine());
            String order = st.nextToken();

            if(order.equals("push_front")) {

                deque.addFirst(Integer.parseInt(st.nextToken()));

            }else if(order.equals("push_back")) {

                deque.addLast(Integer.parseInt(st.nextToken()));

            }else if(order.equals("pop_front")){

                if(deque.isEmpty()) {
                    sb.append("-1\n");
                }else {
                    sb.append(deque.pollFirst()+"\n");
                }

            }else if(order.equals("pop_back")) {

                if(deque.isEmpty()) {
                    sb.append("-1\n");
                }else {
                    sb.append(deque.pollLast()+"\n");
                }

            }else if(order.equals("size")) {

                sb.append(deque.size()+"\n");

            }else if(order.equals("empty")) {

                if(deque.isEmpty()) {
                    sb.append("1\n");
                }else {
                    sb.append("0\n");
                }

            }else if(order.equals("front")) {

                if(deque.isEmpty()) {
                    sb.append("-1\n");
                }else {
                    sb.append(deque.getFirst()+"\n");
                }

            }else if(order.equals("back")) {

                if(deque.isEmpty()) {
                    sb.append("-1\n");
                }else {
                    sb.append(deque.getLast()+"\n");
                }
            }
        }

        bw.write(sb.toString());
        bw.flush();
    }

}