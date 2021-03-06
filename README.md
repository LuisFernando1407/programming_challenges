<h2>Challenge 1</h2>

A non-empty array A consisting of N integers is given. The array contains an odd number of elements, and each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.<br>
For example, in array A such that: <br>
  `A[0] = 9  A[1] = 3  A[2] = 9` <br>
  `A[3] = 3  A[4] = 9  A[5] = 7` <br>
  `A[6] = 9`
- the elements at indexes 0 and 2 have value 9,
- the elements at indexes 1 and 3 have value 3,
- the elements at indexes 4 and 6 have value 9,
- the element at index 5 has value 7 and is unpaired.

<h3>Write a function</h3>

Given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.
<br>For example, given array A such that: <br>
  `A[0] = 9  A[1] = 3  A[2] = 9` <br>
  `A[3] = 3  A[4] = 9  A[5] = 7` <br>
  `A[6] = 9`
- The function should return 7, as explained in the example above.
- Write an efficient algorithm for the following assumptions:
  * Space complexity O(1) <br>
  * Time complexity O(n) <br>
 
<h2>Challenge 2</h2>
A non-empty array A consisting of N integers is given. The array contains an odd number of elements, and each element of the array can be paired with another element that has the same value, except for one or more elements that is left unpaired.<br>
 
<h3>Write a function</h3>

Given an array A consisting of N integers fulfilling the above conditions, returns the values of the unpaired elements.<br>
For example, in array A such that: <br>
   `A[0] = 9  A[1] = 3  A[2] = 9` <br>
   `A[3] = 3  A[4] = 9  A[5] = 7` <br>
   `A[6] = 9  A[7] = 8  A[8] = 1` <br>
- the function should return 7, 8, 1, as explained in the example above.
- Write an efficient algorithm for the following assumptions:
  * Time complexity O(n) <br>                                                                              
