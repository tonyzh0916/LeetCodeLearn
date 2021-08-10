/*
Given an integer matrix, find a submatrix where the sum of numbers is zero. Your code should return the 
corrdinate of the left-up and right-dwon number 

Example 

1,5, 7
3,7, -8     ==>return (1,1), (2,2)
4,-8,9
*/

public int[][] submatrixSum(int[][] matrix){
  int n = matrix.length;
  if(m==0){
    throw new IllegalArgumentException();
  }

  int n = matrix[0].length;
  int[][] res = new   int[2][2];
  int[][] sums = preComputeColSumMatrix(matrix);
}

// 未完