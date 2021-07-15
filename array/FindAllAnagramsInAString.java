/*
Write a code to find all Anagrams in a String. Given a string s and a non-empty string p, find all the start indices of p’s anagrams in s.
Both the strings only consists of lowercase English letters. The length of both strings s and p will not be larger than 20,100.
The order of output does not matter.

Example 1:
Input:   s: “cbaebabacd” p: “abc”
Output:  [0, 6]

Explanation:
The substring with start index = 0 is “cba”, which is an anagram of “abc”.
The substring with start index = 6 is “bac”, which is an anagram of “abc”.

Example 2:
Input: s: “abab” p: “ab”
Output: [0, 1, 2]

Explanation:
The substring with start index = 0 is “ab”, which is an anagram of “ab”.
The substring with start index = 1 is “ba”, which is an anagram of “ab”.
The substring with start index = 2 is “ab”, which is an anagram of “ab”.
*/

class Solution {
  public List<Integer> findAnagrams(String s, String p) {
      List<Integer> result = new ArrayList<>();

      int pLen = p.length();
      int sLen = s.length();

      if(s==null || sLen==0 || sLen<pLen) return result;

      int[] pArr =new int[26];
      int[] sArr =new int[26];

      for(int i=0; i<pLen;i++){
        pArr[p.charAt(i)-'a']++;
        sArr[s.charAt(i)-'a']++;
      }

      for(int i=0; i<sLen-pLen;i++){
        if(isAnagram(pArr,sArr)){
          result.add(i);
        }
        sArr[s.charAt(i)-'a']--;
        sArr[s.charAt(i+pLen)-'a']++;

      }
      if(isAnagram(pArr,sArr)){
        result.add(sLen-pLen);
      }
      return result;
  }

  public static boolean isAnagram(int[] pArr, int[] sArr){
    for(int i=0; i<pArr.length;i++){
      if(pArr[i]!=sArr[i]){
        return false;
      }
    }
    return true;
  }
}