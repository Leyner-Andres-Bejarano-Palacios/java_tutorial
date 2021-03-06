# curiosities part 1

Q. What is the value of Math.abs(-2147483648) ?
A. -2147483648 . This strange (but true) result is a typical example of the effects of
integer overflow.

Q. How can I initialize a double variable to infinity?
A. Java has built-in constants available for this purpose: Double.POSITIVE_INFINITY
and Double.NEGATIVE_INFINITY .

Q. Can you compare a double to an int ?
A. Not without doing a type conversion, but remember that Java usually does the req-
uisite type conversion automatically. For example, if x is an int with the value 3 , then
the expression (x < 3.1) is true —Java converts x to double (because 3.1 is a double
literal) before performing the comparison.

Q. What happens if I use a variable before initializing it to a value?
A. Java will report a compile-time error if there is any path through your code that
would lead to use of an uninitialized variable.

Q. What are the values of 1/0 and 1.0/0.0 as Java expressions?
A. The first generates a runtime exception for division by zero (which stops your pro-
gram because the value is undefined); the second has the value Infinity .


Q. Can you use < and > to compare String variables?
A. No. Those operators are defined only for primitive types. See page 80.

Q. What is the result of division and remainder for negative integers?
A. The quotient a/b rounds toward 0 ; the remainder a % b is defined such that (a /
b) * b + a % b is always equal to a . For example, -14/3 and 14/-3 are both -4 , but
-14 % 3 is -2 and 14 % -3 is 2 .

Q. Why do we say (a && b) and not (a & b) ?
A. The operators & , | , and ^ are bitwise logical operations for integer types that do and,
or, and exclusive or (respectively) on each bit position. Thus the value of 10&6 is 14 and
the value of 10^6 is 12 . We use these operators rarely (but occasionally) in this book.
The operators && and || are valid only in boolean expressions are included separately
because of short-circuiting: an expression is evaluated left-to-right and the evaluation
stops when the value is known.



Q. What is the difference between a for loop and its while formulation?
A. The code in the for loop header is considered to be in the same block as the for
loop body. In a typical for loop, the incrementing variable is not available for use in
later statements; in the corresponding while loop, it is. This distinction is often a rea-
son to use a while instead of a for loop.

Q. Some Java programmers use int a[] instead of int[] a to declare arrays. What’s
the difference?
A. In Java, both are legal and equivalent. The former is how arrays are declared in C.
The latter is the preferred style in Java since the type of the variable int[] more clearly
indicates that it is an array of integers.

Q. Why do array indices start at 0 instead of 1 ?
A. This convention originated with machine-language programming, where the ad-
dress of an array element would be computed by adding the index to the address of the
beginning of an array. Starting indices at 1 would entail either a waste of space at the
beginning of the array or a waste of time to subtract the 1 .

Q. If a[] is an array, why does StdOut.println(a) print out a hexadecimal integer,
such as @f62373 , instead of the elements of the array?
A. Good question. It is printing out the memory address of the array, which, unfortu-
nately, is rarely what you want.

Q. Why are we not using the standard Java libraries for input and graphics?
A. We are using them, but we prefer to work with simpler abstract models. The Java
libraries behind StdIn and StdDraw are built for production programming, and the
libraries and their APIs are a bit unwieldy. To get an idea of what they are like, look at
the code in StdIn.java and StdDraw.java .

Q. Can my program reread data from standard input?
A. No. You only get one shot at it, in the same way that you cannot undo println() .

Q. What happens if my program attempts to read after standard input is exhausted?
A. You will get an error. StdIn.isEmpty() allows you to avoid such an error by check-
ing whether there is more input available.

Q. What does this error message mean?
Exception in thread "main" java.lang.NoClassDefFoundError: StdIn
A. You probably forgot to put StdIn.java in your working directory.

Q. Can a static method take another static method as an argument in Java?
A. No. Good question, since many other languages do support this capability.

## Source

### 1

algorithms page 51 real 64

### 2


