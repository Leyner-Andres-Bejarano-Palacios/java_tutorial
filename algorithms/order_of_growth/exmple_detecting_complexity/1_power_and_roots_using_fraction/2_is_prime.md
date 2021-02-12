# Understanding this code, need to understand recursion


# source

pag 26 real 36

# text


public static boolean isPrime(int N)
{
if (N < 2) return false;
for (int i = 2; i*i <= N; i++)
	if (N % i == 0) return false;
return true;
}

# my answer

In the best case of course it would be lineal, in the wort case sceneario it would be linear

in the first three executions it would be 1 (1 * 1) , next want would be 2 * 2 and it would continue like 


# real answer


https://dev.to/priyanka__488/number-theory-primality-test-in-o-sqrt-n-dde

On observing the equation, we can infer that the maximum value of a and b can be the square root of n.

sqrt(n)*sqrt(n) = n

Since, if both of the values go beyond sqrt(n), then a*b would be greater than n.

Also, If a is less than sqrt(n), then b will be greater then sqrt(n).
Similarly, if a is greater than sqrt(n), b will be smaller than sqrt(n).

We can conclude that one of the numbers is <= sqrt(n), and the other one is >= sqrt(n).

And to prove that n is prime, we just need to find one of the numbers - a or b.
If no such number exists, it means that n is not prime.

Hence, to do the primality test, we need not run loop till n, this can be done by running the loop till sqrt(n) itself.
