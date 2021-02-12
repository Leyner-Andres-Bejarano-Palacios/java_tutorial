# the problem 


Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).


# the solution

public int countX(String str) {
  if (str.equals("")) return 0;
  if (str.charAt(0) == 'x') return 1 + countX(str.substring(1));
  else return countX(str.substring(1));
}