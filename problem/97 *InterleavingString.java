/*
Given strings s1, s2, and s3, find whether s3 is formed by an interleaving of s1 and s2.

An interleaving of two strings s and t is a configuration where they are divided into non-empty substrings such that:

s = s1 + s2 + ... + sn
t = t1 + t2 + ... + tm
|n - m| <= 1
The interleaving is s1 + t1 + s2 + t2 + s3 + t3 + ... or t1 + s1 + t2 + s2 + t3 + s3 + ...
Note: a + b is the concatenation of strings a and b.

Example 1:

Input: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac"
Output: true
Example 2:

Input: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc"
Output: false
Example 3:

Input: s1 = "", s2 = "", s3 = ""
Output: true
 
Constraints:

0 <= s1.length, s2.length <= 100
0 <= s3.length <= 200
s1, s2, and s3 consist of lowercase English letters.
*/
class Solution {
  int[][][] dp;
  public boolean isInterleave(String s1, String s2, String s3) {
    dp = new int[s1.length()+1][s2.length()+1][s3.length()+1];
    return dfs(s1.toCharArray(), s2.toCharArray(),s3.toCharArray(),0,0,0);
  }

  private boolean dfs(char[] s1, char[] s2, char[] target, int i, int j, int t){
    if(dp[i][j][t]!=0){
      return dp[i][j][t]==1;
    }

    if(t==target.length){
      return i==s1.length && j==s2.length;
    }
    final boolean si1 =i!=s1.length && s1[i]==target[t];
    final boolean sj2=j!=s2.length && s2[j]==target[t];
    boolean result = false;
    if(si1 && sj2){
      result = dfs(s1, s2, target, i+1, j, t+1) || dfs(s1, s2, target, i, j+1, t+1);
    }else if(si1){
      result = dfs(s1, s2, target, i+1, j, t+1);
    }else if(sj2){
      result = dfs(s1, s2, target, i, j+1, t+1);
    }
    dp[i][j][t]=result?1:-1;
    return result;
  }
}