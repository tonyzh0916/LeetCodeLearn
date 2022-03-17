import java.util.ArrayList;
import java.util.List;

/*
Given a string s, partition s such that every substring of the partition is a palindrome. Return all possible palindrome partitioning of s.

A palindrome string is a string that reads the same backward as forward.

Example 1:

Input: s = "aab"
Output: [["a","a","b"],["aa","b"]]
Example 2:

Input: s = "a"
Output: [["a"]]
 

Constraints:

1 <= s.length <= 16
s contains only lowercase English letters.
*/
class Solution {
  public List<List<String>> partition(String s) {
      List<List<String>> res = new ArrayList<>();
      helper(res, s, new ArrayList<>(), 0);
      return res;
  }

  private void helper(List<List<String>> res, String s, List<String> temp, int start){
    if(start == s.length()){
      res.add(new ArrayList<>(temp));
      return;
    }
    for(int i=start+1; i<=s.length();i++){
      if(isValid(s.substring(start, i))){
        temp.add(s.substring(start, i));
        helper(res, s, temp, i);
        temp.remove(temp.size()-1);
      }
    }
  }

  private boolean isValid(String s){
    int left =0;
    int right=s.length()-1;

    while(left<right){
      if(s.charAt(left)!=s.charAt(right)) return false;
      left++;
      right--;
    }
    return true;
  }
}