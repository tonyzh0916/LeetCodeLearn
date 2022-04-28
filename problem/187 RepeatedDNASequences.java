import java.util.ArrayList;
import java.util.HashSet;

/*abstract

The DNA sequence is composed of a series of nucleotides abbreviated as 'A', 'C', 'G', and 'T'.

For example, "ACGAATTCCG" is a DNA sequence.
When studying DNA, it is useful to identify repeated sequences within the DNA.

Given a string s that represents a DNA sequence, return all the 10-letter-long sequences (substrings) that occur more than 
once in a DNA molecule. You may return the answer in any order.

Example 1:

Input: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
Output: ["AAAAACCCCC","CCCCCAAAAA"]
Example 2:

Input: s = "AAAAAAAAAAAAA"
Output: ["AAAAAAAAAA"]
*/
class Solution {
  public List<String> findRepeatedDnaSequences(String s) {
      HashSet<String> seen = new HashSet<>();
      HashSet<String> repeated = new HashSet<>();
      for(int i=0; i<s.length()-9 ; i++){
        String temp = s.substring(i, i+10);
        //when add a new temp into hashSeet, it will return a true or false that stand for the number already
        //in the hashset or not
        if(!seen.add(temp)){
          repeated.add(temp);
        }
      }
      return new ArrayList<>(repeated);
  }
}