# equality

What does it mean for two objects to be equal? If we test equality with
(a == b) where a and b are reference variables of the same type, we are testing whether
they have the same identity : whether the references are equal. Typical clients would
rather be able to test whether the data-type values (object state) are the same, or to
implement some type-specific rule. Java gives us a head start by providing implementa-
tions both for standard types such as Integer , Double , and String and for more com-
plicated types such as File and URL . When using these types of data, you can just use the
built-in implementation. For example, if x and y are String values, then x.equals(y)
is true if and only if x and y have the same length and are identical in each character
position. When we define our own data types, such as Date or Transaction , we need
to override equals() . Java’s convention is that equals() must be an equivalence rela-
tion. It must be
■ Reflexive : x.equals(x) is true.
■ Symmetric : x.equals(y) is true if and only if y.equals(x).
■ Transitive : if x.equals(y) and y.equals(z) are true , then so is x.equals(z).
In addition, it must take an Object as argument and satisfy the following properties.
■ Consistent : multiple invocations of x.equals(y) consistently return the same
value, provided neither object is modified.
■ Not null : x.equals(null) returns false.

### keep in mind

Use == to compare
two primitives,
or to see if two
references refer to
the same object.
Use the equals()
method to see
if two different
objects are equal.

### Source

algorithims by kevin wayne page 102 (real 115)

### Source 2

heaed first java 
