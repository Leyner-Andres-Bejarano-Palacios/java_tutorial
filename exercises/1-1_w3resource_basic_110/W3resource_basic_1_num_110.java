import java.io.*; 
import java.util.*; 


public class W3resource_basic_1_num_110 {


      static int isPowerOfFour(int n)
    {
        if(n == 0)
        return 0;
        while(n != 1)
        { 
            if(n % 4 != 0)
            return 0;
            n = n / 4;     
        }
        return 1;
    } 


    public static void main(String[] args) {

        int test_no = 648745245 ;
        if(isPowerOfFour(test_no) == 1)
         System.out.println(test_no + 
                           " is a power of 4");
        else
         System.out.println(test_no + 
                           "is not a power of 4");
    }
  }
