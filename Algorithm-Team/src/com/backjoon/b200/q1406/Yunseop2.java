import java.util.ArrayList;
import java.util.Scanner;

public class Yunseop2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> queue = new ArrayList<String>();
        int loop = scan.nextInt();

        for (int i=0; i<loop; ++i) {
            String temp = scan.nextLine();

            String[] arrayTemp = temp.split(" ");

            switch (arrayTemp[0]) {
                case "push" : queue.add(arrayTemp[1]);
                              break;
                case "front" : System.out.println(queue.size() > 0 ? queue.get(0) : "-1");
                              break;
                case "back" : System.out.println(queue.size() > 0 ? queue.get(queue.size()) : "-1");
                              break;
                case "pop" : if (queue.size() > 0) {
                    System.out.println(queue.get(queue.size()-1));
                    queue.remove(queue.size()-1);
                } else {
                    System.out.println("-1");
                }
                break;
                case "size" :
                    System.out.println(queue.size());
                    break;
                case "empty" : if (queue.size() == 0) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
                    break;
            }

        }//for

    }//main



}//class
