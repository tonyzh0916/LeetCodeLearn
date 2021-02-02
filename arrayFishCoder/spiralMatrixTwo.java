class Solution {
  public int[][] generateMatrix(int n) {
    int[][] matrix = new int[n][n];

    if(n==0) return matrix;

    int top=0;
    int bottom = n-1;
    int left=0;
    int right = n-1;
    int num = 1;
    while(top<=bottom && left<=right){
      for(int i=left; i<=right; i++){
        matrix[top][i]=num++;
      }
      top++;
      for(int j=top; j<=bottom;j++){
        matrix[j][right]=num++;
      }
      right--;
      for(int i=right; i>=left ;i--){
        matrix[bottom][i]=num++;
      }
      bottom--;
      for(int j=bottom; j>=top;j--){
        matrix[j][left]=num++;
      }
      left++;
    }
    return matrix;
  }
}