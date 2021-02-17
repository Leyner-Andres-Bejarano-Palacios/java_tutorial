# 13_autoboxing

## the concept


Autoboxing. Type parameters have to be instantiated as reference types, so Java has
special mechanisms to allow generic code to be used with primitive types. Recall that
Java’s wrapper types are reference types that correspond to primitive types: Boolean ,
Byte , Character , Double , Float , Integer , Long , and Short correspond to boolean ,
byte , char , double , float , int , long , and short , respectively. Java automatically con-
verts between these reference types and the corresponding primitive types—in assign-
ments, method arguments, and arithmetic/logic expressions. In the present context,

this conversion is helpful because it enables us to use generics with primitive types, as
in the following code:

Stack< Integer> stack = new Stack< Integer>();
stack.push(17);
// auto-boxing (int -> Integer)
int i = stack.pop(); // auto-unboxing (Integer -> int)
Automatically casting a primitive type to a wrapper type is known as autoboxing, and
automatically casting a wrapper type to a primitive type is known as auto-unboxing.
In this example, Java automatically casts (autoboxes) the primitive value 17 to be of
type Integer when we pass it to the push() method. The pop() method returns an
Integer , which Java casts (auto-unboxes) to an int before assigning it to the variable i .


### Source

algorithims by kevin wayne page (real 135)

