


public class Example1_Linear_euclids_algorithm {

    public static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        return gcd(q, p % q);
    }

    public static void main(String[] args) {

		System.out.print(gcd(10, 17) )


	}
}
  
