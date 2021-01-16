import java.util.*;
import java.lang.StringBuilder;

public class W3resource_basic_1_num_58 {


    public static void main(String[] args) {

     Scanner in = new Scanner(System.in);
     System.out.print("Input a Sentence: ");
	 String line = in.nextLine();
     StringBuilder  upper_case_line =new StringBuilder(""); 
       Scanner lineScan = new Scanner(line); 
         while(lineScan.hasNext()) {
             String word = lineScan.next(); 
             upper_case_line.append(Character.toUpperCase(word.charAt(0)) + word.substring(1) + " "); 
         }
      System.out.println(upper_case_line);
      // System.out.println(upper_case_line.trim());  in case you are interested in the trim of the original version
    }

    }
