import java.util.Arrays;

public class W3resource_basic_1_num_32 {


public static void doExercise(int num1, int num2)  {

    // one way to do it
    // int[] arr = new int[5];
    // arr[0] = num1; 
    // arr[1] = num2;

    // another
    int[] arr = new int[]{ num1,num2 }; 
    Arrays.sort(arr);
    System.out.println(Integer.toString(arr[0])+" > "+Integer.toString(arr[1]));

    if (num1 == num2) {
        System.out.println(Integer.toString(arr[0])+" == "+Integer.toString(arr[1]));
    }
    else{
        System.out.println(Integer.toString(arr[0])+" != "+Integer.toString(arr[1]));
    }

}


    public static void main(String[] args) {

        W3resource_basic_1_num_32 app = new W3resource_basic_1_num_32();
        app.doExercise(25,30);

    }
}