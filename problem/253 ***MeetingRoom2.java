import java.util.Arrays;
import java.util.PriorityQueue;

import com.apple.concurrent.Dispatch.Priority;

/*
 * Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],…] 
 * (si < ei), find the minimum number of conference rooms required.

Example 1:

Input: [[0, 30],[5, 10],[15, 20]]
Output: 2
Example 2:

Input: [[7,10],[2,4]]
Output: 1
NOTE: input types have been changed on April 15, 2019. Please reset to default code definition to 
get new method signature.
 */

 class Solutioin{
  public int minMeetingRooms(int[][] intervals){
    Arrays.sort(intervals, (a,b)->a[0]-b[0]);

    PriorityQueue<int[]> queue = new PriorityQueue<>(
      intervals.length, (a,b)->(a[1]-b[1])
    );

    queue.offer(intervals[0]);
    int res =1;
    for(int i=1; i<intervals.length; i++){
      int[] curr = intervals[i];
      int[] preMeeting = queue.poll();
      if(curr[0]>=preMeeting[1]){
        preMeeting[1]=curr[1]
      }else{
        res++;
        queue.offer(curr);
      }
      queue.offer(preMeeting);
    }
    return res;
  }
 }