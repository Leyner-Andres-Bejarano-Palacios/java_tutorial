# why is this logaritmic ????

Calculating Time complexity:

Let say the iteration in Binary Search terminates after k iterations. In the above example, it terminates after 3 iterations, so here k = 3
At each iteration, the array is divided by half. So let’s say the length of array at any iteration is n
At Iteration 1,
Length of array = n
At Iteration 2,
Length of array = n⁄2
At Iteration 3,
Length of array = (n⁄2)⁄2 = n⁄22
Therefore, after Iteration k,
Length of array = n⁄2k
Also, we know that after
After k divisions, the length of array becomes 1
Therefore
Length of array = n⁄2k = 1
=> n = 2k
Applying log function on both sides:
=> log2 (n) = log2 (2k)
=> log2 (n) = k log2 (2)
As (loga (a) = 1)
Therefore,
=> k = log2 (n)

# source

### source_1

https://www.geeksforgeeks.org/complexity-analysis-of-binary-search/


