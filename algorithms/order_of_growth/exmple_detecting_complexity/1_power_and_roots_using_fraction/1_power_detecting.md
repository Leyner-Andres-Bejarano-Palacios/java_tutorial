# Understanding this code, need to understand recursion


# source

https://www.geeksforgeeks.org/write-a-c-program-to-calculate-powxn/

# text

class GFG {
    /* Function to calculate x raised to the power y */
    static int power(int x, int y)
    {
        if (y == 0)
            return 1;
        else if (y % 2 == 0)
            return power(x, y / 2) * power(x, y / 2);
        else
            return x * power(x, y / 2) * power(x, y / 2);
    }
 
    /* Program to test function power */
    public static void main(String[] args)
    {
        int x = 2;
        int y = 3;
 
        System.out.printf("%d", power(x, y));
    }
}


Time Complexity: O(n) 
Space Complexity: O(1) 
Algorithmic Paradigm: Divide and conquer.
Above function can be optimized to O(logn) by calculating power(x, y/2) only once and storing it. 


* Function to calculate x raised to the power y in O(logn)*/
static int power(int x, int y) 
{ 
    int temp; 
    if( y == 0) 
        return 1; 
    temp = power(x, y / 2); 
    if (y % 2 == 0) 
        return temp*temp; 
    else
        return x*temp*temp; 
} 
 
// This code is contributed by divyeshrabadiya07.


/* Java code for extended version of power function
that can work for float x and negative y */
class GFG {
     
    static float power(float x, int y)
    {
        float temp;
        if( y == 0)
            return 1;
        temp = power(x, y/2); 
         
        if (y%2 == 0)
            return temp*temp;
        else
        {
            if(y > 0)
                return x * temp * temp;
            else
                return (temp * temp) / x;
        }
    } 
     
    /* Program to test function power */
    public static void main(String[] args)
    {
        float x = 2;
        int y = -3;
        System.out.printf("%f", power(x, y));
    }
}
 
// This code is contributed by  Smitha Dinesh Semwal.
