/*
Maximum Submatrix
Given an integer matrix. fina a submatrix where the sum  of numbers is  maximum. Your code should return  the max sum
Example

[
 [1,-2,-4],
 [1,-1,-1],
 [-2,3, 4],
]
3,4 so return 7
*/
//return a helper matrix whose (i,j) element is  the sum of  (0,j)  to (i,j) on jth column  
//O(n^2)

private int[][] preComputeColumnSumMatrix(int[][] m){
  int columnLength = m[0].length, rowLength = m.length;
  int[][] result = new int[rowLength][columnLength];
  {
    result[0][col] = m[0][col];
    for(int row=1; row<rowLength;row++){
      result[row][col] =  result[row-1][col]+m[row][col];
    }
  }
  return result;
}

//return the sum from "startRow" to "endRow" on column "nthColumn\"
//constant time
private int getColumnSum(int startRow, int endRow, int nthColumn,  int[][] columnSumMatrix){
  if(startRow==0){
    return columnSumMatrix[endRow][nthColumn];
  }
  return columnSumMatrix[endRow][nthColumn]-columnSumMatrix[startRow-1][nthColumn];
}


public int maxSubmatrixSum(int[][] matrix){
  int[][] rowSumMatrix = preComputeColumnSumMatrix(matrix);
  int  m= matrix.length, n=matrix[0].length;
  int res=0;
  for(int startRow=0; startRow<m; startRow++){
    for(int endRow=startRow; endRow<m;  endRow++){
      //build the column Sum Array from StartRow to EndRow
      int[] columnSums = new int[n];
      for(int col=0; col<n; col++){
        getColumnSums[col] = getColumnSum(startRow,  endRow, col, rowSumMatrix);
      }
      //compare  the current max  with global max
      int curMax = maxSubArray(columnSums);
      res = Math.max(curMax,res);
    }
  }
  return res;
}