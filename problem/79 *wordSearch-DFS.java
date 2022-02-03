import java.util.HashSet;

/*
Given an m x n grid of characters board and a string word, return true if word exists in the grid.
The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally 
or vertically neighboring. The same letter cell may not be used more than once.

Example 1:

Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
Output: true
Example 2:

Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
Output: true
Example 3:

Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
Output: false
 
Constraints:

m == board.length
n = board[i].length
1 <= m, n <= 6
1 <= word.length <= 15
board and word consists of only lowercase and uppercase English letters.
*/

class Solution {
  public boolean exist(char[][] board, String word) {
      for(int i = 0; i < board.length; i++){
          for(int j = 0; j < board[0].length; j++){
              if(board[i][j] == word.charAt(0)){
                  if(dfs(board, i, j, 0, word, new HashSet<>())){
                      return true;
                  }
              }
          }
      }

      return false;
  }

  private boolean dfs(char[][] board, int i, int j, int index, String word, HashSet<String> visited){
      if(index == word.length()) return true;
      if(i < 0 || i >= board.length || j < 0 || j >= board[0].length
         || visited.contains(i + "," + j)
         || board[i][j] != word.charAt(index)) return false;

      visited.add(i + "," + j);

      if(dfs(board, i + 1, j, index + 1, word, visited)
          || dfs(board, i - 1, j, index + 1, word, visited)
          || dfs(board, i, j + 1, index + 1, word, visited)
          || dfs(board, i, j - 1, index + 1, word, visited)){
          return true;
      }

      visited.remove(i + "," + j);
      return false;
  }
}