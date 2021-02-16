### 1.2.4 What does the following code fragment print?:


String string1 = "hello";
String string2 = string1;
string1 = "world";
StdOut.println(string1);
StdOut.println(string2);

### solution

unlike python, when you assign a variable, you are not referencig a the second variable to the first one, you are creating a copy.

### source

head first java (forget the page)


### 1.2.5 What does the following code fragment print?:

String s = "Hello World";
s.toUpperCase();
s.substring(6, 11);
StdOut.println(s);


### solution

Answer : "Hello World" . String objects are immutable—string methods return
a new String object with the appropriate value (but they do not change the value
of the object that was used to invoke them). This code ignores the objects returned
and just prints the original string. To print "WORLD" , use s = s.toUpperCase() and
s = s.substring(6, 11) .


### 1.2.6  indexOf

A string s is a circular rotation of a string t if it matches when the characters
are circularly shifted by any number of positions; e.g., ACTGACG is a circular shift of
TGACGAC , and vice versa. Detecting this condition is important in the study of genomic
sequences. Write a program that checks whether two given strings s and t are circular

### solution

StringRotation.java

### 1.2.7 What does the following recursive function return?

public static String mystery(String s)
{
    int N = s.length();
    if (N <= 1) return s;
    String a = s.substring(0, N/2);
    String b = s.substring(N/2, N);
    return mystery(b) + mystery(a);
}

### solution

The same string that was pass as an argument



