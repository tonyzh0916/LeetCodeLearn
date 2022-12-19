int[][] dirs  ={{0,1},{1,0},{-1,0},{0,-1}};

public int[][] updateMatrix (int[][] matrix){
  int m = matrix.length, n=matrix[0].length;
  int[][] res = new int[m][n];

  boolean[][] visited = new boolean[m][n];
  Queue<int[]> queue = new LinkedList<>();

  for(int i = 0; i<m;i++){
    for(int j=0; j<n; j++){
      if(matrix[i][j]==0){
        queue.offer(new int[]{i, j});
        visited[i][j]=true;
      }
    }
  }

}