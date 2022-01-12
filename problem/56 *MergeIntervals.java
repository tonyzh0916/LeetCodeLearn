import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
  public int[][] merge(int[][] intervals) {
      if(intervals == null || intervals.length==0) return intervals;
      List<int[]> res = new ArrayList<>();
      Arrays.sort(intervals, (a, b)->(a[0]-b[0]));
      int[] curr = intervals[0];
      for(int i=1; i<intervals.length; i++){
        if(intervals[i][0]>curr[1]){
          res.add(curr);
          curr = intervals[i];
        }else{
          curr[1] = Math.max(curr[1], intervals[i][1]);
        }
      }
      res.add(curr);
      return res.toArray(new int[res.size()][2]);

  }
}

//1/112022 practice 
class Solution{
  public int[][] merge(int[][] intervals){
    if(intervals == null || intervals.length==0) return intervals;
    List<int[]> res = new ArrayList<>();
    int[] curr = intervals[0];
    for(int i=0; i<intervals.length; i++){
      if(intervals[i][0]>curr[1]){
        res.addd(curr);
        curr = intervals[i];
      }else{
        curr[1]= Math.max(curr[1], intervals[i][1]);
      }
    }
    res.add(curr);
    return res.toArray(new int[res.size()[2]]);
  }
}
