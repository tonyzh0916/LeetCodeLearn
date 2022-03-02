import java.util.ArrayList;
import java.util.List;

/*
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


 

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]
 

Constraints:

1 <= numRows <= 30
*/
class Solution {
  public List<List<Integer>> generate(int numRows) {
     List<List<Integer>> res = new ArrayList<>();
     List<Integer> list = new ArrayList<>();
     
     for(int i=0; i<numRows; i++){
       list.add(0,1);
       for(int j=1; j<list.size()-1;j++){
         list.set(j, list.get(j)+list.get(j+1));
       }
       res.add(new ArrayList<>(list));
     }
     return res;
  }
}
