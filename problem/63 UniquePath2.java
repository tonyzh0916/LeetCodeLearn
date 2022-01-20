/*
A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

Now consider if some obstacles are added to the grids. How many unique paths would there be?

An obstacle and space is marked as 1 and 0 respectively in the grid.

*/
class Solution {
  public int uniquePathsWithObstacles(int[][] obstacleGrid) {
      int[] dp = new int[obstacleGrid.length];
      dp[0]=1;

      for(int j=0; j<obstacleGrid[0].length;j++){
        for(int i=0; i<obstacleGrid.length;i++){
          if(obstacleGrid[i][j]==1){
            dp[i]=0;
          }else if(i>0){
            dp[i]+=dp[i-1];
          }
        }
      }
      return dp[obstacleGrid.length-1];
  }
}
