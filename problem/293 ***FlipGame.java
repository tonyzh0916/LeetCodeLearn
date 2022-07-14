import java.util.ArrayList;
import java.util.List;

/*
 * You are playing the following Flip Game with your friend: Given a string that contains only these 
 * two characters: + and -, you and your friend take turns to flip two consecutive “++” into “–”. The game ends when a person can no longer make a move and therefore the other person will be the winner.

Write a function to compute all possible states of the string after one valid move.

Example:

Input: s = "++++"
Output:
[
  "--++",
  "+--+",
  "++--"
]
Note: If there is no valid move, return an empty list [].
 */
class Solution{
  public List<String>  generatePossibleNextMoves(String s){
    List<String> res = new ArrayList<>();

    for(int i=1; i<s.length();i++){
      if(s.charAt(i)=='+'&&s.charAt(i-1)=='+'){
        char[] arr = s.toCharArray();
        arr[i-1]='-';
        arr[i]='-';
        res.add(new String(arr));
      }
    }
    return res;
  }
}