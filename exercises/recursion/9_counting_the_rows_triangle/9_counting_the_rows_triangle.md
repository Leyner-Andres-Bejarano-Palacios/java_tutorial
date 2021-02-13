# the problem 


We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks, and so on. 

triangle(0) → 0
triangle(1) → 1
triangle(2) → 3


# the solution

public int triangle(int rows) {
  if (rows == 0) return 0;
  return rows + triangle(rows-1);
}