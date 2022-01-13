class Solution {
  public int[][] insert(int[][] intervals, int[] newInterval) {
      List<int[]> list = new ArrayList<>();
      int i =0;
      while(i<intervals.length && intervals[i][1]<newInterval[0]){
        list.add(new int[]{intervals[i][0], intervals[i][1]});
        i++;
      }
      while(i<intervals.length && intervals[i][0]<=newInterval[1]){
        newInterval[0]=Math.min(intervals[i][0], newInterval[0]);
        newInterval[1]=Math.max(intervals[i][1], newInterval[1]);
        i++;
      }
      list.add(new int[]{newInterval[0], newInterval[1]});

      while(i<intervals.length){
        list.add(new int[]{intervals[i][0], intervals[i][1]});
        i++;      
      }

      return list.toArray(new int[list.size()][2]);
  }
}

// 1/12/2021 
class Solution{
  public int[][] insert (int[][] intervals, int[] newInterval){
    List<int[]> list = new ArrayList<>();
    int i=0;
    while(i<intervals.length && intervals[i][1]<newInterval[0]){
      list.add(new int[]{intervals[i][0], intervals[i][1]});
      i++;
    }
    while(i<intervals.length && intervals[i][0]<=newInterval[1]){
      newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
      newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
      i++;
    }
    list.add(new iint[]{newInterval[0], newInterval[1]});
    while(i<intervals.length){
      list.add(new int[]{intervals[i][0], intervals[i][1]});
      i++;
    }
    return list.toArray(new int[list.size()][2]);
  }
}