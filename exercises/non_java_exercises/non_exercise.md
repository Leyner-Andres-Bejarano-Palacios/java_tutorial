# 1.1.1 Give the value of each of the following expressions:

### exercise 1.1.1 a

( 0 + 15 ) / 2

### solution 1.1.1 a

the parenthesis is telling us that we should do the sum first so this is another way of expression this is 15 / 2, so the only questino we have is if the result of this will be stored in a int or a decimal (float or double)

### exercise 1.1.1 b

2.0e-6 * 100000000.1

### solution 1.1.1 b

firs we need to say that 2.0e-6 is 2 power (-6) the resulting number is 0.{5 zeros here}2  multiplicating 100000000.1, so the real question is 100000000.1 * 0.0000020

### exercise 1.1.1 c

true && false || true && true

### solution 1.1.1 c

Some parenthesis here would be really helpful, but its ok, so, as mentioned earlier "The operators && and || are valid only in boolean expressions are included separately because of short-circuiting: an expression is evaluated left-to-right and the evaluation stops when the value is known."..... so the first evaluation  

true && false

result in false, the resulting expresion is  false || true && true

The next evaluation

false || true

Would be true, the resulting expression would be true && true

The result of everything would be true

# 1.1.2 Give the type and value of each of the following expressions:

### exercise 1.1.2 a

(1 + 2.236)/2

### solution 1.1.2 a

the result is a decimal, specically a float due to the few decimals of the results-----> 1,618

### exercise 1.1.2 b

1 + 2 + 3 + 4.0

### solution 1.1.2 b

java do type conversion for this operations, at the end we have 10.0, a float

### exercise 1.1.2 c

4.1 >= 4

### solution 1.1.2 c

boolean, true

### exercise 1.1.2 d

1 + 2 + "3"

### solution 1.1.2 d

"33"

### exercise 1.1.4

in java there are no special keyword then

#### exercise 1.1.10

What is wrong with the following code fragment?
int[] a;
for (int i = 0; i < 10; i++)
    a[i] = i * i;

#### solution 1.1.10

Solution: It does not allocate memory for a[] with new . This code results in a
variable a might not have been initialized compile-time error.


#### exercise 1.1.13

Write a static method lg() that takes an int value N as argument and returns
the largest int not larger than the base-2 logarithm of N . Do not use Math .

#### solution 1.1.13

so,first,how do we do logarithm without the math class

double ln(double x)
{
    double old_sum = 0.0;
    double xmlxpl = (x - 1) / (x + 1);
    double xmlxpl_2 = xmlxpl * xmlxpl;
    double denom = 1.0;
    double frac = xmlxpl;
    double term = frac;                 // denom start from 1.0
    double sum = term;

    while ( sum != old_sum )
    {
        old_sum = sum;
        denom += 2.0;
        frac *= xmlxpl_2;
        sum += frac / denom;
    }
    return 2.0 * sum;
}



lo que sigue es usando la identidad, sacamos la del 2

double log2( double x ) {
    return ln(x) / ln(2);    
}

#### 1.1.19

Es linear asi que planteando que una ejecucion con N valiendo 1 tomaria que N sea igual a 60 para que esto alcanze una hora de duracion

#### 1.1.20

the problem is a base fibonacci, that was first, space optimized

https://www.geeksforgeeks.org/program-for-nth-fibonacci-number/


### 1.1.22 Write a version of BinarySearch that uses the recursive rank() given on page
25 and traces the method calls. Each time the recursive method is called, print the argu-
ment values lo and hi , indented by the depth of the recursion. Hint: Add an argument
to the recursive method that keeps track of the depth.

### R/ yo lo haria con static variables


### 1.1.29 Equal keys. Add to BinarySearch a static method rank() that takes a key and
a sorted array of int values (some of which may be equal) as arguments and returns the
number of elements that are smaller than the key and a similar method count() that
returns the number of elements equal to the key. Note : If i and j are the values returned
by rank(key, a) and count(key, a) respectively, then a[i..i+j-1 ] are the values in
the array that are equal to key .


### 1.1.34 Filtering. Which of the following require saving all the values from standard
input (in an array, say), and which could be implemented as a filter using only a fixed
number of variables and arrays of fixed size (not dependent on N)? For each, the input
comes from standard input and consists of N real numbers between 0 and 1.


Print the maximum and minimum numbers.
Print the median of the numbers.
Print the k th smallest value, for k less than 100.
Print the sum of the squares of the numbers.
Print the average of the N numbers.
Print the percentage of numbers greater than the average.
Print the N numbers in increasing order.
Print the N numbers in random order.


# source

algorithms page 54 real 67 