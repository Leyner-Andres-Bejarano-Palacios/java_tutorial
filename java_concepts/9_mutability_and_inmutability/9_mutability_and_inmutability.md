# mutability_and_inmutability

Whether to make a data type immutable is an important design decision and depends on the application at hand. For data
types such as Date , the purpose of the abstraction is to encapsulate values that do not change so that we can use them in assignment statements and as arguments and return values from functions in the same way as we use primitive types (without having to worry about their values changing). A programmer implementing a Date client might reasonably expect to write the code d = d0 for two Date variables, in the same way as for double or int values. But if Date were mutable and the value of d were to change after the assignment d = d0 , then the value of d0 would also change (they are both references to the same object)! On the other hand, for data types such as Counter and Accumulator , the very purpose of the abstraction is to encapsulate values as they change. You have already encountered this distinction as a client programmer, when
using Java arrays (mutable) and Java’s String data type (immutable). When you pass a String to a method, you do not worry about that method changing the sequence of characters in the String , but when you pass an array to a method, the method is free to change the contents of the array. String objects are immutable because we generally do
not want String values to change, and Java arrays are mutable because we generally do want array values to change. There are also situations where we want to have mutable strings (that is the purpose of Java’s StringBuilder class) and where we want to have immutable arrays (that is the purpose of the Vector class that we consider later in this
section). Generally, immutable types are easier to use and harder to misuse than mutable types because the scope of code that can change their values is far smaller. It is easier to debug code that uses immutable types because it is easier to guarantee that variables in client code that uses them remain in a consistent state. When using mutable types,


you must always be concerned about where and when their values change. The down-
side of immutability is that a new object must be created for every value. This expense is
normally manageable because Java garbage collectors are typically optimized for such
situations. Another downside of immutability stems from the fact that, unfortunately,
final guarantees immutability only when instance variables are primitive types, not
reference types. If an instance variable of a reference type has the final modifier, the
value of that instance variable (the reference to an object) will never change—it will
always refer to the same object—but the value of the object itself can change. For ex-
ample, this code does not implement an immutable type:
public class Vector
{
private final double[] coords;
public Vector(double[] a)
{ coords = a; }
...
}
A client program could create a Vector by specifying the entries in an array, and then
(bypassing the API) change the elements of the Vector after construction:
double[] a = { 3.0, 4.0 };
Vector vector = new Vector(a);
a[0] = 0.0; // Bypasses the public API.
The instance variable coords[] is private and final , but Vector is mutable because
the client holds a reference to the data. Immutability needs to be taken into account in
any data-type design, and whether a data type is immutable should be specified in the
API, so that clients know that object values will not change. In this book, our primary
interest in immutability is for use in certifying the correctness of our algorithms. For
example, if the type of data used for a binary search algorithm were mutable, then cli-
ents could invalidate our assumption that the array is sorted for binary search.

### Source

algorithims by kevin wayne page 105 (real 118)


