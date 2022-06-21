import java.util.Arrays;

/*
 * Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],…] 
 * (si < ei), determine if a person could attend all meetings.

Example 1:

Input: [[0,30],[5,10],[15,20]]
Output: false
Example 2:

Input: [[7,10],[2,4]]
Output: true
NOTE: input types have been changed on April 15, 2019. Please reset to default code definition to 
get new method signature.
 */
 class Solutioin{
  public boolean canAttendMeeting(int[][] intervals){
    Arrays.sort(intervals, (a,b)->a[0]-b[0]);
    int lastEnd = -1;

    for(int[] inter: intervals){
      if(inter[0]<lastEnd){
        return false;
      }
      lastEnd = inter[1];
    }
    return true;
  }
 }