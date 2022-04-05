/*
Given two striings s and t, determine if they are both one edit distance apart.

There are 3 possibilities to satisfy one edit distance apart

Insert a character intoo s to get t
Delete a character from s to get t
Replace a character of s to get t
*/
class Solution{
  public boolean isOneEditDistance(String s, String t){
    for(int i=0; i<Math.min(s.length(), t.length()); i++){
      if(s.charAt(i)!=t.charAt(i)){
        if(s.length()==t.length()){
          return s.substring(i+1).equals(t.substring(i+1));
        }else if(s.length()<t.length()){
          return s.substring(i).equals(t.substring(i+1));
        }else if(s.length()>t.length()){
          return s.substring(i+1).equals(t.substring(i));
        }
      }
    }
    return Math.abs(s.length()-t.length())==1;
  }
}