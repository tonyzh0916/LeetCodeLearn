import java.util.HashMap;
import java.util.HashSet;

/*
 * 
 Given a string s and an integer k, return the length of the longest substring of s that contains at most k distinct characters.

Example 1:

Input: s = "eceba", k = 2
Output: 3
Explanation: The substring is "ece" with length 3.
Example 2:

Input: s = "aa", k = 1
Output: 2
Explanation: The substring is "aa" with length 2.
 */

 class Solution{
  public int lengthOfLongestSubstringKDistinct(String s, int k){
    HashMap<Character, Integer> map = new HashMap<>();
    int size = 0, start=0;
    for(int i=0; i<s.length(); i++){
      map.put(s.charAt(i),i);
      if(map.size()>2){
        int sIndex = i;
        for(int index : map.values()){
          sIndex=  Math.min(sIndex, index);
        }

        start = sIndex+1;
        map.remove(s.charAt(sIndex));
      }
      size = Math.max(size, i-start+1);
    }
    return size;
  }
 }