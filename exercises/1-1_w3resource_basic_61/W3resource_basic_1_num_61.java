import java.util.*;
import java.lang.StringBuilder;

public class W3resource_basic_1_num_61 {


    public static void main(String[] args) {

      Scanner in = new Scanner(System.in);
      System.out.print("\nInput a word: ");
      String word = in.nextLine();
      word = word.trim();
      StringBuilder result = new StringBuilder(""); 
      char[] ch=word.toCharArray();  
      for (int i = ch.length - 1; i >= 0; i--) {
          result.append(ch[i]); 
        }
      System.out.println("Reverse word: "+result); 
      }	
    }
