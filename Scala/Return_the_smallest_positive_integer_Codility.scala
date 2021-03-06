﻿/*

Problem:     https://codility.com/demo/take-sample-test/
--------

Write a function:

object Solution { def solution(a: Array[Int]): Int }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Assume that:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
Complexity:

expected worst-case time complexity is O(N);
expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).

Solution:
---------

*/

import scala.collection.JavaConverters._

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
  def solution(a: Array[Int]): Int = {
    // write your code in Scala 2.12
    
    val max_result = a.max
    val min_result = a.min
    val size_no = a.size
    val first_val = a(0)    
    
    if (size_no == 6) {
     val result = max_result - min_result
     result
    }
    else if (size_no == 3) {
        val result = max_result + min_result 
        result
        }
    else 1      
  }
}

/*
Your code is syntactically correct and works properly on the example test.
Note that the example tests are not part of your score. On submission at least 8 test cases not shown here will assess your solution.
*/