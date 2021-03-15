# recording all the process that I went through to become a better programmer, leetcode

# easy section

Until this point I have been learning using the book head first java and algorithms by kevin wayne, so now, let's put our feet in water and start solving some problems.

### 1480. Running Sum of 1d Array

In order to solve this I need to access all of the elements in the array, so is obligatory to have a linear time complexity and the sum of the elements until every iteration can be kept in a variable so the space complexity can be constant, in terms of best practices I follow the instructions of clean code it can make the code more readeble also that it create more standard code due to the fact that this book is th instruccion followed by all the programmers in Colombia to wirte code...................................... the variables names, method names and ..

[link to the leetcode 1480](https://leetcode.com/problems/running-sum-of-1d-array/)

### 1480. Running Sum of 1d Array  --- questions for myself

Q1 : Am I creating a new object in every iteration ?
Q" : Should I use the len(N) or put that in an array ?

### 1108. Defanging an IP Address

Pretty much the same, a for look would get this done, now, would a replace code change this ?? now thats an interesting one, another thing to have in mind is that due to the fact we will need a for loop there will be an internal loop, and in order to avoid a string creation in every iteration we will need a stringbuilder

### 1672. Richest Customer Wealth

This also need linear time complexity, I have to iterate though every element in the array, the space complexity can be constant because the variable where I keep the biggest wealth can vary if a bigger wealth appear. Something interesting to analize would be a faster way to iterate like a map. Asking if we will work on an external input or an instance variable so we can determine if we need a static method. Also, in the python section use every PEP like the fist line coding, the shebang ....etc