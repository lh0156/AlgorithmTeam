import java.util.Scanner;

public class joonyoung {
	
    public static void main(String[] args) {
    	
        Scanner scan = new Scanner(System.in);
        
        String[] reverse = new String[t];
        
        int back = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < back; i++) {
        	
            String word = scan.nextLine();            
            String[] input = word.split(" ");
            
            StringBuilder wordarraylist = new StringBuilder();
            
            for (String words : input) {
               
            	for (int j = words.length(); j > 0; j--) {
                   
            		wordarraylist.append(words.charAt(j-1));
                }
            	
            	wordarraylist.append(" ");
            }
            reverse[i] = wordarraylist.toString();
        }

        for (String result : reverse) {
            System.out.println(result);
        }
    }
}
