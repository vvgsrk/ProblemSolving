/* 
 
Problem: 
--------

Write a function to accept 2 parameters which are an array/list and a number. for example, 
think of array has n elements like (1,2,3,4,5) and given number is 6;  
if you add any 3 elements in the array and if it sums up to the given no then function should return true.

Solution:
---------

*/

object problem {

  // Write a Function to accept an array and a number
  def matchValue(no_list: List[Int], match_no: Int) : Boolean = { 
    
     // Convert the list to set to access subsets method
     val num_list = no_list.toSet[Int].subsets.map(_.toList).toList
     
     // Filter the list to get 3 element sets
     val three_element_list = num_list.filter(a => a.size == 3 )
     
     // Calculate the sum of three elements
     val sum_list = three_element_list.map(x => x(0) + x(1) + x(2))
     
     // Return the boolean result if a given no is there in the calculated sum
     sum_list.contains(match_no)
   
  }

}
 
/*

Execute it in Following Way:

scala> matchValue(List(1,2,3,4), 78)
res22: Boolean = false

scala> matchValue(List(1,2,3,4), 7)
res23: Boolean = true
 
scala> matchValue(List(1,2,3,4), 6)
res24: Boolean = true
 
scala> matchValue(List(1,2,3,4), 10)
res25: Boolean = false 

*/