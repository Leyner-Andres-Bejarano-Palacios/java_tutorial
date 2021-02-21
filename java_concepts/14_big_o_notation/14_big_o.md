# 14_big_o_notation

## the concept


Big O is a way to describe how long (if we ae talking about time complexity) or how much memory (if we are talking about space complexity) will our program use when the amount of data increase.

When the function that describe the speed of our program is directly proportional to the amount of data in the dataset we say O(n), where N could be anything like the numbers of elements of an array, the number of nodes in a binary tree, the numbers of characters in a string. You have to say what N is.

O(1) is constant time complexity, means that we havea single operatin.

O(n^2) is a situation where for every element in N we are iterating thought the whole N, which mean we have N * N situation, if for every element in N we are iterating through something diferent than N than we have a O(N * M) time complexity (I dont have a name for that one) where M is a diferente dataset than N.

Quadratic algoritms are  terribly slow, so imagine that you have an array `[1,2,3,5,4,7,5,]` and you are requested to tell how many time do every element appear, what you should do is try to reyce time complexity by storing information, so `{1:1,2;1,3;1,5;2,4;1,7;1,}`, the other question that we should do in a situation like this is ask yourself or the interviwer if you can use external memory.

O(log N) is the logaritmic time complexity,it is a pretty rare one, one of the few places where you will see it is in binary search. It means that after every iteration the size of the element is reduced to half.





### Source

https://www.youtube.com/watch?v=Qn16oJ49AtM

