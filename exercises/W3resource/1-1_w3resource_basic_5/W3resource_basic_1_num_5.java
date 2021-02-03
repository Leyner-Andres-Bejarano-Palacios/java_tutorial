import java.util.*;  

public class W3resource_basic_1_num_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Input first number: ");
        int first_number = sc.nextInt();
        System.out.println("Input second number: ");
        int second_number = sc.nextInt();
        int result = first_number * second_number;
        System.out.println(Integer.toString(first_number)+" x "+Integer.toString(second_number)+"="+Integer.toString(result));
    }
}