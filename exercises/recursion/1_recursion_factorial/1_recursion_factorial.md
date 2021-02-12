# the problem 


Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).

# the solution

public int factorial(int n) {
  // Base case: if n is 1, we can return the answer directly
  if (n == 1) return 1;
  
  // Recursion: otherwise make a recursive call with n-1
  // (towards the base case), i.e. call factorial(n-1).
  // Assume the recursive call works correctly, and fix up
  // what it returns to make our result.
  return n * factorial(n-1);
}
