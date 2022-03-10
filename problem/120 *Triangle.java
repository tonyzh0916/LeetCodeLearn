import java.util.List;

class Solution {
  public int minimumTotal(List<List<Integer>> triangle) {
      for(int i=triangle.size()-2; i>=0; i--){
        List<Integer> curr = triangle.get(i);
        for(int j=0; j<=i; j++){
          int nextRow1 = triangle.get(i+1).get(j);
          int nextRow2 = triangle.get(i+1).get(j+1);

          curr.set(j, Math.min(nextRow1, nextRow2)+curr.get(j));
        }
      }
      return triangle.get(0).get(0);
  }
}
