/* 304 leetcode 
Given a 2D matrix matrix, handle multiple queries of the following type:

Calculate the sum of the elements of matrix inside the rectangle defined by its upper left corner (row1, col1) and 
lower right corner (row2, col2).
Implement the NumMatrix class:

NumMatrix(int[][] matrix) Initializes the object with the integer matrix matrix.
int sumRegion(int row1, int col1, int row2, int col2) Returns the sum of the elements of matrix inside the rectangle 
defined by its upper left corner (row1, col1) and lower right corner (row2, col2).


3 0 1 4 2
5 6 3 2 1
1 2 0 1 5
4 1 0 1 7
1 0 3 0 5

..............
.     .      .
.   A .   B  .
..............      
.  C  .   D  .
..............
*/
private int[][] sums;
public NumMatrix2(int[][] matrix){
  int m = matrix.length; //row
  if(m==0){
    return;
  }
  int n = matrix[0].length; //column
  if(n==0){
    return;
  }
  this.sums = new int[m+1][n+1];
  //sums[0][0]=0 and first column/row is  0
  //sums[i+1][j+1]= matrix[0,0~i,j], shifted by 1
  for(int i=0;i<m;i++){
    for(int j=0; j<n;j++){
      //matrix[0,0~i,j]=
      //matrix[i][j] + matrix[0,0~i-1,j]+matrix[0,0~i,j-1]-matrix[0,0~i-1,j-1]
      this.sums[i+1][j+1] = matrix[i][j]+this.sums[i][j+1]+this.sums[i+1][j]-this.sums[i][j];
    }
  }
}


matrix[row1, col1 ~ row2, col2] = D=(A+B+C+D)-(A+C)-(A+B)+A=
matrix[0,0~row2,col2]-matrix[0,0~row1-1,col2]-matrix[0,0~row2,col1-1]+matrix[0,0~row1-1,col1-1]