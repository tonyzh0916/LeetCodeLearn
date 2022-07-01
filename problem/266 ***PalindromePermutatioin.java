/*
 * Given a string, determine if a permutation of the string could form a palindrome.

Example 1:

Input: "code"
Output: false
Example 2:

Input: "aab"
Output: true
Example 3:

Input: "carerac"
Output: true
 */
class Solution{
  public boolean canPermutePalindrome(String s){
    int[] dict = new int[26];

    for(int i=0; i<s.length(); i++){
      char a= s.charAt(i);
      dict[a-'a']++;
    }

    boolean add = false;

    for(int num : dict){
      if(num%2==0) continue;
      if(add == true) return false;
      add = true;
    }
    return true;
  }
}