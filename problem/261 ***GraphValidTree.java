/*
 * Given n nodes labeled from 0 to n-1 and a list of undirected edges (each edge is a pair of nodes), 
 * write a function to check whether these edges make up a valid tree.

Example 1:

image tooltip here

Input: n = 5, and edges = [[0,1], [0,2], [0,3], [1,4]]
Output: true
Example 2:

image tooltip here

Input: n = 5, and edges = [[0,1], [1,2], [2,3], [1,3], [1,4]]
Output: false
Note: you can assume that no duplicate edges will appear in edges. Since all edges are undirected, [0,1] 
is the same as [1,0] and thus will not appear together in edges.
 */
class Solution{
  public class UnionFind{
    int[] parents;
    int[] ranks;

    public UnionFind(int n){
      parents = new int[n];
      ranks   = new int[n];

      for(int i=0; i<n; i++){
        parents[i] = i;
        ranks[i] = 1;
      }
    }

    public boolean union(int x, int y){
      int xParent = find(x);
      int yParent = find(y);

      if(xParent == yParent) return false;
      if(ranks[xParent]>ranks[yParent]){
        parents[yParent] = xParent;
      }else if(ranks[xParent]<ranks[yParent]){
        parents[xParent]= yParent;
      }else{
        parents[yParent]= xParent;
        ranks[xParent]++;
      }
      return true;
    }

    public int find(int node){
      int parentNode = parents[node];
      while(parentNode !=node){
        parentNode = parents[parentNode];
        parents[node] = parentNode;
        node = parentNode;
      }
      return node;
    }
  }
  UnionFind node;
  public boolean validTree(int n, int[][] edges) {
      // 注意孤立点
      // [0, 1], [2, 3] n = 4
      // 这种情况也不是树
      if(edges.length + 1 < n) return false;
      node = new UnionFind(n);

      for(int[] edge : edges){
          if(!node.union(edge[0], edge[1])){
              return false;
          }
      }

      return true;
  }
}