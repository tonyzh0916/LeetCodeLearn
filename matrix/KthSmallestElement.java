/*leetcode 378

Given an n x n matrix where each of the rows and columns are sorted in ascending order, return the kth 
smallest element in the matrix.
Note that it is the kth smallest element in the sorted order, not the kth distinct element.

Example 1:
Input: matrix = [[1,5,9],[10,11,13],[12,13,15]], k = 8
Output: 13
Explanation: The elements in the matrix are [1,5,9,10,11,12,13,13,15], and the 8th smallest number is 13
Example 2:

Input: matrix = [[-5]], k = 1
Output: -5
 
Constraints:
n == matrix.length
n == matrix[i].length
1 <= n <= 300
-109 <= matrix[i][j] <= 109
All the rows and columns of matrix are guaranteed to be sorted in non-decreasing order.
1 <= k <= n2
*/

class  MatrixTuple implements Comparable<MatrixTuple>{
  int x, y, val;

  public MatrixTuple(int x, int y, int val){
    this.x=x;
    this.y=y;
    this.val=val;
  }

  @Override
  public int compareTo(MatrixTuple other){
    return Integer.compare(this.val, other.val);
  }

  @Override
  public String toString(){
    return "MatrixTuple "
  }
}

public int kthSmallest(int[][] matrix, int k){
  int m = matrix.length, n= matrix[0].length;
  PriortyQueue<MatrixTuple> q = new PriortyQueue<>();

  int x=0, y=0;
  for(;y<n;y++){
    q.offer(new MatrixTuple(x,y,matrix[x][y]));
  }

  for(int i=0; i<k-1;i++){
    MatrixTuple t = q.poll();
    x=t.x;
    y=t.y;
    if(x==m-1){
      continue;
    }
    q.offer(new MatrixTuple(x+1, y, matrix[x+1][y]));
  }
  return q.poll().val;
}