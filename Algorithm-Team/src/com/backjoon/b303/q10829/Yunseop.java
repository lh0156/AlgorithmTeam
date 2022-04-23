import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Long count_10 = Long.parseLong(reader.readLine());

        ArrayList<Long> count_2 = new ArrayList<>();

        while(count_10>0) {
            count_2.add(count_10%2);
            count_10 /= 2;
        }

        Collections.reverse(count_2);

        for (Long answer : count_2) {
            System.out.print(answer);
        }

    }
}


