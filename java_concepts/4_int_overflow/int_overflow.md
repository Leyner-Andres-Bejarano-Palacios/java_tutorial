# int overflow

# book question

It seems wrong that Java should just let int s overflow and give bad values. Shouldn’t
Java automatically check for overflow?

# book answer

This issue is a contentious one among programmers. The short answer is that the
lack of such checking is one reason such types are called primitive data types. A little
knowledge can go a long way in avoiding such problems. We use the int type for small
numbers (less than ten decimal digits), and the long type when values run into the bil-
lions or more.

# internet answer

As int data type is 32 bit in Java, any value that surpasses 32 bits gets rolled over. In numerical terms, it means that after incrementing 1 on Integer. MAX_VALUE (2147483647), the returned value will be -2147483648. In fact you don't need to remember these values and the constants Integer.

## Source

### 1

algorithms page 51 real 64

### 2

https://www.google.com/search?q=java+int+overflow&oq=java+int+over&aqs=chrome.0.0l2j69i57j0j0i10l3j69i60.3325j0j7&sourceid=chrome&ie=UTF-8
