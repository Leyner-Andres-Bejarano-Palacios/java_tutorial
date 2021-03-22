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

### 1431  Kids With the Greatest Number of Candies

no so interesting, linear time complexity because I need to access every element, constant space complexity....cant think of something like avoid the heap bad memory use or something like that.... the assert execution, the TDD also important to give a great impressions


#### 1470. Shuffle the Array

could easely do it with linear time complexity, when it comes to space complexity I think is linear, but I'm doubt


#### 1512. Number of Good Pairs

of course the easiest way would be a nested for loop, but that would be quadratic, I will need to find the solution on the internet, daaaannnnmmmmmmmmm


#### 771. Jewels and Stones

Another hidden trap, here we need to avoid  the quadratic time complexity, so the first thing we need to do is create a hasmap (that would be linear M ??????), and after that we can get linear time complexity and constant get operations

### 1603. Design Parking System ********************

Estos sopla monda no dejan concentrarme pa poder responder esto mano

### 1365. How Many Numbers Are Smaller Than the Current Number

I would have to sort this, so at least this would be linearitmic, after that I would only need to know the position where the next number is smaller than the current number....... the next question would be what is the most optimoar sorting mechanism to use in this situation


### 1773. Count Items Matching a Rule

The first that come to my minds is the sequentials search, but can I use the binary search with strings ?? and before of that can I do a sorting long n ?????

### 1342. Number of Steps to Reduce a Number to Zero ????????????????????

completily loss

### 1528. Shuffle String

easy, but the problem is that right now I dont remember what is the best sorting algorithm for not reference objects items

### 1281 Subtract the Product and Sum of Digits of an Integer

This is a nice exercise, do no harm and some good, it has to be lineaar  because  I need to sum all the digits in the number, now cast to string would be too heavy, so the most optimal would be to do it modding the number until we cant do it no more.

### 1313. Decompress Run-Length Encoded List

Has to be linear, really would like to see how the other did this one, after I did it, I would sugest a lazy implementation


### 1678. Goal Parser Interpretation

Not that insteresting, hast to be linear

### 1720. Decode XORed Array

Another not so interesting ------------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> PRETTY IMPORTANT TO IMPLEMENT BEST PRACTICES


### 1389. Create Target Array in the Given Order

has to be linear.... not that insteresting


### 1221. Split a String in Balanced Strings

has to be linear

### 1486. XOR Operation in an Array  ???????????????????????????????????????????????????

honestly, I dont know anything about "compuestas de verdad" 

### 938. Range Sum of BST

Linear, has to pass through every node using recursive method, the doudt I have is what would be the space complexity

## 1614. Maximum Nesting Depth of the Parentheses

Pretty simple, just need to see where it open and where it close, has to be linear, could be a N/2 that is the same as N with constant space complexity

### 1662. Check If Two String Arrays are Equivalent ???????????????????????????????????????????? the optimal ?????????????????????

there are two ways with this, 
    -- if I can sort this, I think it would be log n,,,,,also need to be swapting
    -- if I cant, I would organize this remembering the initial position, at the end if has to be the same string and same positions....naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
    -- I need to be iterating thogh both of them, asking if the smaller is part of the biggest.......jummmmmmmmmmmmmmmm need to analize this further

### 1684. Count the Number of Consistent Strings ?????????????????????????????????????????????????????' the optimal ?????????????????????????????


### 1656. Design an Ordered Stream ???????????????????????? I didnt understand what should I do ?????????????????

### 1179. Reformat Department Table ????????????????????????????????????????????????? how to do it, I can think of a good solution, so lets write it down and look how good sql look like

### 1290. Convert Binary Number in a Linked List to Integer 

There is something interesting about this problem, sure this needs to be linear because I need to go though every node but when it generate the representation of all the binary numbers, is it a constant time complexity operation ??????


### 1588. Sum of All Odd Length Subarrays ??????????? damn, wonder how did they did it optimally ??????????

In the way I see it I need the factorial, the combinational method, the difference with the last one  I did it was to change the 2 by the 1, 3 and so on depending on the array lenght

### 1688. Count of Matches in Tournament ?????????? the sequential way its pretty obvious but I wonder if is there something more optimal


### 1732. Find the Highest Altitude

Find the highest value problem, first we sort (I think there is a log n way of doing that) and binary search

### 1534. Count Good Triplets

My brute force implementation would be to find every possible triplets and have a method that tell me which one are compliance with the requirements

### 709. To Lower Case

The brute force implementation would be using the lower() in a string, the interesting question would be to know the time and space complexity, my guess, linear time complexity and constant complexity


### 1266. Minimum Time Visiting All Points

Daaaaaaannnnmmmmm one of these questions about find the shortest path,,,,,,,, great oportunity to apply those concepts


### 1021. Remove Outermost Parentheses

The way I see it this has to be linear, but lets see how did everybody did it

### 804. Unique Morse Code Words

mmmmmmm well I will see these guys implementation

### 1295. Find Numbers with Even Number of Digits

Has to be linear, I need to iterate though every one of those elements

### 1252. Cells with Odd Values in a Matrix 

This question is really hard to read

### 595. Big Countries

Is There some optimization (or in term of redabiliyt ot bst pratice) that I shouldapply ??????

### 832. Flipping an Image

I has to be honest with myself, I'm just reading these questions without even stop to think how should I do it.

### 1323. Maximum 69 Number

this is pretty interesting one, the brute force implementation would be a linear solution, the better want would be a binary search like implementation where I take the avrage  of every half until I find the first half where the six appear

### 1725. Number Of Rectangles That Can Form The Largest Square

I have way to many things to do men, if I stop to think about this with all the things I have still waiting i my to do list I will suffer a stroke

### 627. Swap Salary

This look suspiciosly easy, so I need to optimeze (starting by understating what optimize mean when talking about sql), and look other people solution in caase that there is something that I am not understanding

### 1572. Matrix Diagonal Sum

Overviwing this, I can think of optimization over the subprocess, for example, every time I add something to the sum I must also insert in a ordered array, that will make it easier to determine if an element is in the array with a binary search

### 1309. Decrypt String from Alphabet to Integer Mapping

The brute force implementation that I can think of is linear, lets see those other people implementation

### 1436. Destination City

The way I see it, has to be linear


### 1370. Increasing Decreasing String

Find the smallest or greatest, I have to look for implementation in the book because I think that there are 
O(log-n) so the final solution would be O(nlog-n)

### 1464. Maximum Product of Two Elements in an Array

find the greatest and the second greatest

### 1450. Number of Students Doing Homework at a Given Time

another stroke

### 1704. Determine if String Halves Are Alike

dannnnmmmmmmmm,  linear is the best one I can think of, ,,,,,, I'll see the other homies solutions
