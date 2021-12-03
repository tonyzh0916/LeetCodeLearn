/*
Given a string s, find the length of the longest substring without repeating characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
Example 4:

Input: s = ""
Output: 0
 

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
*/

class Solution {
  public int lengthOfLongestSubstring(String s) {
      if(s==null || s.length()==0) return 0;
      
      HashMap<Character, Integer> map = new HashMap<>();
      int maxLen =1;
      int left =0;
      //pwwkew
      for(int i=0; i<s.length(); i++){
          char c = s.charAt(i);
          if(map.containsKey(c)){
              left = Math.max(left, map.get(c)+1);
          }
          
          if(i-left+1>maxLen){
              maxLen = i-left+1;
          }
          map.put(c,i);
      }
      return maxLen;
  }
}

///-----12/1/2021------
class Solution {
    public int lengthOfLongestSubstring(String s) {
       if(s==null || s.length()==0) return 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
       int maxLen = 1;
       int left = 0;
       for(int i=0; i<s.length(); i++){
           char c = s.charAt(i);
           if(map.containsKey(c)){
               left = Math.max(left, map.get(c)+1);
           }
           if(i+1-left > maxLen){
               maxLen = i+1-left;
           }
           map.put(c.i);
       }
       return maxLen;
    }
  }
//----12/2/2021
class Solution{
    public int lengthOfLongestSubstring(String s){
        if(s==null || s.length()==0) return 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int maxLen = 1;
        int left = 0;
        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                left = Math.max(left, map.get(c)+1);
            }
            if(i+1-left>maxLen){
                maxLen=i+1-left
            }
            map.put(c,i);
        }
        return maxLen;
    }
}
