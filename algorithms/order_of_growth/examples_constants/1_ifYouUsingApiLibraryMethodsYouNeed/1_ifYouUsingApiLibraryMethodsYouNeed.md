# So ...

A lot of times you will be using the code from the java library so you need to know the complexity of those methods, like that moment when you use the random number generation method


java.util.Random.next(n)


# the implementation

From the docs:

Random.nextInt(n) uses Random.next() less than twice on average- it uses it once, and if the value obtained is above the highest multiple of n below MAX_INT it tries again, otherwise is returns the value modulo n (this prevents the values above the highest multiple of n below MAX_INT skewing the distribution), so returning a value which is uniformly distributed in the range 0 to n-1.

According to the docs the java.util.Random.next is implemented as follows

synchronized protected int next(int bits) {
   seed = (seed * 0x5DEECE66DL + 0xBL) & ((1L << 48) - 1);
   return (int)(seed >>> (48 - bits));
 }
So the complexity is O(1)


# source

https://stackoverflow.com/questions/20764300/what-is-on-for-java-util-random-nextn


