# selection sort

### template sort class

![Image](img/templatesortclass.png "template sort class image")

### the algorithm selection sort

![Image](img/SelectionSortp.png "Selectio nSort image")


### How it operate ?????

One of the simplest sorting algorithms works as follows: First, find
the smallest item in the array and exchange it with the first entry (itself if the first entry
is already the smallest). Then, find the next smallest item and exchange it with the sec-
ond entry. Continue in this way until the entire array is sorted. This method is called
selection sort because it works by repeatedly selecting the smallest remaining item.
As you can see from the implementation in Algorithm 2.1, the inner loop of selec-
tion sort is just a compare to test a current item against the smallest item found so far
(plus the code necessary to increment the current index and to check that it does not
exceed the array bounds); it could hardly be simpler. The work of moving the items
around falls outside the inner loop: each exchange puts an item into its final position,
so the number of exchanges is N. Thus, the running time is dominated by the number
of compares.

N pow 2.

it is not stable

### source

-- algoritms fourth edition 261
-- algoritms fourth edition 354
